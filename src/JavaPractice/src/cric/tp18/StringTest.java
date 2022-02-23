package cric.tp18;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/23 14:29:21
 */
public class StringTest {
    public void test() {
        String s1 = "此处需与注册的metadata.xml中entityID值相同";
        this.log(s1.substring(1, 3));
        this.log(s1.substring(3));
        this.log(s1.split("xml")[0]);
        this.log(Integer.toString(s1.length()));
        this.log(Integer.toString(s1.indexOf("xml")));

        StringBuffer sb = new StringBuffer(); // 非线程安全
        sb.append("abc");
        sb.append(123);
        this.log(sb.toString());

        StringBuilder sb1 = new StringBuilder(); // 线程安全
        sb1.append("abc");
        sb1.append(123);
        this.log(sb1.toString());

        int i = Integer.parseInt("123");
        int i1 = Integer.valueOf("123");
        String s = String.valueOf(i);
    }

    private void log(String content) {
        System.out.println(content);
    }
}
