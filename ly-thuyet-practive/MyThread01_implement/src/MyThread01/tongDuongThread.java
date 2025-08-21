package MyThread01;

public class tongDuongThread implements Runnable{
	private int[] a;
	
	public tongDuongThread(int[] a) {
		super();
		this.a = a;
	}

	public void run() {
		int sum=0;
		for (int i=0; i<this.a.length; i++) {
			if (this.a[i]<0) sum += a[i];
			System.out.println("[tongDuong] DANG KIEM TRA PHAN TU "+ i);
			try {
				Thread.sleep(500);
			} catch(InterruptedException exception) {
				System.out.println(exception.toString());
			}
		}
		System.out.println("[tongDuong] Tong Duong = "+ sum);
	}
}
