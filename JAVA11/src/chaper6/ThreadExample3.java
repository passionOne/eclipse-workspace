package chaper6;

public class ThreadExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}
