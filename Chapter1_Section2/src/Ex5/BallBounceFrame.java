package Ex5;

import java.awt.*;
import java.awt.event.*;

public class BallBounceFrame extends Frame {
	Panel canvas;

	public BallBounceFrame() {
		setTitle("Ball Bouncing");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		canvas = new Panel();
		add(canvas, "Center");
		Panel p = new Panel();
		Button start = new Button("Start");
		p.add(start);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ball b = new Ball(canvas);
				b.start();
			}
		});
		Button close = new Button("Close");
		p.add(close);
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.setVisible(false);
				System.exit(0);
			}
		});
		add(p, "South");
	}
}
