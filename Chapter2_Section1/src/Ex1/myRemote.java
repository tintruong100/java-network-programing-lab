package Ex1;

import java.rmi.*;

public interface myRemote extends Remote{
	public int getNumber() throws RemoteException;
	public String getChar() throws RemoteException;
}
