package ge.edu.btu.quiz_4.service.impl;

import ge.edu.btu.quiz_4.dto.*;
import ge.edu.btu.quiz_4.model.Movie;
import ge.edu.btu.quiz_4.repository.MovieRepository;
import ge.edu.btu.quiz_4.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());
        try {
            movie.setData(addMovieInput.getData().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        movieRepository.save(movie);

        AddMovieOutput addMovieOutput = new AddMovieOutput();
        addMovieOutput.setStatus("Created Successfully.");
        return addMovieOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Optional<Movie> movie = movieRepository.findById(deleteMovieInput.getId());
        movie.ifPresent(value -> movieRepository.delete(value));

        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setStatus("Deleted Successfully.");
        return deleteMovieOutput;
    }

    @Override
    public GetMoviesOutput getMovies() {
        List<MovieDTO> movies = new ArrayList<>();

        for (Movie movie : movieRepository.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movies.add(movieDTO);
        }

        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        getMoviesOutput.setMovies(movies);
        return getMoviesOutput;
    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepository.getById(getMovieInput.getId());

        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setId(movie.getId());
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());

        return getMovieOutput;
    }
}