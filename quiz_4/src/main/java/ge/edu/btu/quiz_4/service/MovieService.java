package ge.edu.btu.quiz_4.service;

import ge.edu.btu.quiz_4.dto.*;

public interface MovieService {
    AddMovieOutput addMovie(AddMovieInput addMovieInput);

    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);

    GetMoviesOutput getMovies();

    GetMovieOutput getMovie(GetMovieInput getMovieInput);
}