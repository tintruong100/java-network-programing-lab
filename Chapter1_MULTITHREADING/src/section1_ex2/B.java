package section1_ex2;

public class B extends Thread{
	public void run(){
		try {
			for (int i=0; i<10; i++) {
				System.out.print((char) (65+i)+" ");
				sleep(2500);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}
}
