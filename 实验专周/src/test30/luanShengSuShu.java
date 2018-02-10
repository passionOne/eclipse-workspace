package test30;

public class luanShengSuShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		int n = 0;
		for (int i = 2; i <= 100; i++) {                             // 将100以内的素数存入数组
			int flag = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
				}
			}
			if (flag == 1) {
				a[n] = i;
				n++;
			}
		}
		for (int i = 0; i < n - 2; i++) {                             // 输出数组中相邻元素差为2的两个元素
			if (a[i + 1] - a[i] == 2) {
				System.out.print(a[i] + " " + a[i + 1]);
				System.out.println();
			}
		}
	}
}


