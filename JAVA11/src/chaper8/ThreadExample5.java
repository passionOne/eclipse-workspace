package chaper8;

public class ThreadExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MtThread4 f4 = new MtThread4();
		MtThread4 f5 = new MtThread4();
		f4.start();
		f5.start();
	}
}
