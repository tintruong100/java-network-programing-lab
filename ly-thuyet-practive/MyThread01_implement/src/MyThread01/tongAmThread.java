package MyThread01;

public class tongAmThread implements Runnable {
	private int[] a;
	
	public tongAmThread(int[] a) {
		super();
		this.a = a;
	}

	public void run() {
		int sum=0;
		for (int i=0; i<this.a.length; i++) {
			if (this.a[i]<0) sum += a[i];
			System.out.println("[tongAm] DANG KIEM TRA PHAN TU "+ i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException exception) {
				System.out.println(exception.toString());
			}
		}
		System.out.println("[tongAm] Tong Am = "+ sum);
	}
}
