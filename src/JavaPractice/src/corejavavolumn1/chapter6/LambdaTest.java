package corejavavolumn1.chapter6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

    private void log(String str) {
        System.out.println(str);
    }
}
