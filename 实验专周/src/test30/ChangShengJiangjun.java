package test30;

import java.util.Scanner;

public class ChangShengJiangjun {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 21;
		while (n > 0) {
			int i = Integer.valueOf(input.nextLine());
			if (i > 4 || i <= 0 || i > n) {
				System.out.println("输入有误！保证数字在1—4之间!且小于总根数");
				continue;
			}
			System.out.print("您取了" + i + "根   ");
			if (n - i == 0) {
				n -= i;
				System.out.println("您输了,电脑赢");
			} else {
				System.out.println("电脑取了" + (5 - i) + "   剩" + (n - 5));
				n -= 5;
			}
		}
		input.close();
	}
}
