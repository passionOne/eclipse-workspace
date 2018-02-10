package chaper3;

public class Validate {
	private String account, passward;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassward() {
		return passward;
	}

	public void SetPassward(String passward) {
		this.passward = passward;
	}

	public void login(String account, String passward) throws AccountNotExistException, PasswardIncorrectException {
		if (!validateAccount(account)) {
			throw new AccountNotExistException("账号不存在");
		}
		if (!validatePassward(account, passward)) {
			throw new PasswardIncorrectException("密码错误");
		}
	}

	// 验证账号是否存在
	private boolean validateAccount(String account) {
		// TODO Auto-generated method stub
		if (account.equals("xiaokeai")) {
			return true;
		}
		return false;
	}

	// 验证密码是否正确
	private boolean validatePassward(String account, String passward) {
		// TODO Auto-generated method stub
		if (account.equals("xiaokeai") && passward.equals("520")) {
			return true;
		}
		return false;
	}
}