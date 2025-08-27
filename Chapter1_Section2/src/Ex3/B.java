package Ex3;

public class B extends Thread{
	private A a;
	private String s;
	
	public B(A a, String s) {
		this.a = a;
		this.s = s;
	}
	
	public void run() {
		a.displayString(s);
	}
}
