package chaper9;

public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread4 f = new MyThread4();
		MyThread4 f1 = new MyThread4();
		f.start();
		f.join();
		f1.start();
	}
}
