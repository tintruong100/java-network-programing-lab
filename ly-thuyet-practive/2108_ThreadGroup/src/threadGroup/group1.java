package threadGroup;

public class group1 extends Thread{
	private int[] a;

	public group1(int[] a) {
		this.a = a;
	}
	
	public void thread1() {
		int sum=0, count=0;
		for (int i=0; i<a.length; i++) {
			if(a[i]>0) {
				sum += a[i];
				count += 1;
			}
			try {
				System.out.println("[T1] is sleeping");
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
			if (count == 2) break;
		}
		System.out.println("[T1] Cong 2 so duong: "+ sum);
	}
	
	public void thread2() {
		int sum=0, count=0;
		for (int i=0; i<a.length; i++) {
			if(a[i]>0) {
				sum -= a[i];
				count += 1;
			}
			try {
				System.out.println("[T2] is sleeping");
				sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
			if (count == 2) break;
		}
		System.out.println("[T2] Tru 2 so duong: "+ sum);
	}
}
