package Ex2;

import java.rmi.*;

public interface Service extends Remote{
	public int getRandomNumber() throws RemoteException;
}
