package Ex1;

public class Main {
	public static void main(String[] args) {
		myThread t = new myThread();
		new Thread(() -> t.thread1()).start();
		new Thread(() -> t.thread2()).start();
		new Thread(() -> t.thread3()).start();
		
	}
}
