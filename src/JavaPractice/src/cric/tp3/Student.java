package cric.tp3;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/15 12:32:38
 */
public class Student {
    int no;
    String name;
    int age;

    Student() {
        System.out.println("Student object is buildt!");
    }

    public Student(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(this.no);
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void addAge() {
        this.age++;
    }
}
