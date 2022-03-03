package corejavavolumn1.chapter6.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/03/03 12:18:45
 */
public class TraceHandler implements InvocationHandler {
    private Object target;

    public TraceHandler(Object t) {
        this.target = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("." + method.getName() + "(");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1)
                    System.out.print(", ");
            }
        }
        System.out.println(")");

        return method.invoke(target, args);
    }
}
