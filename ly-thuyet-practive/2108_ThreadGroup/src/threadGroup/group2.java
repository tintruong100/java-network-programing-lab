package threadGroup;

public class group2 extends Thread{
	private String s1;
	private String[] s2;
	public group2(String s1, String[] s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void thread3() {
		String[] s3 = s1.trim().split("\\s+");
		for (int i=0; i<s3.length; i++) {
			System.out.println("[T3] "+s3[i]);
			try {
				System.out.println("[T3] is sleeping");
				sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public void thread4() {
		String s4 = s2[0];
		for (int i=1; i<s2.length; i++) {
			s4 += " ";
			s4 += s2[i];
			try {
				System.out.println("[T4] is sleeping");
				sleep(2500);
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("[T4] "+ s4);
	}
	
}
