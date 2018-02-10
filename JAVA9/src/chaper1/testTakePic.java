package chaper1;

import java.util.Scanner;

public class testTakePic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMCBC b2 = new ATMCBC();
		b2.takePic();
		Card card = new Card("CBC", "123456", 5000.0);
		b2.insert(card);
		System.out.println("请输入密码：");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if (b2.proof(input)) {
			System.out.println("请输入取款金额：");
		} else {
			System.out.println("密码错误");
		}
		Scanner in1 = new Scanner(System.in);
		double input1 = in1.nextDouble();
		if (b2.drawmoney(input1)) {
			System.out.println("取款成功，余额为：" + b2.enquiry(input1));
		}
	}
}
