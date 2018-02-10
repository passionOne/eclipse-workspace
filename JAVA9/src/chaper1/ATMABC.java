package chaper1;

import java.util.Scanner;

public class ATMABC extends ATMCBC implements IABC {

	public boolean PayTelBill(String tel, double money) {
		if (money <= card.balance) {
			card.balance -= money;
			return true;
		} else {
			return false;
		}
	}
}
