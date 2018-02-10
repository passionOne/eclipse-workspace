package test;

import java.util.Scanner;

public class test6 {
	private static final int size = 0;
	private static int i1;
	private static Scanner sc;
	private static int i;
	private static int x;
	private static int a;
	

	/*public static void main(String[]args) {
	
	int i1=1;
	int sum=0;
	while(i1<=100)
	{
		sum+=i1;
		i1++;
	}
	
	System.out.println("1到100所有数之和:"+sum);*/
	/*public static void main(String[]args) {
		int sum=0;
		do
		{
			sum+=i1;
			i1=i1+2;
		}
		while(i1<=100);
		System.out.println("1到100所有偶数之和:"+sum);
}*/
	/*public static void main(String[]args) {
		/*int sum=0;;
		for(int i1=1;i1<=100;i1=i1+2) {
			sum+=i1;
			                                                                                                                                                                                       
		}
		System.out.println("1到100所有奇数之和:"+sum);*/
	/*public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int x=input.nextInt();
		int i1;
		while(x!=0)
		{
			i1=x%10;
			System.out.print(i1);
			x=x/10;
		}
		System.out.println("为反转的数字");*/
	
	/*public static void main(String[]args) {
		int a;
	Scanner input=new Scanner(System.in);
	System.out.println("请输入一个整数：");
	a=input.nextInt();
	System.out.println(a+"所有因子：");
	for(int i=1;i<=a;i++){
			if(a%i==0)
			{
				System.out.println(i+" ");
			}
   }*/
	/*public static void main(String[]args) {
	for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+"*"+i+"="+(j*i)+"\t");
		}*/
	/*public static void main(String[]args) {
		 System.out.println("");
		int sum,i;
	for(sum=2;sum<=100;sum++)
	{
		for(i=2;i<=sum/2;i++) 
		{
			if(sum%i==0)
				break;
		}
		if(i>sum/2)
			  System.out.println(+sum);
	}*/
	/*public static void main(String[]args) {
	int a=1,b=1,c=0;
	System.out.println("斐波那契数列的前20项为：");
	System.out.println(a+"\t"+b+"\t");
	for(int i=1;i<=18;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c+"\t");
		if((i+2)%5==0)
			System.out.println();	
	}*/
	
	
	/*public static void main(String[]args) {
		final int size=4;
		for(int i=1;i<=size;i++)
		for(int j=i;j<size;j++) {
			System.out.println("");	
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.println("*");	
		}
		    System.out.println();    
	for(int i11=size-1;i>=1;i--) {
    for(int j=1;j<=size-i;j++) {
	 System.out.print("");    
}
     for(int k=2*i-1;k>0;k--) 
     {
    		System.out.println("*");	
     }
     System.out.println();    
   }*/
	public static void main(String[]args) {
		  System.out.println("星星菱形图案如下：");   
		  System.out.println();
		  {
			  for(int y=1;y<=5-x;y++)
				  System.out.println("");    
			  for(int z=1;z<=2*x-1;z++)
				  System.out.println("*");
			  System.out.println();    
		  }for(int b=1;b<=a;b++)
			  System.out.println();    
		  for(int c=7;c>=2*a-1;c--)
			  System.out.println("*");    
		  System.out.println();    
			
		  }
	}

	
