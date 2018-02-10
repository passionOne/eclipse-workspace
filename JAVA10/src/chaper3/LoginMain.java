package chaper3;

import java.util.Scanner;
public class LoginMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validate test = new Validate();
		System.out.println("请输入用户名");
		Scanner inAccount = new Scanner(System.in);
		test.setAccount(inAccount.nextLine());
		System.out.println("请输入密码");
		Scanner inPassword = new Scanner(System.in);
		test.SetPassward(inPassword.nextLine());
		try {
			test.login(test.getAccount(), test.getPassward());
			System.out.println("登录成功");
		} catch (PasswardIncorrectException ex) {
			System.out.println("捕捉密码不正确异常\n" + ex);
		} catch (AccountNotExistException ex) {
			System.out.println("捕捉账户不正确异常\n" + ex);
		}
	}
}