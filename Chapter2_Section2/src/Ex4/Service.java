package Ex4;

import java.rmi.*;
import java.util.List;

public interface Service extends Remote{
	public List<String> Duplicate(String s) throws RemoteException;
}
