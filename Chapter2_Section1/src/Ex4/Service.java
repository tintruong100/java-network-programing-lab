package Ex4;

import java.rmi.*;

public interface Service extends Remote{
	public long Tong(int n) throws RemoteException;
}
