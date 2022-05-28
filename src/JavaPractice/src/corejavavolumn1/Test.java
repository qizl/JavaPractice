package corejavavolumn1;

import corejavavolumn1.chapter8.ArrayAlg;
import corejavavolumn1.chapter8.Pair;

import java.time.LocalDate;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/24 10:36:32
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // chapter3
        //var test = new SwitchTest();
        //test.test(3);
        //
        //var test = new IntegerCacheTest();
        //test.compareNumber();
        //IntegerCacheTest.cache();

        // chapter6
        //var test = new LambdaTest();
        //test.testComparator();
        //test.testListRemove();
        //test.testFunction();
        //test.testComparing();
        //
        //test.getClassName();
        //LambdaTest.getStaticClassName();

        //var clock = new TalkingClock(1000, true);
        //TalkingClock.TimePrinter listener = clock.new TimePrinter();
        ////clock.start();
        ////clock.innerStart();
        ////clock.anonymousStart();
        //clock.lambdaStart();
        //
        //var in = new Scanner(System.in);
        //System.out.println("just wait...");
        //var input = in.nextLine();
        //System.out.println("exit with " + input);
        //
        //var d = new double[3];
        //d[0] = 2;
        //d[1] = 1;
        //d[2] = 3;
        //var r = ArrayAlg.minMax(d);
        //
        //CipherLoader.test();
        //
        //ProxyTest.test();

        // chapter8
        // chapter3
        //var test = new SwitchTest();
        //test.test(3);
        //
        //var test = new IntegerCacheTest();
        //test.compareNumber();
        //IntegerCacheTest.cache();

        // chapter6
        //var test = new LambdaTest();
        //test.testComparator();
        //test.testListRemove();
        //test.testFunction();
        //test.testComparing();
        //
        //test.getClassName();
        //LambdaTest.getStaticClassName();
        //
        //var clock = new TalkingClock(1000, true);
        //TalkingClock.TimePrinter listener = clock.new TimePrinter();
        ////clock.start();
        ////clock.innerStart();
        ////clock.anonymousStart();
        //clock.lambdaStart();
        //
        //var in = new Scanner(System.in);
        //System.out.println("just wait...");
        //var input = in.nextLine();
        //System.out.println("exit with " + input);
        //
        //var d = new double[3];
        //d[0] = 2;
        //d[1] = 1;
        //d[2] = 3;
        //var r = ArrayAlg.minMax(d);
        //
        //CipherLoader.test();
        //
        //ProxyTest.test();

        // chapter8
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minMax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        //String middle = ArrayAlg.<String>getMiddle(words);
        String middle = ArrayAlg.getMiddle(words);
        System.out.println("middle = " + middle);

        LocalDate[] birthdays = {
                LocalDate.of(1986, 12, 9),
                LocalDate.of(1815, 12, 10),
                LocalDate.of(1903, 12, 3),
                LocalDate.of(1910, 6, 22),
        };
        Pair<LocalDate> mm1 = ArrayAlg.minMax1(birthdays);
        System.out.println("min = " + mm1.getFirst());
        System.out.println("max = " + mm1.getSecond());
    }
}
