package Ex2;

import java.rmi.*;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap ma tran a
		System.out.println("---TAO MA TRAN A---");
        System.out.print("Nhap so dong: ");
        int dong = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int cot = sc.nextInt();
        int[][] a = new int[dong][cot];
        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Phan tu [%d][%d]: ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
		//Nhap ma tran b
        System.out.println("---TAO MA TRAN B---");
        System.out.print("Nhap so dong: ");
        dong = sc.nextInt();
        System.out.print("Nhap so cot: ");
        cot = sc.nextInt();
        int[][] b = new int[dong][cot];
        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Phan tu [%d][%d]: ", i, j);
                b[i][j] = sc.nextInt();
            }
        }
		try {
			Calculator calculator = (Calculator)Naming.lookup("rmi://127.0.0.1/Calculator");
			int[][] added = calculator.AddMatrix(a, b);
			System.out.println("Ma tran da cong:");
	        for (int i = 0; i < dong; i++) {
	            for (int j = 0; j < cot; j++) {
	                System.out.print(added[i][j] + "\t");
	            }
	            System.out.println();
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
