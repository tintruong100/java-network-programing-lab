package MyThread01_1Thread;

public class MyThread extends Thread {
	private int[] a;
	private boolean kt;
	public MyThread(int[] a, boolean kt) {
		this.a = a;
		this.kt = kt;
	}

	public void run() {
		int tongAm=0, tongDuong=0;
		for (int i=0; i<a.length; i++) {
			if (a[i]>0) {
				tongDuong += a[i];
			} else {
				tongAm += a[i];
			}
		}
		if (kt) {
			System.out.println("Tong duong = "+tongDuong);
		} else {
			System.out.println("Tong am = "+tongAm);
		}
		
	}
}
