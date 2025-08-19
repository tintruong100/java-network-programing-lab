package section1_ex3;

public class A {
	synchronized void display(String s) {
		try {
			System.out.print("<"+s);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		System.out.println(">");
	}
}
