package chaper3;

class personA{
	String name;
	int age;
	public personA(String nmae,int age) {
		this.name=name;
		this.age=age;
	}
	public personA() {
		this.name="person name";
		this.age=20;
	}
	void pprint() {
		System.out.println("class:person;"+"name:"+this.name+";age:"+this.age);
	}
}
	class StudentA extends personA{
		String name;
		int classno;
		public StudentA() {
			super("xyz",30);//调用父类的有参数方法
			this.name="student name";
			this.age=20;
		}
		public StudentA(String name,int age,int classno) {
			super(name,age);//调用父类的有参数方法
			this.name=name;
			this.age=age;
			this.classno=classno;
		}
		//成员方法，此时显示的是子类中成员变量的结果
		void sprint() {
			System.out.println("class:student;"+"Name:"+this.name+";"
					+ "age:"+this.age+"; classno:"+this.classno);
			//成员方法，利用super命令显示父类成员变量
			System.out.println("父类中name成员变量：“+super.name");
		}
	}

	//声明公共类
	public class ConstructorInherit{
		public static void main (String[] args) {
			StudentA my=new StudentA();
			StudentA my1=new StudentA("Lixiao",17,1);
			my.pprint();
			my.sprint();
			my1.pprint();
			my1.sprint();
		}
	}
