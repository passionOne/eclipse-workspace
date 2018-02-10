package test30;

import java.util.Scanner;

public class juZhengZhuanZhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("------------转置前");
		print1(data);
		reverse(data);
		System.out.println("------------转置后");
		print1(data);
	}
	public static void reverse(int temp[][]) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = i; j < temp[i].length; j++) {
				int k = temp[i][j];
				temp[i][j] = temp[j][i];
				temp[j][i] = k;
			}
		}
	}
	public static void print1(int temp[][]) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				System.out.print(temp[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
