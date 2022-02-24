package corejavavolumn1.chapter3;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/24 10:39:55
 */
public class SwitchTest {
    public void test(int i) {
        switch (i) {
            case 1:
                this.log("this is 1!");
                break;
            case 2:
                this.log("it's 2!");
                break;
            default:
                this.log("a bigger number:" + i + ".");
                break;
        }
    }

    private void log(String str) {
        System.out.println(str);
    }
}
