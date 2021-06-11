import java.io.Console;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        part3Read();
    }

    static void part1() {
        var greeting = "Welcome to Core Java!";
        System.out.println(greeting);
    }

    static void part3() {
        String greeting = "Welcome to Core Java!";
//        greeting = greeting.repeat(3);

        var strs = new String[]{
                greeting, greeting, greeting
        };
        System.out.println(String.join("\r\n", strs));
    }

    static void part3Read() {
        var in = new Scanner(System.in);

        System.out.print("what is your name?");
        var name = in.nextLine();

        System.out.print("how old are you?");
        int age = in.nextInt();

        System.out.print("hello, " + name + ". next year, you'll be " + (age + 1));
    }

    static void part3ReadPassword() {
        var cons = System.console();
        var userName = cons.readLine("User Name:");
        var password = cons.readPassword("Password");
    }
}
