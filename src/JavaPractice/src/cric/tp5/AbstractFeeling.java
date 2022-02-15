package cric.tp5;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/15 14:50:17
 */
public abstract class AbstractFeeling implements Feeling {
    @Override
    public void happy() {
        System.out.println("I'm very happy");
    }

    @Override
    public void sad() {
        System.out.println("I'm very sad");
    }

    @Override
    public void angry() {
        System.out.println("I'm very sad");
    }
}
