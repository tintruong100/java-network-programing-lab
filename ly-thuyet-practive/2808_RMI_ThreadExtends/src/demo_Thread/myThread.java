package demo_Thread;


public class myThread extends Thread{
	private int result=0;
	private int[] a;

	public myThread(int[] a) {
		this.a = a;
	}
	
	public void tongDuong() {
		int sum=0;
		try {
			for (int i=0; i<a.length; i++) {
				if (a[i]>0) sum+=a[i];
				sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		result = sum;
	}
	public void tongAm() {
		int sum=0;
		try {
			for (int i=0; i<a.length; i++) {
				if (a[i]<0) sum+=a[i];
				sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		result = sum;
	}

	public int getResult() {
		return result;
	}
	
}
