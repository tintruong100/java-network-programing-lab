import java.rmi.*;
import java.rmi.server.*;

public class Server {
	public static void main(String[] args) {
		try {
			FactoryObject obj = new FactoryObjectImpl();
			UnicastRemoteObject.exportObject(obj);
			Naming.bind("rmi://127.0.0.1/FactoryObject", obj);
			System.out.println("Server is running ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
