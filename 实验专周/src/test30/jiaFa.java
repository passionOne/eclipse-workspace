package test30;

import java.util.Scanner;

public class jiaFa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int x1=in.nextInt();
		for ( x1 = 0; x1 <= 5; x1++) {
			for (int y = 0; y <= 5; y++) {
				if(x1+y==5) 
					System.out.print(x1+"+"+y+"="+(y+x1)+"\t");
			}
				System.out.println();
				}
	}
}			

	
	



