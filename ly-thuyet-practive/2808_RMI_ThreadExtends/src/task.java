import java.rmi.Remote;
import java.rmi.RemoteException;

public interface task extends Remote{
	public int[] threadStart(int[] a) throws RemoteException;
}
