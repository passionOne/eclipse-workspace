
public class NumberManager {
public static int []countNumber(String[]numbers){
	int[]numberArray=new int[10];
	for(int i=0;i<numbers.length;i++) {
		for (int j=0;j<numbers[i].length();j++) {
			numberArray[numbers[i].charAt(j)-'0']++;
		}
	}
	return numberArray;
}
	private static void printArray(int[]numArr) {
		for(int i=0;i<numArr.length;i++) {
			System.out.printf(i+":"+numArr[i]+",");
		}
		System.out.println();
	}
	public static String[]replaceNumber(String[]numbers,int[]numberCounts){
		String[]results=new String[numbers.length];
		int replaceNum=getMaxNumber(numberCounts);
		for(int i=0;i<numbers.length;i++) {
			String replaceString=replaceOneString(replaceNum,numbers[i]);
			results[i]=replaceString;
		}
		return results;
	}
	private static int getMaxNumber(int[]numberCounts) {
		int currenMaxNumber=-1;
		int index=-1;
		for(int i=0;i<numberCounts.length;i++) {
			if(numberCounts[i]>currenMaxNumber) {
				currenMaxNumber=numberCounts[i];
				index=i;
			}
		}
		return index;
	}
	private static String replaceOneString(int replaceNum,String oldString) {
		StringBuffer strBuf=new StringBuffer();
		char replacedChar=(char)(replaceNum+'0');
		for (int i=0;i<oldString.length();i++) {
			char ch=oldString.charAt(i);
			if(ch==replacedChar) {
				ch='8';
			}else if(ch=='8') {
				ch=replacedChar;
			}
			strBuf.append(ch);
		}
		return strBuf.toString();
		}
		private static void printString(String[] newArr){
			for(int i=0;i<newArr.length;i++) {
				System.out.println(newArr[i]);
				System.out.println();
			}
		}
		public static void main(String[]args) {
		/*	String[]numbers= {"18223684560","92865650","35933"};
			System.out.println("原始的电话号码：");
			for(int i=0;i<numbers.length;i++) {
				System.out.println(numbers[i]);
			}
			int[]numArr=countNumber(numbers);
			System.out.println("各数字在电话号码中出现的频率：");
			
			printArray(numArr);	
			String[]newArr=replaceNumber(numbers,numArr);
			System.out.println("高频数字与8互换后的电话号码：");
	
			printString(newArr);*/
			/*int a=8;
			float b=3.14f;
			double c=3.1415926;
			String str1=String.valueOf(a);
			System.out.println(str1);
			String str2=String.valueOf(b);
			System.out.println(str2);
			String str3=String.valueOf(c);
			System.out.println(str3);*/
			//第五个作业
		   }
	    }
			 

			
		


