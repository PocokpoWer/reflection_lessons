package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.AllArgsConstructor;
import model.Animal;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class AnimalDaoImplement implements AnimalDao {
    private final EntityManager entityManager;

    @Override
    public Optional<Animal> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Animal.class, id));
    }

    @Override
    public List<Animal> findAll() {
        String query = "SELECT a.id,a.name,a.species,age FROM Animal a";
        return entityManager.createQuery(query, Animal.class).getResultList();
    }

    @Override
    public void save(Animal animal) {
        executeOrder(() -> {
            entityManager.merge(animal);
        });
    }

    @Override
    public void delete(Long id) {
        executeOrder(() -> {
            Animal animal = entityManager.find(Animal.class, id);
            entityManager.remove(animal);
        });
    }

    private void executeOrder(Runnable runnable) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        runnable.run();
        entityTransaction.commit();
    }
}