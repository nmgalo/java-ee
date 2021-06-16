package ge.edu.btu.quiz_4.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movies", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "movies_id"))
    private List<Movie> movies;
}
