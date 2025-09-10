package Ex3;

import java.rmi.*;

public class ServiceImpl implements Service{

	@Override
	public int Reverse(int n) throws RemoteException {
		String num = Integer.toString(n);
		if (num.length()>1) {
			String reverse = "";
			for (int i=0; i<num.length(); i++) {
				reverse = reverse + num.charAt(i);
			}
			return Integer.parseInt(reverse);
		}
		else {
			return n;
		}
	}

}
