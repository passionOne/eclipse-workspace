package chaper1;

public class MyException extends Exception {
	int level;
	public MyException(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}
	String level1;
	public String show() {
		return level1 + "超出警戒线了";
	}
	static void go(int level) throws MyException {
		System.out.println("level=" + level);
		if (level > 20)
			throw new MyException(level);
		System.out.println("正常结束");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			go(1);
			go(25);
		} catch (MyException ex1) {
			System.out.println("捕获错误" + ex1.show());
		}

	}

}
