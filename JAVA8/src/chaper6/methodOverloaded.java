package chaper6;

public class methodOverloaded {
	int add(int x1,int x2) {
		return x1+x2;
}
	double add(double x1,double x2) {
		return x1+x2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloaded b1 =new methodOverloaded() ; 
	System.out.println("int add="+b1.add(1, 23));
	System.out.println("double add="+b1.add(9.9, 13.14));
	}
}
