package chaper7;

public class ThreadExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 f3=new MyThread3();
		MyThread3 f4=new MyThread3();
		f3.start();
		f4.start();
	}
}
