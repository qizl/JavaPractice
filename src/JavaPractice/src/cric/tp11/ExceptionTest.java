package cric.tp11;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/15 15:09:47
 */
public class ExceptionTest {
    public void throwAException() {
        var i = 1;
        try {
            var j = i / 0;
        } catch (Exception e) {
            System.out.println("Error:" + e);
            System.out.println("Message:");
            e.printStackTrace();

//            throw e;
        }
    }
}
