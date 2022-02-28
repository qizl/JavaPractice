package corejavavolumn2.chapter8;

import org.jetbrains.annotations.NotNull;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/28 16:20:06
 */
public class Person {
    public String lastName;
    public String firstName;

    public Person(@NotNull String lastName, String firstName) {
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

    public static void test() {
        try {
            var person = new Person(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
