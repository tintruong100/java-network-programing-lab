package demo_Thread;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n=");
		int n = sc.nextInt();
		int[] a;
		a = new int[n];
		for (int i=0; i<a.length; i++) {
			System.out.println("Nhap a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		myThread t1 = new myThread(a);
		myThread t2 = new myThread(a);
		new Thread(() -> t1.tongDuong()).start();
		new Thread(() -> t2.tongAm()).start();
		try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Tong duong: "+ t1.getResult());
		System.out.println("Tong duong: "+ t2.getResult());

	}

}
