package service;

import model.Movie;
import repository.MovieRepository;
import java.util.List;

public class MovieService {
    private final MovieRepository repository;

    // Inyección de dependencias (recibe el repositorio)
    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public void registerMovie(String title, String director, String genre, Integer durationMinutes) {
        // Aquí iría la lógica de negocio (validaciones, etc.) antes de guardar
        Movie movie = new Movie(null, title, director, genre, durationMinutes);
        repository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
