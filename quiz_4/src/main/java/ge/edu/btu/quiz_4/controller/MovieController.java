package ge.edu.btu.quiz_4.controller;


import ge.edu.btu.quiz_4.dto.*;
import ge.edu.btu.quiz_4.service.CategoryService;
import ge.edu.btu.quiz_4.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    CategoryService categoryService;

    @PostMapping("/getMovies")
    public GetMoviesOutput getMovies() {
        return movieService.getMovies();
    }

    @PostMapping("/getMovie")
    public GetMovieOutput getMovie(@RequestBody GetMovieInput getMovieInput) {
        return movieService.getMovie(getMovieInput);
    }

    @PostMapping("/addMovie")
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        return movieService.addMovie(addMovieInput);
    }

    @PostMapping("/deleteMovie")
    public DeleteMovieOutput deleteMovie(@RequestBody DeleteMovieInput deleteMovieInput) {
        return movieService.deleteMovie(deleteMovieInput);
    }

    @PostMapping("/addCategory")
    public AddCategoryOutput addCategory(AddCategoryInput addCategoryInput) {
        return categoryService.addCategory(addCategoryInput);
    }

}
