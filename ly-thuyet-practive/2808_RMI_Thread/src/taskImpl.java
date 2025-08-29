import java.rmi.RemoteException;

public class taskImpl implements task{

	@Override
	public int thread1(int[] a) throws RemoteException {
		int sum=0;
		try {
			for (int i=0; i<a.length; i++) {
				if (a[i]>0) sum+=a[i];
				System.out.println("T1: a["+i+"]="+a[i]);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		return sum;
	}

	@Override
	public int thread2(int[] a) throws RemoteException {
		int sum=0;
		try {
			for (int i=0; i<a.length; i++) {
				if (a[i]<0) sum+=a[i];
				System.out.println("T2: a["+i+"]="+a[i]);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		return sum;
	}

}
