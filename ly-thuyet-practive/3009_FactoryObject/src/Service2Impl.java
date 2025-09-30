import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class Service2Impl implements Service2{

	@Override
	public List<String> ChuoiHoa(String s) throws RemoteException {
		String[] s1 = s.split(" ");
		List<String> vietHoa = new ArrayList<String>();
		for (int i=0; i<s1.length; i++) {
			if(s1[i].matches("[A-Z]+")) vietHoa.add(s1[i]);
		}
		return vietHoa;
	}

}
