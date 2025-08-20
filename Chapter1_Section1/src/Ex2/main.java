package Ex2;

public class main {
	public static void main(String[] args) {
		thread t1 = new thread("My thread 1");
		t1.setPriority(6);
		thread t2 = new thread("My thread 2");
		t2.setPriority(5);
		thread t3 = new thread("My thread 3");
		t3.setPriority(4);
		t1.start();
		t2.start();
		t3.start();
	}
}
