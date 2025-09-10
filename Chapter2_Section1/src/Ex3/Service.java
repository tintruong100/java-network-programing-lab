package Ex3;

import java.rmi.*;

public interface Service extends Remote{
	public long GiaiThua(int n) throws RemoteException;
}
