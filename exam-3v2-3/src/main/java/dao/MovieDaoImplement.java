package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.AllArgsConstructor;
import model.Movie;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class MovieDaoImplement implements Dao<Movie, Long> {
    private final EntityManager entityManager;

    @Override
    public Optional<Movie> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Movie.class, id));
    }

    @Override
    public List<Movie> findAll() {
        String query = "SELECT m FROM Movie m";
        return entityManager.createQuery(query, Movie.class).getResultList();
    }

    @Override
    public void save(Movie movie) {
        executeOrder(() -> {
            entityManager.merge(movie);
        });
    }

    @Override
    public void deleteById(Long id) {
        executeOrder(() -> {
            entityManager.createQuery("DELETE FROM Rental r WHERE r.movie.id = :id").setParameter("id", id).executeUpdate();
            entityManager.flush();
            entityManager.clear();
            Movie movie = entityManager.find(Movie.class, id);
            if (movie == null) {
                throw new IllegalArgumentException("Movie not found!");
            }
            entityManager.remove(movie);
        });
    }

    private void executeOrder(Runnable runnable) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        runnable.run();
        entityTransaction.commit();
    }
}
