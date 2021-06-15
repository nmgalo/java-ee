package ge.edu.btu.database.controllers;

import ge.edu.btu.database.model.Post;
import ge.edu.btu.database.model.Student;
import ge.edu.btu.database.repository.PostRepository;
import ge.edu.btu.database.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PostRepository postRepository;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/create")
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/posts")
    public Iterable<Post> getPosts() {
        return postRepository.findAll();
    }

}
