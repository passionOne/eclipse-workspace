package chaper8;

public class MtThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
			yield();
		}
	}
}
