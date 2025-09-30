import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service1 extends Remote{
	public int ChuoiCon(String s) throws RemoteException;
}
