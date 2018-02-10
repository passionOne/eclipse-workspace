package test30;

public class Tom {
	static private double weight;
	 static String name;

	public  void setValue(double weight,String name) {
		 weight=0;
		name="3";
	}
	public void out() {
		System.out.println(name+"的体重为："+weight+"斤");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tom x1=new Tom();
		x1.weight=20.0;
	    x1.name="Tom";
        x1.out();
	}
}
