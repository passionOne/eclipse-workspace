package test30;

public class testPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5 - x; y++)
				System.out.print(" ");
			for(int z=1;z<=2*x-1;z++)
				System.out.print('*');
			System.out.println();
		}
	}
}
