package test30;

public class person {
	String name;
	int age;

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(name + " " + "is" + " " + age + " " + "years old");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person v1 = new person("petter", 20);
		v1.print();
	}
}
