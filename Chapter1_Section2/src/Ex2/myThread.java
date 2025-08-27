package Ex2;

public class myThread extends Thread{
	public void thread1() {
		try {
			for (int i=0; i<=10; i++) {
				System.out.print(i+" ");
				sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}
	public void thread2() {
		try {
			for (int i=0; i<=10; i++) {
				System.out.print((char) (65+i)+" ");
				sleep(2500);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}
}
