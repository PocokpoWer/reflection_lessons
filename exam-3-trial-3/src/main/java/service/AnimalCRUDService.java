package service;

import dao.AdoptionDao;
import dao.AnimalDao;
import lombok.AllArgsConstructor;
import model.Animal;

import java.util.List;

@AllArgsConstructor
public class AnimalCRUDService {
    private AnimalDao animalDao;
    private AdoptionDao adoptionDao;

    public Animal getAnimalById(Long animalId) {
        return animalDao.findById(animalId).orElseThrow();
    }

    public List<Animal> listAllAnimals() {
        return animalDao.findAll();
    }

    public void addNewAnimal(Animal animal) {
        animalDao.save(animal);
    }

    public void deleteAnimal(Long animalId) {
        animalDao.delete(animalId);
    }
}
