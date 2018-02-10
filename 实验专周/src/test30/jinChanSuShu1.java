package test30;

public class jinChanSuShu1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[6];
		for (int i = 13579; i <= 97531; i += 2) {
			int t = 0;
			for (int j = 3; j <= Math.sqrt(i); j += 2) {
				if (i % j == 0) {
					t = 1;
					break;
				}
			}
			a[1] = i / 10000;
			a[2] = (i / 1000) % 10;
			a[3] = (i / 100) % 10;
			a[4] = (i / 10) % 10;
			a[5] = i % 10;
			if (t == 0) {
				for (int x = 1; x <= 5; x++) {
					if (a[x] % 2 == 0) {
						t = 1;
						break;
					}
				}
			}
			if (t == 0) {
				for (int x = 1; x <= 4; x++) {
					for (int y = x + 1; y <= 5; y++) {
						if (a[x] == a[y]) {
							t = 1;
							break;
						}
					}
				}
			}
			if (t == 0) {
				if (a[3] == 1 || a[3] == 9) {
					t = 1;
				}
			}
			if (t == 0) {
				int num = a[2] * 100 + a[3] * 10 + a[4];
				for (int j = 3; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						t = 1;
						break;
					}
				}
			}
			if (t == 0) {
				System.out.println("金蝉素数"+i);
			}
		}
	}
}
