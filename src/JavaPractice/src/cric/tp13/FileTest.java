package cric.tp13;

import util.DateTimeUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/17 15:33:43
 */
public class FileTest {
    public void copyFile() {
        FileInputStream streamIn = null;
        FileOutputStream streamOut = null;
        File fileIn = new File("doc\\test\\money.jpg");
        File fileOut = new File("doc\\test\\money1.jpg");
//        if (fileOut.exists())
//            fileOut.delete();
        try {
            streamIn = new FileInputStream(fileIn);
            streamOut = new FileOutputStream(fileOut);
            int b = streamIn.read();
            while (b != -1) {
                streamOut.write(b);
                b = streamIn.read();
            }
        } catch (Exception e) {
        } finally {
            try {
                if (streamIn != null) streamIn.close();
                if (streamOut != null) streamOut.close();
            } catch (Exception eInner) {
                eInner.printStackTrace();
            }
        }
    }

    public void writeText(File file, String text) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(DateTimeUtil.getDateTimeNow() + ":" + text + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (Exception eInner) {
                eInner.printStackTrace();
            }
        }
    }
}
