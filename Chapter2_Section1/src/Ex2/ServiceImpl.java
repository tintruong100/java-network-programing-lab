package Ex2;

import java.rmi.*;

public class ServiceImpl implements Service{

	@Override
	public int getRandomNumber() throws RemoteException {
		return (int)(Math.random()*100);
	}

}
