package test30;

public class Rectangle {
	double width;
	double height;
	double z;
	double a;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public void jisuanZhou() {
		System.out.println("该矩形的周长为：" + (z = width * 2 + height * 2) + "厘米");
	}
	public void jisuanArea() {
		System.out.println("该矩形的面积为：" + (a = height * width) + "平方厘米");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle b2 = new Rectangle(4.3, 5.4);
		b2.jisuanZhou();
		b2.jisuanArea();
	}
}
