package cric.tp4;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/15 13:59:04
 */
public class Child extends Parent
{
    int age;

    public Child(int no, String name, int age)
    {
        super(no, name);
        this.age = age;
    }

    public void printChild(){
        super.print();
        System.out.println(age);
    }
}
