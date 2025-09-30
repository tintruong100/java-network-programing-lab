import java.rmi.RemoteException;

public class Service1Impl implements Service1{

	@Override
	public int ChuoiCon(String s) throws RemoteException {
		return s.split(" ").length;
	}

}
