package 圆计算的测试;

class circle {
	double radius;
	final double PI = 3.14;
	public circle(double radius) {
		this.radius = radius;
	}
	public double calCir() {
		return 2 * PI * radius;
	}
	public double calArea() {
		return PI * radius * radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle cir = new circle(1.5);
		System.out.println("圆的周长:" + cir.calCir());
		System.out.println("圆的周长:" + cir.calArea());
	}
}

