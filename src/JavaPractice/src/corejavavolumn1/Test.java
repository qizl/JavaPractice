package corejavavolumn1;

import corejavavolumn1.chapter6.LambdaTest;
import corejavavolumn1.chapter6.TalkingClock;

import java.util.Scanner;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/24 10:36:32
 */
public class Test {
    public static void main(String[] args) {
        // chapter3
//        var test = new SwitchTest();
//        test.test(3);

        // chapter6
        var test = new LambdaTest();
//        test.testComparator();
//        test.testListRemove();
//        test.testFunction();
//        test.testComparing();

        test.getClassName();
        LambdaTest.getStaticClassName();

//        var clock = new TalkingClock(1000, true);
//        TalkingClock.TimePrinter listener = clock.new TimePrinter();
//        clock.start();
//        clock.innerStart();
//        clock.anonymousStart();
//        clock.lambdaStart();
//
//        var in = new Scanner(System.in);
//        System.out.println("just wait...");
//        var input = in.nextLine();
//        System.out.println("exit with " + input);
    }
}
