package section1_ex2;

public class A extends Thread{
	public void run(){
		try {
			for (int i=0; i<10; i++) {
				System.out.print(i+" ");
				sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}
}
