package threadGroup;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("Nhap a["+i+"]=");
			a[i] = sc.nextInt();
		}
		sc.nextLine();
		System.out.println("Nhap chuoi: ");
		String s1 = sc.nextLine();
		System.out.println("Nhap so luong chuoi con:");
		n = sc.nextInt();
		sc.nextLine();
		String[] s2 = new String[n];
		for (int i=0; i<n; i++) {
			System.out.println("Nhap chuoi "+i+" :");
			s2[i] = sc.nextLine();
		}
		group1 g1 = new group1(a);
		group2 g2 = new group2(s1,s2);
		ThreadGroup group1 = new ThreadGroup("Group 1");
		ThreadGroup group2 = new ThreadGroup("Group 2");
		group2.setMaxPriority(10);
		group1.setMaxPriority(2);
		Thread thread1 = new Thread(group1, new Thread(() -> g1.thread1()), "Thread-1");
		Thread thread2 = new Thread(group1, new Thread(() -> g1.thread2()), "Thread-2");
		Thread thread3 = new Thread(group2, new Thread(() -> g2.thread3()), "Thread-3");
		Thread thread4 = new Thread(group2, new Thread(() -> g2.thread4()), "Thread-4");
		System.out.println(thread1.toString());
		System.out.println(thread2.toString());
		System.out.println(thread3.toString());
		System.out.println(thread4.toString());
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
