package ge.edu.btu.nika_mgaloblishvili.quiz_1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/submit-application"})
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println(
                "name=" + req.getParameter("name") +
                        ";race=" + req.getParameter("race") +
                        ";gender=" + req.getParameter("gender") +
                        ";age=" + req.getParameter("age")
        );
    }


}
