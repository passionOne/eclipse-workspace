package chaper1;

public abstract interface IUnionPay {
	// 验证密码
	boolean proof(String input);

	// 取钱
	boolean drawmoney(double moeny);

	// 余额查询
	double enquiry(double ball);
}
