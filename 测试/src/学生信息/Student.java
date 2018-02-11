package 学生信息;

class student1 {
	int age;
	public void setAge(int age) {
		this.age = age;
	}
	public void printAge() {
		System.out.println("年龄为：" + age);
	}
}
public class Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1 = new student1();
		student1 s2 = new student1();
		s1.setAge(18);
		s2.setAge(19);
		s1.printAge();
		s2.printAge();
		//github 代码改动
		//again
		//sourcetree
	}
}
