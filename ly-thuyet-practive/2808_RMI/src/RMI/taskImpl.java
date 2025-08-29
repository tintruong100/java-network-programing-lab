package RMI;

import java.rmi.*;

public class taskImpl implements task{

	protected taskImpl() throws RemoteException {
		super();
	}

	@Override
	public long giaithua(int n) throws RemoteException {
		long sum = 1;
		for (int i=2; i<=n; i++) {
			sum *= i;
		}
		return sum;
	}

	@Override
	public long tong(int n) throws RemoteException {
		long sum = 1;
		for (int i=2; i<=n; i++) {
			sum += i;
		}
		return sum;
	}

}
