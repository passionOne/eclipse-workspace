import java.util.Scanner;

public class java5 {
		private static double[][] a;
		private static double[][] b;
		// TODO Auto-generated method stub
		public static double[][]multiplyMatrix(double[][]a,double[][]b){
			if(a[0].length!=b.length) {
				return null;
			}
			return b;
			}
		public static void main1(String[]args) {
			Scanner input=new Scanner(System.in);
			System.out.println("input m=");
			 int m=input.nextInt();
			System.out.println("input n=");
			 int n=input.nextInt();
			     System.out.println("input k=");
			
			System.out.println("输入连续的数构成数组a:");
		    for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
			    a[i][j]=input.nextDouble();
			
			double[][]c=multiplyMatrix(a,b);
			System.out.println("Matrix a:");
			printMatrix(a);
			input.close();
		  }
		private static void printMatrix(double[][] a) {
			// TODO Auto-generated method stub
			
		}	
      }
