package ge.edu.btu.quiz_4.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String country;

    @Lob
    private byte[] data;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "category", joinColumns = @JoinColumn(name = "movies_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

}
