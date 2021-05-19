package ge.edu.btu;

public class Main {
    public static void main(String[] args) {

        Employee adminEmployee = new Employee();
        adminEmployee.setType(new Admin());
        adminEmployee.print();

        Employee userEmployee = new Employee();
        userEmployee.setType(new User());
        userEmployee.print();
    }
}
