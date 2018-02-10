package chaper4;

import java.io.IOException;

public class TestChange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个字符：");
		int a1;
		try {
			a1 = System.in.read();
			System.out.println("该字符的编码值为：" + a1);
			System.out.println("该字符为：" + (char) a1);
		} catch (IOException ex1) {
			ex1.printStackTrace();
		}
	}
}
