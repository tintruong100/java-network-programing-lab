package Ex4;

public class MyThread extends Thread {
	int i = 0;
	AnimationFrame af;

	public MyThread(AnimationFrame af) {
		this.af = af;
	}

	public void run() { 
		while (true) { 
			i = (i+1) % 2; 
			af.repaint(); 
			try { 
				Thread.sleep(400); 
			} catch (InterruptedException e)       
				{System.out.println("Interrupted"); 
			}
		}
	}
}
