package ge.edu.btu.quiz_4.service;

import ge.edu.btu.quiz_4.dto.AddCategoryInput;
import ge.edu.btu.quiz_4.dto.AddCategoryOutput;

public interface CategoryService {

    AddCategoryOutput addCategory(AddCategoryInput addCategoryInput);

}
