package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.AllArgsConstructor;
import model.Adoption;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class AdoptionDaoImplement implements AdoptionDao {
    EntityManager entityManager;

    @Override
    public Optional<Adoption> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Adoption.class, id));
    }

    @Override
    public List<Adoption> findAll() {
        String query = "SELECT ad.id,ad.name,ad.animal FROM Adoption ad";
        return entityManager.createQuery(query, Adoption.class).getResultList();
    }

    @Override
    public void save(Adoption adoption) {
        executeOrder(() -> {
            entityManager.merge(adoption);
        });
    }

    @Override
    public void delete(Long id) {
        executeOrder(() -> {
            Adoption adoption = entityManager.find(Adoption.class, id);
            entityManager.remove(adoption);
        });
    }

    private void executeOrder(Runnable runnable) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        runnable.run();
        entityTransaction.commit();
    }
}
