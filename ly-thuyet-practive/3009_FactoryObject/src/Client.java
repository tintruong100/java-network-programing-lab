import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			FactoryObject service = (FactoryObject)Naming.lookup("rmi://127.0.0.1/FactoryObject");
			Service1 service1 = service.createService1();
			Service2 service2 = service.createService2();
			System.out.println("Nhap chuoi s: ");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println("So luong chuoi con: "+ service1.ChuoiCon(s));
			System.out.println("Chuoi chu hoa: "+ service2.ChuoiHoa(s));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		
	}
}
