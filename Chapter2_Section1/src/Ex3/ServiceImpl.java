package Ex3;

import java.rmi.*;

public class ServiceImpl implements Service{

	@Override
	public long GiaiThua(int n) throws RemoteException {
		long giaiThua=1;
		for (int i=1; i<=n; i++) giaiThua *= i;
		return giaiThua;
	}

}
