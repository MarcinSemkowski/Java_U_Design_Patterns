package Visitor.transport;

public class Person {

    private String firstName;
    private String lastName;
    private boolean isReqularCustomer;


    public Person(String fristName, String lastName, boolean isRegularCustomer) {
        this.firstName = fristName;
        this.lastName = lastName;
        this.isReqularCustomer = isRegularCustomer;
    }

    public String getFristName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRegularCustomer() {
        return isReqularCustomer;
    }

}
