package RMI;

import java.rmi.Naming;
import java.util.Scanner;

public class myClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap N=");
		int n = sc.nextInt();
		try {
			task task = (task) Naming.lookup("rmi://172.0.0.1/task");
			System.out.println("Giai thua = "+ task.giaithua(n));
			System.out.println("Tong = "+ task.tong(n));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
