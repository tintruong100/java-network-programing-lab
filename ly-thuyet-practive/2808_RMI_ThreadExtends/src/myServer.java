import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

public class myServer {
	public static void main(String[] args) {
		try {
			taskImpl t = new taskImpl();
			UnicastRemoteObject.exportObject(t);
			Naming.bind("rmi://127.0.0.1/task", t);
			System.out.println("Server ready...");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
