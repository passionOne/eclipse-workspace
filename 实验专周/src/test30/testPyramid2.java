package test30;

public class testPyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <x; y++)
				System.out.print(" ");
			for(int z=1;z<=10-(2*x-1);z++)
				System.out.print("*");
			System.out.println();
	}
	}
}
