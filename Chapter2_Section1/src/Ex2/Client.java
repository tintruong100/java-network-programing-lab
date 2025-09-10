package Ex2;

import java.net.MalformedURLException;
import java.rmi.*;

public class Client {

	public static void main(String[] args) {
		try {
			Service service = (Service)Naming.lookup("rmi://127.0.0.1/Service");
			System.out.println("So random la: "+ service.getRandomNumber());
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

}
