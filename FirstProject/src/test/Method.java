package test;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char lixiao,ch='Y';
		double card3=10;
		lixiao=buy(ch,card3);
		System.out.println(lixiao);
	}
		public static char buy(char Y,double card) {
			System.out.println("计算两个数的和");
			System.out.println("走向食堂");
			System.out.println("打饭");
			card=card-3;
			System.out.println(card);
			System.out.println("回宿舍把Y给室友");
			return Y;	
	}

}
