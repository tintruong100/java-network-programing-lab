package Ex2;

import java.rmi.*;

public class CalculatorImpl implements Calculator{

	@Override
	public int[][] AddMatrix(int[][] a, int[][] b) throws RemoteException {
		int dong = a.length;
		int cot = a[0].length;
		int[][] added = new int[dong][cot];
		for (int i=0; i<dong; i++) {
			for (int j=0; j<cot; j++) {
				added[i][j] = a[i][j] + b[i][j];
			}
		}
		return added;
	}

}
