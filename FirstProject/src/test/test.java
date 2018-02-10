package test;

import java.util.Scanner;

class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub*
		int x,y;
System.out.println("请输入两个数字：");
Scanner input=new Scanner(System.in);
x=input.nextInt();
y=input.nextInt();
System.out.println(x+"+"+y+"="+(x+y));
System.out.println(x+"-"+y+"="+(x-y));
System.out.println(x+"*"+y+"="+(x*y));
System.out.println(x+"/"+y+"="+(x/y));
System.out.println(x+"%"+y+"="+(x%y));
/*int x,y;
System.out.println("输入两个数");
Scanner input=new Scanner(System.in);
x=input.nextInt();
y=input.nextInt();
System.out.println(x==y);
System.out.println(x!=y);
System.out.println(x<y);
System.out.println(x>y);
System.out.println(x<=y);
System.out.println(x>=y);*/
	}
}
