package test30;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i != j) {
					m = i * 1000 + i * 100 + j * 10 + j;
					for (int n = 31; n < 100; n++) {
						if (n == Math.sqrt(m)) {
							System.out.println("车牌号是：" + n * n);
						}
					}
				}
			}
		}
	}
}
