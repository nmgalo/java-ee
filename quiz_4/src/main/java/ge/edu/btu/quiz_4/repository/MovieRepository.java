package ge.edu.btu.quiz_4.repository;

import ge.edu.btu.quiz_4.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
