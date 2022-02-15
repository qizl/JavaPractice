package cric.tp4;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/15 13:57:45
 */
public class Parent
{
    int no;
    String name;

    public Parent()
    {
    }

    public Parent(int no, String name)
    {
        this.no = no;
        this.name = name;
    }

    public void print()
    {
        System.out.println(no);
        System.out.println(name);
    }
}
