import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;

public class myClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n=");
		int n = sc.nextInt();
		int[] a;
		a = new int[n];
		for (int i=0; i<a.length; i++) {
			System.out.println("Nhap a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		try {
			task t = (task)Naming.lookup("rmi://127.0.0.1/task");
			new Thread(()->{
				try {
					System.out.println("Tong duong: "+ t.thread1(a));
				} catch (RemoteException e) {
					e.printStackTrace();
				}
			}).start();
			new Thread(()->{
				try {
					System.out.println("Tong am: "+ t.thread2(a));
				} catch (RemoteException e) {
					e.printStackTrace();
				}
			}).start();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		
	}

}
