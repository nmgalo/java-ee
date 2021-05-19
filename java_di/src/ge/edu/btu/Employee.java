package ge.edu.btu;

public class Employee {

    private Type type;

    public void setType(Type type) {
        this.type = type;
    }

    public void print() {
        type.print();
    }

}
