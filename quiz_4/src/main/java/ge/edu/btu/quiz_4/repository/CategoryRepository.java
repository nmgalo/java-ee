package ge.edu.btu.quiz_4.repository;

import ge.edu.btu.quiz_4.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
