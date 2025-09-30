import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface FactoryObject extends Remote{
	public Service1 createService1() throws RemoteException;
	public Service2 createService2() throws RemoteException;
}
