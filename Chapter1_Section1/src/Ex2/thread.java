package Ex2;

public class thread extends Thread{
	public thread(String s) {
		super(s);
	}
	
	public void run() {
		int sleepTime = (int)(Math.random()*5000);
		System.out.println(thread.currentThread() + " is running!");
		try {
			sleep(sleepTime);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		System.out.println(thread.currentThread() + " sleepTime="+sleepTime);
	}
}
