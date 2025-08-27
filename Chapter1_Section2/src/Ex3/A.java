package Ex3;

public class A{
	public synchronized void displayString(String s) {
		try {
			System.out.print("<"+s);
			Thread.sleep(2000);
			System.out.println(">");
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}
	
}
