import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String checkStr=null;
    System.out.println("请输入要检测的字符串：");
    Scanner in=new Scanner(System.in);
    checkStr=in.nextLine();
    if(isPaildrome(checkStr)) {
    	System.out.println(checkStr+"是回文串。");
    }else {
    	System.out.println(checkStr+"不是回文串。");
     }
    }
	private static boolean isPaildrome(String check) {
		int low=0;
		int high=check.length()-1;
		while(low<high) {
			if(check.charAt(low)!=check.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
}
