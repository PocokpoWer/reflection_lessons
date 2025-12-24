package dao;

import model.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalDao {
    Optional<Animal> findById(Long id);

    List<Animal> findAll();

    void save(Animal animal);

    void delete(Long id);
}
