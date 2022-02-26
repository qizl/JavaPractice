package corejavavolumn1.chapter6;

public class Person {
    public String lastName;
    public String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getName() {
        return this.lastName + " " + this.firstName;
    }
}
