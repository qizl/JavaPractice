package corejavavolumn1.chapter6.proxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/03/03 12:22:21
 */
public class ProxyTest {
    public static void test() {
        var elements = new Object[1000];
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            var handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Comparable.class}, handler);
            elements[i] = proxy;
        }
        Integer key = new Random().nextInt(elements.length) + 1;
        int result = Arrays.binarySearch(elements, key);
        if (result >= 0)
            System.out.println(elements[result]);
    }
}
