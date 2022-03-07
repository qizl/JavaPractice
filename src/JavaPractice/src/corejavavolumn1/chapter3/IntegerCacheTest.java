package corejavavolumn1.chapter3;

import java.lang.reflect.Field;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @reference https://mp.weixin.qq.com/s/2kjGfAy8gtXLPV_DCS39eA
 * @since 2022/03/04 09:39:34
 */
public class IntegerCacheTest {
    public void compareNumber() {
        Integer a = 1000, b = 1000;
        System.out.println(a == b);
        System.out.println(1000 == 1000);
        Integer c = 100, d = 100;
        System.out.println(c == d);
    }

    public static void cache() throws NoSuchFieldException, IllegalAccessException {
        try {
            Class cache = Integer.class.getDeclaredClasses()[0]; //1
            Field myCache = cache.getDeclaredField("cache"); //2
            myCache.setAccessible(true);//3

            Integer[] newCache = (Integer[]) myCache.get(cache); //4
            newCache[132] = newCache[133]; //5
        } catch (Exception e) {
            e.printStackTrace();
        }

        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
    }
}
