package test30;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class blackFriday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入起始年份");
		int year = input.nextInt();
		System.out.println("请输入打算未来输出几年");
		int n = input.nextInt();
		getblackFri(year, n);
	}
	public static void getblackFri(int year, int n) {
		SimpleDateFormat Sdf = new SimpleDateFormat("yyyy-MM-dd E");
		int k = 0;
		Calendar cal = Calendar.getInstance();
		while (k < n) {
			for (int i = 0; i < 12; i++) {
				cal.set(year, i, 13);
				if (5 == (cal.get(Calendar.DAY_OF_WEEK) - 1)) {
					System.out.println("黑色星期五" + Sdf.format(cal.getTime()));
				}
			}
			year++;
			k++;
		}
	}
}
