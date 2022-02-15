package cric.tp12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/15 16:05:42
 */
public class DateFormatTest {
    public void simpleDateFormat() {
        var sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("SimpleDateFormat：" + sdf.format(new Date()));
    }

    public void dateFomart() {
//        var df = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        var df = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        System.out.println("DateFormat：" + df.format(new Date()));
    }
}
