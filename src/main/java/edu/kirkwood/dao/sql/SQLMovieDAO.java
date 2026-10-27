package edu.kirkwood.dao.sql;

import edu.kirkwood.dao.MovieDAO;
import edu.kirkwood.dao.xml.MovieRepository;
import edu.kirkwood.model.sql.MovieEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SQLMovieDAO implements MovieDAO<MovieEntity> {
    private final MovieRepository movieRepository;

    public SQLMovieDAO(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieEntity> search(String title) {
        return movieRepository.findByTitleContainingIgnoreCase(title);
    }
}
