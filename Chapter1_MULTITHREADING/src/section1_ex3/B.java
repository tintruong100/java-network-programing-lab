package section1_ex3;

public class B extends Thread{
	A a;
	String s;
	public B(A a, String s) {
		this.a = a;
		this.s = s;
	}
	public void run() {
		a.display(s);
	}
}
