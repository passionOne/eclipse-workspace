package chaper1;

import java.util.Scanner;

public class testPayBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试充话费的功能
		Card card = new Card("CBC", "123456", 5000.0);
		ATMABC b3 = new ATMABC();
		b3.insert(card);
		System.out.println("请输入密码：");
		Scanner in3 = new Scanner(System.in);
		String input3 = in3.nextLine();
		b3.proof(input3);
		if (b3.proof(input3)) {
			System.out.println("请输入充值金额：");
			double money = in3.nextDouble();
			if (b3.PayTelBill("15008296165", money)) {
				System.out.println("充值成功,余额为：" + b3.card.balance);
			} else {
				System.out.println("充值失败");
			}
		} else {
			System.out.println("密码错误");
		}
	}
}
