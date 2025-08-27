package Ex3;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		new B(a,"Hello").start();
		new B(a,"My").start();
		new B(a,"Friend").start();
	}
}
