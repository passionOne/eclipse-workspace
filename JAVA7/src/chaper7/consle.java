package chaper7;

public class consle {
  double x1,x2;
  private double a,b,c;
  //带参数构造初始化成员变量
public consle(double a,double b,double c) {
	this.a=a;
	this.b=b;
	this.c=c;
}
//计算方法实根的方法 
void real_root(double delt) {
	x1=(-b+Math.sqrt(delt))/(2*a);
	x2=(-b-Math.sqrt(delt))/(2*a);
	System.out.println("delt>=0时,方程的实根为：\nx1="+x1);//输出方程的实根
	System.out.println("x2="+x2);
}
	//计算方程虚根的方法
	void imag_root(double delt) {
		double real,imag;
		
		real=(-b)/(2*a);
		imag=Math.sqrt(-delt)/(2*a);
		System.out.println("delt<0时,方程的虚根为：\nx1="+real+"+"+imag+"i");
	}
		//根据判别式delt的值，选择调用的方法
		void showRoot() {
			double delt=b*b-4*a*c;
			if(delt>=0)
				real_root(delt);
			else
				imag_root(delt);
		}
		public static void main(String[]args) {
			consle y1,y2;//声明对象
			y1=new consle(2,10,10);//使用带参数的构造方法创建对象
			y1.showRoot();//调用对象方法
			y2=new consle(2,10,8);
			y2.showRoot();
}
}

