import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactoryObjectImpl implements FactoryObject{
	Service1 service1 = new Service1Impl();
	Service2 service2 = new Service2Impl();
	public FactoryObjectImpl() {
		try {
			UnicastRemoteObject.exportObject(service1);
			UnicastRemoteObject.exportObject(service2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public Service1 createService1() throws RemoteException {
		return service1;
	}

	@Override
	public Service2 createService2() throws RemoteException {
		return service2;
	}
}
