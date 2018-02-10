package Chaper8;

class Person{
	String name;//声明两个成员变量
	int age;
	//有参数构造方法
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//无参数构造方法
	public Person() {
		this.name="person name";
		this.age=23;
	}
	//成员方法，此时现实和的是父类成员变量的结果
	void pprint() {
		
		System.out.println("class:person;"+"name:"+this.name+"; age:"
				+this.age);
	}
}
//基于person类定义student子类
class student extends Person{
	String name;//在派生词中声明自己的成员变量
	int classno;//声明成员变量
	//无参数构造方法
	public student() {
		this.name="student name";
		this.age=20;
	}
	//有参数构造方法
	public student(String nae,int age,int classno) {
		this.name=name;
		this.age=age;
		this.classno=classno;
	}
	//成员变量。此时显示的是子类中成员变量的结果
	void sprint() {
		System.out.println("class:Student:"+this.name+";age:"
				+this.age+"; classno:"+this.classno);
	}
}
//声明公共类
public class VarInherit{
	public static void main (String[] args) {
		//调用无参数构造方法创建对象
		student obj1=new student();
		//调用有参数构造方法创建对象
		student obj2=new student("lixiao",18,1) ;
		obj1.pprint();
		obj1.sprint();
		obj2.pprint();
		obj2.sprint();
	}
}




