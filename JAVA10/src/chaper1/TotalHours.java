package chaper1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TotalHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		try {
			System.out.println("请输入总学时");
			int totall = in.nextInt();
			System.out.println("请输入课程数目");
			int cumont = in.nextInt();
			System.out.println(totall / cumont);
		} catch (ArithmeticException ex) {
			System.out.println("输入的课程数目不能为0");
		} catch (InputMismatchException ex) {
			System.out.println("输入课时格式错误");
		} catch (Exception ex) {
			System.out.println("未知错误");
		}
	}
}