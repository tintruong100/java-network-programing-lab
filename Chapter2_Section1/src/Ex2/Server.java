package Ex2;

import java.rmi.*;

import java.rmi.server.*;

public class Server {
	public static void main(String[] args) {
		ServiceImpl instance = new ServiceImpl();
		try {
			UnicastRemoteObject.exportObject(instance);
			Naming.bind("rmi://127.0.0.1/Service", instance);
			System.out.println("Server is running ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
