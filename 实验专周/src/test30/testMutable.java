package test30;

public class testMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z;
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= x; y++)
				System.out.print(x+"*"+y+"="+y*x+"\t");
			System.out.println();
		}
	}
}
