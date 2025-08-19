package section1_ex3;

public class Synchronization {
	public static void main(String[] args) {
		A a = new A();
		new B(a,"Hello").start();
		new B(a,"My").start();
		new B(a,"Friend").start();
	}
}
