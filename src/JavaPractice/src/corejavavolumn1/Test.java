package corejavavolumn1;

import corejavavolumn1.chapter6.ArrayAlg;
import corejavavolumn1.chapter6.LambdaTest;
import corejavavolumn1.chapter6.TalkingClock;
import corejavavolumn1.chapter6.serviceLoader.Cipher;
import corejavavolumn1.chapter6.serviceLoader.CipherLoader;

import java.util.Scanner;
import java.util.ServiceLoader;

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
//        var test = new SwitchTest();
//        test.test(3);

        // chapter6
//        var test = new LambdaTest();
//        test.testComparator();
//        test.testListRemove();
//        test.testFunction();
//        test.testComparing();
//
//        test.getClassName();
//        LambdaTest.getStaticClassName();

//        var clock = new TalkingClock(1000, true);
//        TalkingClock.TimePrinter listener = clock.new TimePrinter();
////        clock.start();
////        clock.innerStart();
////        clock.anonymousStart();
//        clock.lambdaStart();
//
//        var in = new Scanner(System.in);
//        System.out.println("just wait...");
//        var input = in.nextLine();
//        System.out.println("exit with " + input);

//        var d = new double[3];
//        d[0] = 2;
//        d[1] = 1;
//        d[2] = 3;
//        var r = ArrayAlg.minMax(d);

        CipherLoader.test();
    }
}
