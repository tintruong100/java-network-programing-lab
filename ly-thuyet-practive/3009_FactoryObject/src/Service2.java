import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Service2 extends Remote{
	public List<String> ChuoiHoa(String s) throws RemoteException;
}
