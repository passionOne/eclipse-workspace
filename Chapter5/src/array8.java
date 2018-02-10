import java.util.ArrayList;
import java.util.Scanner;

public class array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("请输入：");
         Scanner in=new Scanner(System.in);
         String  s1=in.nextLine();
         ArrayList List = new ArrayList();
    for(int i=0;i<s1.length();i++) {
     	 char c=s1.charAt(i);
     	 if(s1.indexOf(c,i+1)>-1) {
    		 Character ch=new Character(c);
    		 if(!List.contains(ch))
    			List.add(ch);
     	}
    }
    for(int i=0;i<List.size();i++) {
    	     System.out.print(List.get(i)+",");
        }
	}
}
