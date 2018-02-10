package test30;

public class ziShouSu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 10000; i++) {
			String strI = String.valueOf(i);
			String multiStr = String.valueOf(i * i);
			String last = multiStr.substring(multiStr.length() - strI.length());
			if (last.equals(strI)) {
				System.out.println(i + "*" + i + "=" + multiStr + "--> " + i + " 是自守数" + "");
			}
		}
	}
}
