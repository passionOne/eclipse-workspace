package chaper1;

public class ATMCBC implements IUnionPay, IPolice {

	public Card card;

	public void insert(Card card) {
		this.card = card;
	}

	// 验证密码
	public boolean proof(String input) {

		// TODO Auto-generated method stub
		if (input.equals(card.password)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	// 取钱的方法
	public boolean drawmoney(double money) {
		// TODO Auto-generated method s
		if (card.balance - money > 0) {
			card.balance -= money;
			return true;
		} else {
			return false;
		}
	}

	@Override
	// 查询卡中余额的方法
	public double enquiry(double ball) {
		// TODO Auto-generated method stub
		return card.balance;
	}

	// 摄像的方法
	public void takePic() {
		System.out.println("你已经进入摄像区");
	}
}
