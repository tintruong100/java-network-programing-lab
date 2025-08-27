package Ex1;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread (Thread.currentThread(),"My Thread");
		System.out.println("Current Thread: "+t1);
		try {
			for (int i=0; i<=5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}

}
