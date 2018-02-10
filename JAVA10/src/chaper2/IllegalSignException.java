package chaper2;

//自定义异常类，当输入的运算符不是符合的运算符时抛出异常
public class IllegalSignException extends Exception {
	private String message;
	public IllegalSignException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
