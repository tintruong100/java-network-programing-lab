package Ex1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class JugglerApplet extends Applet {
    JugglerBean juggler;
    Button startBtn, stopBtn, fasterBtn, slowerBtn;

    @Override
    public void init() {
        setLayout(new BorderLayout());

        juggler = new JugglerBean();
        add(juggler, BorderLayout.CENTER);

        Panel panel = new Panel();
        startBtn = new Button("Start");
        stopBtn = new Button("Stop");
        fasterBtn = new Button("Faster");
        slowerBtn = new Button("Slower");

        panel.add(startBtn);
        panel.add(stopBtn);
        panel.add(fasterBtn);
        panel.add(slowerBtn);

        add(panel, BorderLayout.SOUTH);

        // Gán sự kiện
        startBtn.addActionListener(e -> juggler.startJuggling());
        stopBtn.addActionListener(e -> juggler.stopJuggling());
        fasterBtn.addActionListener(e -> juggler.increaseSpeed());
        slowerBtn.addActionListener(e -> juggler.decreaseSpeed());
    }
}
