package repository;

import model.Movie;
import java.util.List;

public interface MovieRepository {
    void save(Movie movie);
    List<Movie> findAll();
}
