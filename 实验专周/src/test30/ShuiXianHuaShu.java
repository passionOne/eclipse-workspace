package test30;

public class ShuiXianHuaShu {
	public static void main(String[] args) {
		int x = 0;
		for (int i = 100; i <= 999; i++) {
			int b = i / 100;
			int c = (i - 100 * b) / 10;
			int g = (i - c * 10 - b * 100);
			if (i == g * g * g + c * c * c + b * b * b) {
				x++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("水仙花数总共有" + x + "个");
	}
}
