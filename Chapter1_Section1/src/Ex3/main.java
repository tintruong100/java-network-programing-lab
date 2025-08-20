package Ex3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap n");
//		int n = sc.nextInt();
//		int [] a = new int[n];
//		for (int i=0; i<n; i++) {
//			System.out.println("Nhap a["+i+"]=");
//			a[i]=sc.nextInt();
//		}
		System.out.println("Nhap chuoi so nguyen:");
		String input = sc.nextLine();
		String[] parts = input.trim().split("\\s+");
		int [] a = new int[parts.length];
		for (int i=0; i<parts.length; i++) {
			a[i]= Integer.parseInt(parts[i]);
		}
		task task = new task(a);
		Thread t1 = new Thread(() -> task.tongAm());
		Thread t2 = new Thread(() -> task.tongDuong());
		t1.start();
		t2.start();
	}

}
