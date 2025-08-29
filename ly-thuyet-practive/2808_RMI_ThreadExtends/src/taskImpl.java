import java.rmi.RemoteException;

public class taskImpl implements task{
	
	@Override
	public int[] threadStart(int[] a) throws RemoteException {
		myThread t1 = new myThread(a);
		myThread t2 = new myThread(a);
		new Thread(() -> t1.tongDuong()).start();
		new Thread(() -> t2.tongAm()).start();
		try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		return new int[]{t1.getResult(),t2.getResult()};
	}

}
