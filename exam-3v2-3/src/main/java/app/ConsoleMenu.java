package app;

import dao.Dao;
import dao.MovieDaoImplement;
import dao.RentalDaoImplement;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Movie;
import model.Rental;
import service.MovieCRUDService;
import service.RentalCRUDService;

import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("video_rental");
    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();
    private static final Dao rentalDao = new RentalDaoImplement(entityManager);
    private static final Dao movieDao = new MovieDaoImplement(entityManager);
    private static final MovieCRUDService movieCRUDService = new MovieCRUDService(movieDao);
    private static final RentalCRUDService rentalCRUDService = new RentalCRUDService(rentalDao, movieDao);
    private static final Scanner scanner = new Scanner(System.in);

    static void start() throws Throwable {
        while (true) {
            System.out.print("=== Movie Rental Menu ===\n" +
                    "1 - Add movie\n" +
                    "2 - List all movies\n" +
                    "3 - Update movie\n" +
                    "4 - Delete movie by id\n" +
                    "5 - New rental\n" +
                    "6 - List all rental\n" +
                    "7 - Update rental\n" +
                    "8 - Delete rental by id\n" +
                    "9 - Exit\n");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case 1 -> addMovie();
                case 2 -> getAllMovies();
                case 3 -> updateMovie();
                case 4 -> deleteMovie();
                case 5 -> rentalMovie();
                case 6 -> getAllRentals();
                case 7 -> updateRental();
                case 8 -> deleteRental();
                case 9 -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid number!");
            }
        }
    }

    private static void addMovie() {
        System.out.println("Enter movie name:");
        String movieName = scanner.nextLine();
        while (!movieName.matches("^[A-Za-z 0-9]+$")) {
            System.out.println("Invalid input! Movie name must contain only letters!");
            System.out.println("Enter movie name:");
            movieName = scanner.nextLine();
        }
        System.out.println("Enter movie genre:");
        String genre = scanner.nextLine();
        while (!genre.matches("^[A-Za-z ]+$")) {
            System.out.println("Invalid input! Movie genre must contain only letters!");
            System.out.println("Enter movie genre:");
            genre = scanner.nextLine();
        }
        Movie movie = Movie.builder()
                .title(movieName)
                .genre(genre)
                .available(true)
                .build();
        try {
            movieCRUDService.addMovie(movie);
            System.out.println("Movie added successfully!");
        } catch (Exception e) {
            System.out.println("Movie addition failed: " + e.getMessage());
        }
    }

    private static void getAllMovies() {
        List<Movie> movies = movieCRUDService.getAllMovies();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void updateMovie() {
        System.out.println("Enter movie id:");
        Long id = Long.valueOf(scanner.nextLine());
        while (id < 1) {
            System.out.println("Invalid input! Movie id must be a positive number!");
            System.out.println("Enter movie id:");
            id = scanner.nextLong();
        }
        scanner.nextLine();
        System.out.println("Enter movie title:");
        String title = scanner.nextLine();
        while (!title.matches("^[A-Za-z 0-9]+$")) {
            System.out.println("Invalid input! Movie title must contain only letters and numbers!");
            System.out.println("Enter movie title:");
            title = scanner.nextLine();
        }
        System.out.println("Enter movie genre:");
        String genre = scanner.nextLine();
        while (!genre.matches("^[A-Za-z ]+$")) {
            System.out.println("Invalid input! Movie genre must contain only letters!");
            System.out.println("Enter movie genre:");
            genre = scanner.nextLine();
        }
        Movie movie = Movie.builder()
                .id(id)
                .title(title)
                .genre(genre)
                .available(true)
                .build();
        try {
            movieCRUDService.updateMovie(movie);
            System.out.println("Movie updated successfully!");
        } catch (Exception e) {
            System.out.println("Movie update failed: " + e.getMessage());
        }
    }

    private static void rentalMovie() throws Throwable {
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        while (!customerName.matches("^[A-Za-z ]+$") || customerName.isEmpty()) {
            System.out.println("Invalid input! Customer name must contain only letters!");
            System.out.println("Enter customer name:");
            customerName = scanner.nextLine();
        }

        System.out.println("Enter movie id:");
        Long movieId = scanner.nextLong();
        while (movieId < 1) {
            System.out.println("Invalid input! Movie id must be a positive number!");
            System.out.println("Enter movie id:");
            movieId = scanner.nextLong();
        }
        scanner.nextLine();

        try {
            rentalCRUDService.rentalMovie(movieId, customerName);
            System.out.println("Rental added successfully!");
        } catch (Exception e) {
            System.out.println("Rental failed: " + e.getMessage());
        }
    }

    private static void getAllRentals() {
        List<Rental> rentals = rentalCRUDService.getAllRentals();
        for (Rental rental : rentals) {
            System.out.println(rental);
        }
    }

    private static void deleteMovie() {
        System.out.println("Enter movie id:");
        Long id = scanner.nextLong();
        while (id < 1) {
            System.out.println("Invalid input! Movie id must be a positive number!");
            System.out.println("Enter movie id:");
            id = scanner.nextLong();
        }
        scanner.nextLine()
        ;
        try {
            movieCRUDService.deleteMovie(id);
            System.out.println("Movie deleted successfully!");
        } catch (Exception e) {
            System.out.println("Movie deletion failed: " + e.getMessage());
        }

    }

    private static void updateRental() throws Throwable {
        System.out.println("Enter rental id:");
        Long id = scanner.nextLong();
        while (id < 1) {
            System.out.println("Invalid input! Rental id must be a positive number!");
            System.out.println("Enter rental id:");
            id = scanner.nextLong();
        }
        scanner.nextLine();

        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        while (!customerName.matches("^[A-Za-z ]+$")) {
            System.out.println("Invalid input! Customer name must contain only letters!");
            System.out.println("Enter customer name:");
            customerName = scanner.nextLine();
        }

        System.out.println("Enter movie id:");
        Long movieId = scanner.nextLong();
        while (movieId < 1) {
            System.out.println("Invalid input! Movie id must be a positive number!");
            System.out.println("Enter movie id:");
            movieId = scanner.nextLong();
        }
        scanner.nextLine();

        Movie movie = (Movie) movieDao.findById(movieId).orElseThrow();

        Rental rental = Rental.builder()
                .id(id)
                .customerName(customerName)
                .movie(movie)
                .build();
        try {
            rentalCRUDService.updateRental(rental);
            System.out.println("Rental updated successfully!");
        } catch (Exception e) {
            System.out.println("Rental update failed: " + e.getMessage());
        }
    }

    private static void deleteRental() {
        System.out.println("Enter rental id:");
        Long id = scanner.nextLong();
        while (id < 1) {
            System.out.println("Invalid input! Rental id must be a positive number!");
            System.out.println("Enter rental id:");
            id = scanner.nextLong();
        }
        try {
            rentalCRUDService.deleteRental(id);
            System.out.println("Rental deleted successfully!");
        } catch (Exception e) {
            System.out.println("Rental deletion failed: " + e.getMessage());
        }
    }
}
