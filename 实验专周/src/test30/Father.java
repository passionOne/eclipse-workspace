package test30;

public class Father {
	String name;
	String address;
	String tel;
	int age;
	public void Fateher(String name,String address,String tel,int age) {
		this.name=name;
		this.address=address;
		this.tel=tel;
		this.age=age;
	}
	public void out() {
		System.out.println("姓名为："+name+"\n"+"年龄为："+age+"岁");
	}
    public void outOther() {
    	System.out.println("家庭地址："+address+"\n"+"电话为："+tel);
    }
}

