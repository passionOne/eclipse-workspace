package test;

public class JAVA7 {

	private static int n1;
	private static int n2;
	private static int n3;

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		/*String s="we are students",tom="我们是学生";
		n1=s.length();
		n2=tom.length();
		n3="我喜欢打球".length();
		System.out.println(s.charAt(0));
		System.out.println(tom.charAt(3));
		System.out.println(n1);
		System.out.println(n2);*/
		//字符串长度计算length()方法
		
		/*String tom=new String("we are students");
		String boy=new String("We are students");
		String jerry=new String("we are students");
		System.out.println(tom.equals(boy));
		System.out.println(tom.equals(jerry));*/
		//字符串的比较（equals()方法）
		/*String tom=new String("abc"),jerry=new String("ABC");
		System.out.println(tom.equalsIgnoreCase(jerry));*/
		//字符串比较的String中的equalsIgnoreCase()方法
		String tom="Login:张三";
		String tom1="Logout:张三";
		boolean str=tom.startsWith("Login");
		System.out.println(str);                                   
		System.out.println(tom1.startsWith("Logout"));
		//字符串比较,endsWith()方法
		/*String tom="220302620629021",jerry="21079670924022";
		System.out.println(tom.endsWith("021"));
		System.out.println(jerry.endsWith("021"));*/
		//字符串比较，endswith(String s)方法，判断字符串的后缀是否是字符串S
		/*String tom="220302620629021",jerry="21079670924022",
				jack="022030938476352";
		System.out.println(tom.regionMatches(0,jerry,2,2));
		System.out.println(tom.regionMatches(0,jack,1,3));*/
		//字符串比较，regionMacthes()方法
		/*String str="abcde";
		System.out.println(str.compareTo("boy"));
		System.out.println(str.compareTo("abc"));
		System.out.println(str.compareTo("abcde"));*/
		//字符串比较,compareTo("")方法
		/*String str="abcde";
		System.out.println(str.compareToIgnoreCase("Boy"));
		System.out.println(str.compareToIgnoreCase("abc"));
		System.out.println(str.compareToIgnoreCase("aBcde"));*/
		//字符串比较,compareToIgnoreCase("")方法
		/*String strSource="I love java,really love!";
		System.out.println(strSource.lastIndexOf('a'));
		System.out.println(strSource.lastIndexOf("",10));
		System.out.println(strSource.lastIndexOf("love"));
	    System.out.println(strSource.lastIndexOf("love",10));*/
	    //字符串检索
		/*String strSource=new String("JAVA is inteesting");
		String strNewl=strSource.substring(5);
		String strNewl1=strSource.substring(5,6);
		System.out.println(strSource.substring(5));
		System.out.println(strSource.substring(5,6));(*/
		//字符串截取
	   /* String s="i mist theep";
      	String temp=s.replace('t','s');
	    String s1="i am a student";
        	String temp1=s1.trim();
	    System.out.println(s.replace('t','s'));
	    System.out.println(s1.trim());*/
		//字符串的替换
		/*String str="LOVE";
		String change=str.toLowerCase();
		System.out.println(str.toLowerCase());
		String str1="guifang";
		String change1=str1.toUpperCase();
		System.out.println(str1.toUpperCase());*/
		//字符串大小写转换
		/*String str="my string";
		char[] c;
		c=str.toCharArray();
		System.out.println(c);*/
		//字符串转换为字符数组
		/*String str="i love you ",str1=",you konw";
		String str2=str.concat(str1);
		System.out.println(str2);*/
		//连接两个字符串
		
		/*StringBuffer sbf=new StringBuffer("1+2=");//StringBuffer方法
		int nthree=3;
		sbf.append(nthree);
		System.out.println(sbf);*/
		//添加操作append()；
		/*StringBuffer sbf=new StringBuffer("1+=2");
	    int nOne=1;
		sbf.insert(2,nOne);
		System.out.println(sbf);*/
		//插入操作insert();
		/*StringBuffer sbf=new StringBuffer("1+1=2");//不怎么东懂
		//String s=sbf.toString();
		System.out.println(sbf.capacity());*/
		//字符串缓冲区与字符串之间的转换；
		/*StringBuffer sbf=new StringBuffer(10);          
		sbf.append("My");
		char c=sbf.charAt(0);
		System.out.println(c);*/
		//取字符
		/*StringBuffer sbf=new StringBuffer("do my best");
		sbf.delete(0,3);
		System.out. println(sbf);*/
		//删除字符delete();
		/*StringBuffer sbf1=new StringBuffer("you are my baby");   
		sbf1.deleteCharAt(10);
		System.out. println(sbf1);*/
		//删除字符deleteCharAt()方法；
		/*StringBuffer sbf3=new StringBuffer("i only an eyes of you");
		String str=new String("the");
		sbf3.replace(7,9,str);
		System.out.println(sbf3);*/
		//内容替换delete();方法；
		/*StringBuffer sbf=new StringBuffer("You are my baby");
		String str=sbf.substring(0,2);
		System.out.println(str);*/
		//取子串substring();1
		/*StringBuffer sbf=new StringBuffer("You are my baby");
		String str=sbf.substring(4);
		System.out.println(str);*/
		//取子串substring();2
		/*StringBuffer sbf=new StringBuffer("you are my baby");
		StringBuffer str=sbf.reverse();
		System.out.println(str);*/
		//字符串反转reserse();方法
		/*StringBuffer sbf=new StringBuffer(10);
		sbf.append("you");                                                 // 不懂
		System.out.println("字符串缓冲区的容量为："+sbf.capacity());*/
		//获取长度capacity();方法
		/*StringBuffer sbf=new StringBuffer(10);
		sbf.append("you");
		System.out.println("字符串缓冲区中字符串的长度为："+sbf.length());*/
		//获取长度length();方法
		
		
		
		
		
		
		
		
		
				
		
	}

	private static String sbfcapacity() {
		// TODO Auto-generated method stub
		return null;
	}	

}
