package test30;

public class suShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k = 0;
		for (i = 2; i <= 100; i++) {
			for (j = 2; j < i; j++)
				if (i % j == 0)
					break;
			if (j < i)
				continue;
			else
				System.out.print(i + " ");
			k++;
		}
		System.out.println("\n" + "100以内的所有素数有：" + k + "个");
	}
}

/*
 * public static void main(String[] args) { int i,j; for(i=1;i<=100;i++) {
 * for(j=2;j<i;j++) { if(i%j==0) { break; } } if(i==j) { System.out.println(i);
 * }
 * 
 * }
 * 
 * }
 */