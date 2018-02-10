package chaper7;

public class MyThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			try {
				sleep(1000);
			} catch (InterruptedException ex) {
				System.out.print("error:" + ex);
			}
		}
	}
}
