package ge.edu.btu.quiz_4.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class AddMovieInput {
    private String title;
    private String country;
    private MultipartFile data;
}