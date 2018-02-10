package test30;

public class Course {
	 private String  cNumber;
     private String cName;
     private int cUnit;
     public Course(String  cNumber,String cName,int cUnit) {
    	 this.cNumber=cNumber;
    	 this.cName=cName;
    	 this.cUnit=cUnit;
     }
     public void Course() {
    	 System.out.println("课程号："+cNumber+" "+"课程名："+cName+" "+"学分："+cUnit);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Course z1=new Course("101", "JAVA", 4);
       z1.Course();
	}	
}
