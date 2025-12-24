package service;

import dao.AdoptionDao;
import dao.AnimalDao;
import lombok.AllArgsConstructor;
import model.Adoption;
import model.Animal;

import java.util.List;

@AllArgsConstructor
public class AdoptionCRUDService {
    private final AnimalDao animalDao;
    private final AdoptionDao adoptionDao;

    public Adoption getAdoptionById(Long adoptionId) {
        return adoptionDao.findById(adoptionId).orElseThrow();
    }

    public void createAdoption(Long animalId, String adopterName) {
        Animal animal = animalDao.findById(animalId).orElseThrow(() -> new RuntimeException("Animal not found"));
        Adoption adoption = Adoption.builder()
                .name(adopterName)
                .animal(animal)
                .build();
        adoptionDao.save(adoption);
    }

    public List<Adoption> listAllAdoption() {
        return adoptionDao.findAll();
    }

    public void deleteAdoption(Long adoptionId) {
        adoptionDao.delete(adoptionId);
    }
}
