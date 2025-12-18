package service;

import dao.Dao;
import lombok.AllArgsConstructor;
import model.Movie;
import model.Rental;

import java.util.List;

@AllArgsConstructor
public class RentalCRUDService {
    private Dao rentalDao;
    private Dao movieDao;

    public void rentalMovie(Long movieId, String customerName) throws Throwable {
        Movie movie = (Movie) movieDao.findById(movieId).orElseThrow(() -> new RuntimeException("Movie not found!"));
        if (!movie.isAvailable()) {
            throw new RuntimeException("Movie is not available!");
        }
        Rental rental = Rental.builder().customerName(customerName).movie(movie).build();
        movie.setAvailable(false);
        rentalDao.save(rental);
    }

    public List<Rental> getAllRentals() {
        return rentalDao.findAll();
    }

    public void updateRental(Rental rental) throws Throwable {
        Rental oldRental = (Rental) rentalDao.findById(rental.getId()).orElseThrow(() -> new RuntimeException("Rental not found!"));
        Movie oldMovie = oldRental.getMovie();
        oldMovie.setAvailable(true);

        Movie newMovie = rental.getMovie();
        newMovie.setAvailable(false);
        rentalDao.save(rental);
    }

    public void deleteRental(Long id) {
        rentalDao.deleteById(id);
    }
}
