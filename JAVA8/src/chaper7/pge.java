package chaper7;
abstract class pge1{
	private String shape;
	public pge1(String shape) {
		this.shape=shape;
	}
	public pge1() {
		this("未知图形");
	}
	public abstract double area();
	public void print() {
		System.out.println(this.shape+"面积为"+this.area());
	}
}
class Rectangle extends pge1{
	protected double length;
	protected double width;
	public Rectangle(double length,double width) {
		super("长方形");
			this.length=length;
		this.width=width;
	}
	public Rectangle(double width) {
		super("正方形");
		this.length=length;
		this.width=width;
	}
	public Rectangle() {
	}
	public double area() {
		return width*length;
	}
}
class Eclipse extends pge1{
	protected double radius_a;
	protected double radius_b;
	public Eclipse(double radius_a,double radius_b) {
		super("椭圆");
		this.radius_a=radius_a;
		this.radius_b=radius_b;
	}
	public Eclipse (double radius_a) {
		super("圆");
		this.radius_a=radius_a;
		this.radius_b=radius_a;
	}
	public Eclipse() {
	}
	public double area() {
		return Math.PI*radius_a*radius_b;
    }
}
public class pge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          pge1 c1=new Rectangle(10,20);
         c1.print();
         c1=new Rectangle(10);
         c1.print();
         c1=new Rectangle();
         c1.print();
         c1=new Eclipse(10,20);
         c1.print();
         c1=new Eclipse(10);
         c1.print();
         c1=new Eclipse();
         c1.print();
	}
}
