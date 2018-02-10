package chaper81;

public class parentclass {
	void pprint() {
		this.print();
		this.print1(0);
	}
	private void print1(int i) {
		// TODO Auto-generated method stub
		
	}
	//声明同类型、同名、同参数成员方法
	void print() {
		System.out.println("父类：同类型，同名，同参数成员方法！");
	}
	//声明同类型，同名但不同参数的成员方法
	void print(int a) {
		System.out.println("父类：同类型，同名但参数不同的成员方法！");
	}
}


