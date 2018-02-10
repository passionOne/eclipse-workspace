package chaper81;

public class subclass extends parentclass{
	void sprint() {
		this.print();
		this.print1();
	}
	//声明同类型。同名。同参数成员方法】、
	void print() {
		System.out.println("子类：同类型，同名，同参数成员方法！");
		//声明同类型。同名但参数不同的成员方法！
		}
	void print1() {
			System.out.println("父类：同类型，同名但参数不同的成员方法！");
		}
}
