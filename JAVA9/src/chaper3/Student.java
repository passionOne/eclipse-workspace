package chaper3;

public abstract class Student {// 抽象类
	public String id;// 学生学号
	public String name;// 学生姓名
	public String className;// 班级

	public abstract void logIn();// 注册方法

	public abstract void clearOut();// 注销方法

}
