package Ex1;

import java.rmi.*;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		int a = sc.nextInt();
		System.out.println("Nhap so b: ");
		int b = sc.nextInt();
		try {
			Calculator calculator = (Calculator)Naming.lookup("rmi://127.0.0.1/Calculator");
			System.out.println("Add("+a+","+b+") = "+calculator.Add(a, b));
			System.out.println("Sub("+a+","+b+") = "+calculator.Sub(a, b));
			System.out.println("Mutil("+a+","+b+") = "+calculator.Multi(a, b));
			System.out.println("Div("+a+","+b+") = "+calculator.Div(a, b));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
