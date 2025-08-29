package RMI;

import java.rmi.*;

public interface task extends Remote{
	public long giaithua(int n) throws RemoteException;
	public long tong(int n) throws RemoteException;
}