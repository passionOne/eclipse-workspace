package chaper1;

import java.util.Scanner;

public class testDrawMony {

	public static void main(String[] args) {
		// 在测试类中新建一张：发卡行为“CBC”，密码为“123456”，余额为5000的银行卡。
		// 然后new一个建设银行ATMCBC的对象，代码演示（插卡-输入密码-验证密码-取款-查询余额等功能）。
		Card card = new Card("CBC", "123456", 5000.0);
		ATMCBC b1 = new ATMCBC();
		b1.insert(card);
		System.out.println("请输入密码：");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if (b1.proof(input)) {
			System.out.println("请输入取款金额：");
		} else {
			System.out.println("密码错误");
		}
		Scanner in1 = new Scanner(System.in);
		double input1 = in1.nextDouble();
		if (b1.drawmoney(input1)) {
			System.out.println("取款成功，余额为：" + b1.enquiry(input1));
		}

	}
}
