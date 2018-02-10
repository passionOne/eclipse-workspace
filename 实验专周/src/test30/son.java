package test30;

public class son extends Father {
	String school;

	public son(String name,int age,String address,String tel,String school) {
		// TODO Auto-generated constructor stub
		super.Fateher(name, address, tel, age);
		this.school = school;
	}
	public void out() {
		System.out.println("姓名为：" + name + "地址" +address+ "电话为："+tel+"年龄为：" + age + "岁");
		this.outOther();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son c = new son("张三",  20,"高新区", "1362463482", "成都学院");
		c.out();
	}
}

