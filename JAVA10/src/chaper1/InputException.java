package chaper1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入1到3之间的数字");
		Scanner in=new Scanner (System.in);
		try {
			int courseCode=in.nextInt() ;
			switch(courseCode) {
			case 1:
				System.out.println("c#编程");
				break;
			case 2:
				System.out.println("JAVA编程");
				break;
			case 3:
				System.out.println("SQL基础");
				break;
			}
		}catch(InputMismatchException ex) {
			System.out.println("输入不为数字");
		}
		System.out.println("欢迎提出建议");
		}
	}
