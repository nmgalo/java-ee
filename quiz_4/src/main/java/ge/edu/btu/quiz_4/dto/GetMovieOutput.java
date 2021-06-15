package ge.edu.btu.quiz_4.dto;

import lombok.Data;

@Data
public class GetMovieOutput {
    private Long id;
    private String title;
    private String country;
}