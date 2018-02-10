import java.util.Arrays;

public class change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    byte []b= {65,66,67,68,69,70,71,72,73,74,75};
     char []c= {'a','b','c','d','e','f','g','h','i','j','k'};
     String str,str1,str2,str3;
     str=new String(b);
     System.out.println(str);
     str1=new String(b,2,8);
     System.out.println(str1);
     str2=new String(c);
     System.out.println(str2);
     str3=new String(c,2,8);
     System.out.println(str3);
     System.out.println(c);
     
	}
  }

 


