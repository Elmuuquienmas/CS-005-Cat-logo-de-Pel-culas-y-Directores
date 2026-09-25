package repository;

import model.Movie;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class MovieRepositoryImpl implements MovieRepository {
    // Lista en memoria para simular la base de datos de manera sencilla
    private final List<Movie> movies = new ArrayList<>();
    // Generador de IDs autoincremental
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public void save(Movie movie) {
        // Simulamos un autoincrement de la BD
        if (movie.getId() == null) {
            movie.setId(idGenerator.getAndIncrement());
        }
        movies.add(movie);
    }

    @Override
    public List<Movie> findAll() {
        // Retornamos una copia para proteger los datos internos
        return new ArrayList<>(movies);
    }
}
