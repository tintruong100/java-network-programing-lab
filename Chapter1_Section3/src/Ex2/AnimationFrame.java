package Ex2;

import java.awt.*;
import java.awt.event.*;

public class AnimationFrame extends Frame {
	private static final long serialVersionUID = 1L;
	Image[] img;
	MyThread v;

	public AnimationFrame(String s) {
		super(s);

		img = new Image[2];
		img[0] = Toolkit.getDefaultToolkit().getImage("T1.jpg");
		img[1] = Toolkit.getDefaultToolkit().getImage("T2.jpg");

		setBounds(300, 200, 450, 450);
		setLayout(new BorderLayout());

		Panel p = new Panel();
		Button start = new Button("Start");
		Button cancel = new Button("Pause");

		p.add(start);
		p.add(cancel);
		add(p, BorderLayout.SOUTH);

		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v == null) {
					v = new MyThread(AnimationFrame.this);
					v.start();
				} else if (v.isPaused()) {
					v.resumeAnimation();
				}
			}
		});

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v != null) {
					v.pauseAnimation();
				}
			}
		});

		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		if (v != null) {
			g.drawImage(img[v.i], 0, 20, 450, 450, this);
		}
	}
}
