package chaper9;

public class MyThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
	}
}
