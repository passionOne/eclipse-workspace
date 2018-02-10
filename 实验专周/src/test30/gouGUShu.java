package test30;

public class gouGUShu {

	public static void main(String[] args) {
		int i, j, k;
		int l = 0;
		for (i = 1; i <= 1000; i++)
			for (j = i + 1; j <= 1000; j++)
				for (k = j + 1; k <= 1000; k++) {
					if (k * k == i * i + j * j) {
						l++;
						System.out.println("i=" + i + "\tj=" + j + "\tk=" + k);
					}
				}
		System.out.println("勾股数的个数为：" + l);
	}
}
