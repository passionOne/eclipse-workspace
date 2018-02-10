package test30;

abstract class Shape { // 定义抽象类 Shape
	abstract void display(); // 定义一个抽象的display方法，用来被继承。
}

class Circle extends Shape { // 定义 Circle类继承Shape类。
	void display() { // 在Circle类里写一个display方法，用来打印输出"Circle"。
		System.out.println("Circle");
	}
}

class Rectangle6 extends Shape { // 定义Rectangle6类继承Shape类。
	void display() { // 在Rectangle6类里写一个display方法，用来打印输出"Rectangle"。
		System.out.println("Rectangle");
	}
}

class Triangle extends Shape { // 定义Triangle类继承Shape类。
	void display() { // 在Triangle类里写一个display方法，用来打印输出"Triangle"。
		System.out.println("Triangle");
	}
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Circle()).display(); // 分别创建对象，调用display方法以打印出各自的形状。
		(new Rectangle6()).display();
		(new Triangle()).display();
	}
}
