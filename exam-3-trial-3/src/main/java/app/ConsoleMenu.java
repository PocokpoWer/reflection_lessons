package app;

import dao.AdoptionDao;
import dao.AdoptionDaoImplement;
import dao.AnimalDao;
import dao.AnimalDaoImplement;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Animal;
import service.AdoptionCRUDService;
import service.AnimalCRUDService;

import java.util.Scanner;

public class ConsoleMenu {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("animals");
    private static final EntityManager entityManager = emf.createEntityManager();
    private static final AnimalDao animalDao = new AnimalDaoImplement(entityManager);
    private static final AdoptionDao adoptionDao = new AdoptionDaoImplement(entityManager);
    private static final Scanner scanner = new Scanner(System.in);
    private static final AnimalCRUDService animalService = new AnimalCRUDService(animalDao, adoptionDao);
    private static final AdoptionCRUDService adoptionService = new AdoptionCRUDService(animalDao, adoptionDao);

    static void start() {
        while (true) {
            System.out.print(
                    "Animal Adoption Center - CRUD Menu\n" +
                            "1 - Add a new animal\n" +
                            "2 - List all animals\n" +
                            "3 - Find animal by ID\n" +
                            "4 - Delete animal by ID\n" +
                            "5 - Record a new adoption\n" +
                            "6 - List all adoptions\n" +
                            "7 - Find adoption by ID\n" +
                            "8 - Delete adoption by ID\n" +
                            "9 - Exit\n" +
                            "Please choose an option:\n"
            );
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1 -> {
                    System.out.println("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter animal species: ");
                    String species = scanner.nextLine();
                    System.out.println("Enter animal age: ");
                    int age = scanner.nextInt();

                    Animal animal = Animal.builder()
                            .name(name)
                            .species(species)
                            .age(age).build();
                    scanner.nextLine();

                    animalService.addNewAnimal(animal);
                }
                case 2 -> animalService.listAllAnimals().forEach(System.out::println);
                case 3 -> {
                    System.out.println("Enter an animal id:");
                    System.out.println(animalService.getAnimalById(scanner.nextLong()));
                }
                case 4 -> {
                    System.out.println("Enter an animal id to delete:");
                    animalService.deleteAnimal(scanner.nextLong());
                }
                case 5 -> {
                    System.out.println("Enter an animal id:");
                    long animalId = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Enter an adoption name: ");
                    String adoptionName = scanner.nextLine();
                    adoptionService.createAdoption(animalId, adoptionName);
                }
                case 6 -> adoptionService.listAllAdoption().forEach(System.out::println);
                case 7 -> {
                    System.out.println("Enter an adoption id:");
                    System.out.println(adoptionService.getAdoptionById(scanner.nextLong()));
                    scanner.nextLine();
                }
                case 8 -> {
                    System.out.println("Enter an adoption id to delete:");
                    adoptionService.deleteAdoption(scanner.nextLong());
                }
                case 9 -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
