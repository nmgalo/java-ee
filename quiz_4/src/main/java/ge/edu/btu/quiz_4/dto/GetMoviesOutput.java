package ge.edu.btu.quiz_4.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOutput {
    private List<MovieDTO> movies;
}
