package cric.tp12;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/15 15:39:09
 */
public class ThreadTest extends Thread {
    public String name;

    public ThreadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                System.out.println(this.name + ":" + i + "\t");
                this.sleep(1000);

            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
