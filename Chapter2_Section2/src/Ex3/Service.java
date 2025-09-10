package Ex3;

import java.rmi.*;

public interface Service extends Remote{
	public int Reverse(int n) throws RemoteException;
}
