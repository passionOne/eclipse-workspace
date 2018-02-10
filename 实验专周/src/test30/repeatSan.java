package test30;

public class repeatSan {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i != j && i != k && j != k) {
						System.out.print(i * 100 + j * 10 + k + " ");
						count++;
					}
				}
			}
			System.out.println();
		}
		System.out.println("0~9这10个数字可以组成多少不重复的3位数有" + count + "个");
	}
}
