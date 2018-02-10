package chaper6;

public class MyThread2 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " " + getName() + "优先级是：" + getPriority());
		}
	}
}
