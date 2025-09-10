package Ex2;

import java.rmi.*;

public interface Calculator extends Remote{
	public int[][] AddMatrix(int[][] a, int[][] b) throws RemoteException;
}
