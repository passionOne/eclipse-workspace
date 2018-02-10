package test30;

import java.util.Scanner;

public class testTriangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入行数：");
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int[][] a = new int[x1][10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
		}
		for (int i = 0; i < a.length; i++) {
			a[i][0] = 1;
			a[i][i] = 1;
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
			}
		}
		for (int i1 = 0; i1 < a.length; i1++) {
			for (int j = 0; j < a[i1].length; j++) {
				System.out.print(a[i1][j] + "\t");
			}
			System.out.println();
		}
	}
}
