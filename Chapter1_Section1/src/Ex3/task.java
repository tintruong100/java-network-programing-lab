package Ex3;

public class task extends Thread{
	private int[] a;

	public task(int[] a) {
		this.a = a;
	}
	
	public void tongAm() {
		int tongAm=0;
		for (int i=0; i<a.length; i++) {
			if (a[i]<0) tongAm += a[i];
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("Tong Am = "+tongAm);
	}
	
	public void tongDuong() {
		int tongDuong=0;
		for (int i=0; i<a.length; i++) {
			if (a[i]>0) tongDuong += a[i];
			try {
				sleep(2500);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("Tong Duong = "+tongDuong);
	}
}
