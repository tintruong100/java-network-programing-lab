
public class Main {

	public static void main(String[] args) {
		int n = 5;
        MultiTask task = new MultiTask(n);

        Thread thread1 = new Thread(() -> task.calculateFactorial());
        Thread thread2 = new Thread(() -> task.calculateSum());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cả hai luồng đã hoàn thành.");
	}

}
