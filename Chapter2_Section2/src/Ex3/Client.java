package Ex3;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		try {
			Service service = (Service)Naming.lookup("rmi://127.0.0.1/Service");
			System.out.println("reverse("+n+") = "+ service.Reverse(n));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

}
