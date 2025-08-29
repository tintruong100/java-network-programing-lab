package RMI;

import java.rmi.*;
import java.rmi.server.*;

public class myServer {
	public static void main(String[] args) {
		try {
			taskImpl t = new taskImpl();
			UnicastRemoteObject.exportObject(t);
			Naming.bind("rmi://172.0.0.1/task", t);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
