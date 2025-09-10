package Ex4;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi can kiem tra: ");
		String s = sc.nextLine();
		try {
			Service service = (Service)Naming.lookup("rmi://127.0.0.1/Service");
			List<String> duplicateWords = service.Duplicate(s);
			System.out.println(duplicateWords); 
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

}
