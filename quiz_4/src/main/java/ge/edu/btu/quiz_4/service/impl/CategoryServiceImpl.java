package ge.edu.btu.quiz_4.service.impl;

import ge.edu.btu.quiz_4.dto.AddCategoryInput;
import ge.edu.btu.quiz_4.dto.AddCategoryOutput;
import ge.edu.btu.quiz_4.model.Category;
import ge.edu.btu.quiz_4.repository.CategoryRepository;
import ge.edu.btu.quiz_4.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public AddCategoryOutput addCategory(AddCategoryInput addCategoryInput) {
        Category category = new Category();
        category.setTitle(addCategoryInput.getTitle());
        categoryRepository.save(category);
        AddCategoryOutput addCategoryOutput = new AddCategoryOutput();
        addCategoryOutput.setStatus("Category Created");
        return addCategoryOutput;
    }

}
