package section1_ex1;

public class threadProperties {
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("My Thread");
		System.out.println("Current Thread: "+ t);
		try {
			for (int i=0; i<5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		
	}
	
}
