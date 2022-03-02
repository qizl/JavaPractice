package corejavavolumn1.chapter6;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/24 11:23:11
 */
public class LambdaTest {
    public void testComparator() {
        Comparator<String> d = (a, b) -> a.length() - b.length();
        var r = d.compare("123123", "3456");
        this.log(Integer.toString(r));
    }

    public void testListRemove() {
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.removeIf(m -> m > 3);
    }

    public void testFunction() {
        this.repeat(10, () -> this.log("hello world!"));
    }

    private void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) action.run();
    }

    public void testComparing() {
        var list = new Person[4];
        list[0] = new Person("l1", "f1");
        list[1] = new Person("l333", "f333");
        list[2] = new Person("l22", "f22");
        list[3] = new Person(null, null);
//        Arrays.sort(list, Comparator.comparing(Person::getName));
//        Arrays.sort(list, Comparator.comparing(Person::getName).reversed());
//        Arrays.sort(list, Comparator.comparing(Person::getName, (s1, s2) -> Integer.compare(s1.length(), s2.length())));
//        Arrays.sort(list, Comparator.comparing(Person::getName, comparingInt(String::length)));
//        Arrays.sort(list, Comparator.comparingInt(p -> p.getName().length()));
//        Arrays.sort(list, comparing(Person::getFirstName, nullsFirst(naturalOrder())));
        Arrays.sort(list, comparing(Person::getFirstName, nullsFirst(reverseOrder())));
    }

    public void getClassName() {
        this.log("class name is " + getClass());
    }

    public static void getStaticClassName() {
        System.out.println("class name is " + new Object() {}.getClass().getEnclosingClass());
    }

    private void log(String str) {
        System.out.println(str);
    }
}
