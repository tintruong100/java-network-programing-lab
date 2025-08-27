package Ex5;

import java.awt.*;

public class Ball extends Thread {
	Panel box;
	int x = 0, y = 0;
	int dx = 2, dy = 2;

	public Ball(Panel p) {
		box = p;
	}

	public void draw() {
		Graphics g = box.getGraphics();
		g.fillOval(x, y, 10, 10);
		g.dispose();
	}

	public void move() {
		if (!box.isVisible())
			return;
		Graphics g = box.getGraphics();
		g.setXORMode(box.getBackground());
		g.fillOval(x, y, 10, 10);
		x += dx;
		y += dy;
		Dimension d = box.getSize();
		if (x < 0) {
			x = 0;
			dx = -dx;
		}
		if (x + 10 >= d.width) {
			x = d.width - 10;
			dx = -dx;
		}
		if (y < 0) {
			y = 0;
			dy = -dy;
		}
		if (y + 10 >= d.height) {
			y = d.height - 10;
			dy = -dy;
		}
		g.fillOval(x, y, 10, 10);
		g.dispose();
	}

	public void run() {
		try {
			draw();
			for (int i = 1; i <= 1000; i++) {
				move();
				sleep(5);
			}
		} catch (InterruptedException e) {
		}
	}
}
