package service;

import dao.Dao;
import lombok.AllArgsConstructor;
import model.Movie;

import java.util.List;

@AllArgsConstructor
public class MovieCRUDService {
    private Dao movieDao;

    public void addMovie(Movie movie) {
        movieDao.save(movie);
    }

    public void updateMovie(Movie movie) {
        movieDao.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieDao.findAll();
    }

    public void deleteMovie(Long id) {
        movieDao.deleteById(id);
    }
}
