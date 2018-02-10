package chaper3;

public class AccountNotExistException extends Exception {
	public AccountNotExistException() {
	}

	public AccountNotExistException(String message) {
		super(message);
	}
}
