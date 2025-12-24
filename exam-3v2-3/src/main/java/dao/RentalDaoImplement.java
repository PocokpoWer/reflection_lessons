package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.AllArgsConstructor;
import model.Movie;
import model.Rental;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class RentalDaoImplement implements Dao<Rental, Long> {
    private final EntityManager entityManager;

    @Override
    public Optional<Rental> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Rental.class, id));
    }

    @Override
    public List<Rental> findAll() {
        String query = "SELECT r FROM Rental r";
        return entityManager.createQuery(query, Rental.class).getResultList();
    }

    @Override
    public void save(Rental rental) {
        executeOrder(() -> {
            entityManager.merge(rental);
        });
    }

    @Override
    public void deleteById(Long id) {
        executeOrder(() -> {
            Rental rental = entityManager.find(Rental.class, id);
            if (rental == null) {
                throw new IllegalArgumentException("Rental not found!");
            }
            entityManager.remove(rental);
            Movie movie = rental.getMovie();
            movie.setAvailable(true);
        });
    }

    private void executeOrder(Runnable runnable) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        runnable.run();
        entityTransaction.commit();
    }
}
