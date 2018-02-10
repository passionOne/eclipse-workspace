package test;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class JAVA5 {
	private static int i;
	private static int k;
	private static int x;

	/*public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int i,max;
          int a[]=new int[10];
          int N=100;
          for(i=0;i<a.length;i++)
          {
        	  a[i]=(int)(Math.random()*N);
        	  System.out.println("a["+i+"]="+a[i]);
          }
          max=a[0];
          for(i=1;i<a.length;i++)
              if(a[i]>max)
            	  max=a[i];
              System.out.println( );
              System.out.println("最大值max="+max);*/
/*public static void main(String[] args) {
		int[]a= {1,4,7,9,0};
		for (int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" " );
		}
		Arrays.sort(a);
		System.out.println( );
	    for (int i=0;i<a.length;i++) 
		System.out.print( a[i]+" ");
	}*/

	/*public static void main(String[] args) {
		char[][]answers= {
				{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'},
				{'E','E','D','A','C','B','E','E','A','E'},
				{'c','B','A','E','D','C','E','E','A','D'},
				{'A','B','D','C','C','D','E','E','A','D'}};
		char[]keys= {'E','B','D','B','C','D','A','C','C','D'};//定义正确答案的数组
		for(int i=0;i<answers.length;i++) {
		int correctCount=0;
		for(int j=0;j<answers[i].length;j++){
			if(answers[i][j]==keys[j])
				correctCount++;
		}
		System.out.println("学生"+i+"答对题目的个数为："
		+correctCount);  
	}*/
	/*public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int m=input.nextInt();
     System.out.println("input m=");
     int n=input.nextInt();
     System.out.println("input n=");
     int k=input.nextInt();
     System.out.println("input k=");
     double[][]a=new double[m][n];//自定义一个m*n的矩阵
     double[][]b=new double[n][k];//自定义一个n*k的矩阵
     System.out.println("输入连续的数构成数组a:");
     for(int i=0;i<m;i++)
    	 for(int j=0;j<n;i++)
    		 a[i][j]=input.nextDouble();
     System.out.println("Matrix a:");
}
	private static Double[][] multiplyMatrix(double[][] a, double[][] b) {
		// TODO Auto-generated method stub
		return null;}
	private Object a;
	{
		System.out.println("Matrix a:");
		printMatrix(a);                      
	}*/ 
	/*public static void main(String[]args) {
		double a[]= {1.1,3.4,-9.8,10};
		double b[]=max_min_ave(a);
		for(int i=0;i<b.length;i++)
			System.out.println("b["+i+"]="+b[i]);
		}
	static double[]max_min_ave(double a[]){
		double res[]=new double[3];
		double max=a[0],min=a[0],sum=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
			sum+=a[i];
		}
		res[0]=max;
		res[1]=min;
		res[2]=sum/a.length;
				return res;*/
	/* public static void main(String[]args) {
		    meth();
	 }
	 static {
	      	System.out.print("a和b求和e，求差f，求积g，求商h");
	    }
	 static int a=3;
	 static int b=5;
	 static void meth() {
	    	System.out.println("e="+(a+b));
	    	System.out.println("f="+(a-b));
	    	System.out.println("g="+(a*b));
	    	System.out.println("h="+(a+b));*/
		/*public static double[][]multiplyMatrix(double[][]a,double[][]b){
		if(a[0].length!=b.length) {
			return null;
		}
		double[][]c=new double[a.length][b[0].length];
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++){
				for(int k=0;k<a[0].length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
			  }
			}
		  }
		return c;
	}
	public static void printMatrix(double[][]c){
		if(c!=null) {
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[0].length;j++) {
				 	System.out.printf("%-8.1f",c[i][j]);//保留一位小数；
				}
			 	System.out.println();
			}
		    }else {
		     	System.out.println("无效");
     }
	 	System.out.println();
	}
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("input m=");
		 int m=input.nextInt();
		System.out.println("input n=");
		 int n=input.nextInt();
		     System.out.println("input k=");
		 int k=input.nextInt();
		 
		double[][]a=new double[m][n];
		double[][]b=new double[n][k];
		System.out.println("输入连续的数构成数组a:");
	    for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
		    a[i][j]=input.nextDouble();
		System.out.println("输入连续的数构成数组b:");
		for(int i=0;i<n;i++)
			for(int j=0;j<k;j++)／
				 b[i][j]=input.nextDouble();
		double[][]c=multiplyMatrix(a,b);
		System.out.println("Matrix a:");
		printMatrix(a);
		System.out.println("Matrix b:");
		printMatrix(b);
		System.out.println("Matrix c:");
		printMatrix(c);
		input.close();	*/
	
	 
	private static void select() {
		// TODO Auto-generated method stub
		
	}
	public static void select(int[]arr) {
		for(int x=0;x<arr.length;x++) {
		for(int y=x+1;y<arr.length;y++) {
			if(arr[x]>arr[y]) {
				int temp=arr[x];
				    arr[x]=arr[y];
				    arr[y]=temp;
			}
		}
		}
		System.out.println("排序过后的数：");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			}
		}
	  }	
	

int n1,n2,n3;
n1=s.length();
n2=tom.length();
n3="我喜欢打球".length();