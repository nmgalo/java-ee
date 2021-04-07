package ge.edu.btu.web_services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/student-manager")
public class StudentController {

    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Nick", 12));
        studentList.add(new Student(2, "Zura", 45));
        return studentList;
    }

    @POST
    @Path("/add-student")
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerUser(Student student) {
        System.out.println(student.toString());
    }

    @GET
    @Path("/student/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudentById(@PathParam("id") int id) {
        return new Student(id, "Nick", 19);
    }

}
