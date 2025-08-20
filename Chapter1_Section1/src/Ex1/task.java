package Ex1;

public class task extends Thread{
	private int n;

	public task(int n) {
		this.n = n;
	}
	
	public void giaiThua() {
		long giaiThua=1;
		for (int i=2; i<=n; i++) {
			giaiThua *= i;
			try {
				sleep(2500);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("n!="+giaiThua);
	}
	
	public void tinhTong() {
		long tinhTong=1;
		for (int i=2; i<=n; i++) {
			tinhTong += i;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("Sum="+tinhTong);
	}
}
