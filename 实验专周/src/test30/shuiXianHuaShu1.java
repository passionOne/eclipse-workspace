package test30;

public class shuiXianHuaShu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		for (int i = 100; i <= 900; i++) {
			int b = i / 100;
			int c = (i - i * 100) / 10;
			int d = i - i * 100 - i * 10;
			if (b * b * b + c * c * c + d * d * d == i) {
				x++;
				System.out.println(i + " ");
			}
		}
		System.out.println();
		System.out.println("水仙花数的个数为：" + x + "个");
	}
}
