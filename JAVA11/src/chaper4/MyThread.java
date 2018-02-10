package chaper4;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			System.out.print(i + " ");
		}
	}
}
