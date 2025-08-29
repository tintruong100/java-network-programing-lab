import java.rmi.*;

public interface task extends Remote{
	public int thread1(int[] a) throws RemoteException;
	public int thread2(int[] a) throws RemoteException;
}
