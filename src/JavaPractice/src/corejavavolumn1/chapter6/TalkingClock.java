package corejavavolumn1.chapter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.AttributedCharacterIterator;
import java.time.Instant;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/28 17:08:05
 */
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        var listener = new TimePrinter();
        var timer = new Timer(this.interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
//            if(TalkingClock.this.beep)
        }
    }

    public void innerStart() {
        class TimePrinterInner implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("(Inner)At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }

        var listener = new TimePrinterInner();
        var timer = new Timer(this.interval, listener);
        timer.start();
    }

    public void anonymousStart() {
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("(Anonymous)At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        var timer = new Timer(this.interval, listener);
        timer.start();
    }

    public void lambdaStart() {
        var timer = new Timer(this.interval, e -> {
            System.out.println("(Lambda)At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
    }
}
