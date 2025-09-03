package Ex3;

import java.awt.*;
import java.awt.event.*;

public class BallBounceFrame extends Frame {
    Panel canvas;
    Ball b;

    public BallBounceFrame() {
        setTitle("Ball Bouncing");
        setSize(450, 450);
        setLocation(300, 200);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        canvas = new Panel();
        canvas.setSize(450, 450);  
        add(canvas, "Center");

        Panel p = new Panel();
        Button start = new Button("Start");
        Button pause = new Button("Pause");
        Button resume = new Button("Continue");
        Button close = new Button("Close");

        p.add(start);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b == null) { 
                    b = new Ball(canvas);
                    b.start();  
                }
            }
        });

        p.add(pause);
        pause.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b != null) {
                    b.pauseBall();  
                }
            }
        });

        p.add(resume);
        resume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b != null) {
                    b.resumeBall(); 
                }
            }
        });

        p.add(close);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                canvas.setVisible(false);
                System.exit(0);
            }
        });

        add(p, "South");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (b != null) {
            b.drawBall(g); 
        }
    }
}
