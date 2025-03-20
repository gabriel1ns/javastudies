package inheritance;

public class Employee extends Person {

    private String employeeID;
    private String title;

    public Employee() {
        super("Lins"); // how to run a specific constructor of the superclass, IT HAS TO BE THE FIRST LINE!!! of the subclass constructor.
        System.out.println("In employee default constructor");
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
