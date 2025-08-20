package Ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n");
		int n=sc.nextInt();
		task task = new task(n);
		Thread t1 = new Thread(() -> task.giaiThua());
		Thread t2 = new Thread(() -> task.tinhTong());
		t1.start();
		t2.start();
	}
}
