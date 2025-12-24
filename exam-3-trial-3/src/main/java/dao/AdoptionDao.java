package dao;

import model.Adoption;

import java.util.List;
import java.util.Optional;

public interface AdoptionDao {
    Optional<Adoption> findById(Long id);

    List<Adoption> findAll();

    void save(Adoption adoption);

    void delete(Long id);
}
