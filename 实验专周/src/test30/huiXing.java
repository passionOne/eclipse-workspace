package test30;

public class huiXing {

	public static void main(String[] args) {

		int m = 8;
		int n = 8;
		int[][] pos = new int[m][n];
		int count = 0;
		int r = 0, c = 0;
		final int up = 1;
		final int down = -1;
		final int left = 2;
		final int right = -2;
		int dir = right;
		int cir = 1;
		while (count < m * n) {
			count++;
			pos[r][c] = count;
			switch (dir) {
			case right:
				if (c < n - cir) {
					c++;
				} else {
					dir = down;
					r++;
				}
				break;
			case down:
				if (r < m - cir) {
					r++;
				} else {
					dir = left;
					c--;
				}
				break;
			case left:
				if (c > cir - 1) {
					c--;
				} else {
					dir = up;
					r--;
				}
				break;
			case up:
				if (r > cir) {
					r--;
				} else {
					cir++;
					dir = right;
					c++;
				}
				break;
			}
		}
		System.out.println("测试结果为：");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (pos[i][j] < 10) {
					System.out.print(pos[i][j] + " " + " ");
				} else {
					System.out.print(pos[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
