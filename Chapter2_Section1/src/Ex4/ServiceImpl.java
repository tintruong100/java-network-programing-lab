package Ex4;

import java.rmi.*;

public class ServiceImpl implements Service{

	@Override
	public long Tong(int n) throws RemoteException {
		long tong=0;
		for (int i=1; i<=n; i++) tong += i;
		return tong;
	}

}
