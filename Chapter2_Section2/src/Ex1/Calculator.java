package Ex1;

import java.rmi.*;

public interface Calculator extends Remote{
	public int Add(int a, int b) throws RemoteException;
	public int Sub(int a, int b) throws RemoteException;
	public int Multi(int a, int b) throws RemoteException;
	public float Div(int a, int b) throws RemoteException;
}
