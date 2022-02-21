package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/17 16:01:47
 */
public class DateTimeUtil {
    public static String getDateTimeNow() {
        return getDateTime(new Date());
    }

    public static String getDateTime(Date date) {
        if (date == null) return "-";
        else return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
}
