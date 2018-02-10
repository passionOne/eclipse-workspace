package chaper3;

import java.util.Scanner;

public class huiXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x3 = new Scanner(System.in);
		System.out.println("请输入 n:");
		int n = x3.nextInt();
		print1(n);
	}
	public static void print1(int n) {
		int[][] A = new int[n][n];
		int t = 1;
		int i = 0;
		int j = 0;
		for (int k = 0; k < n / 2; k++) {// k代表第几圈
			for (i = k, j = k; j < n - k - 1; j++) {// 第一条边
				A[i][j] = t++;
			}
			for (i = k, j = n - k - 1; i < n - k - 1; i++) {// 第二条边
				A[i][j] = t++;
			}
			for (i = n - k - 1, j = n - k - 1; j > k; j--) {// 第三条边
				A[i][j] = t++;
			}
			for (i = n - k - 1, j = k; i > k; i--) {// 第四条边
				A[i][j] = t++;
			}
		}
		if (n % 2 == 1) {
			A[n / 2][n / 2] = t;
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
