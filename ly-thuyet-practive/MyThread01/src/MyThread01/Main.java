package MyThread01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mang;
		mang = new int[10];
		for (int i=0; i<mang.length; i++) {
			System.out.println("Nhap a[" + i + "]=");
			mang[i] = sc.nextInt();
		}
		tongAmThread t1 = new tongAmThread(mang);
		tongDuongThread t2 = new tongDuongThread(mang);
		t1.start();
		t2.start();
	}

}
