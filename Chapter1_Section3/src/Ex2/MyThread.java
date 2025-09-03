package Ex2;

public class MyThread extends Thread {
	public int i = 0;
	private AnimationFrame frame;
	private boolean running = true;
	private boolean paused = false;

	public MyThread(AnimationFrame frame) {
		this.frame = frame;
	}

	public void run() {
		while (running) {
			if (!paused) {
				i = (i + 1) % 2;
				frame.repaint();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	public void pauseAnimation() {
		paused = true;
	}

	public void resumeAnimation() {
		paused = false;
	}

	public boolean isPaused() {
		return paused;
	}
}
