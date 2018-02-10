
public  class StaticDemo {
     private int x;    //声明实例变量
     private static int y;
     int z;               //声明类变量
     public static void setXY1(int newX,int newY) {  //声明类方法
    	 //x=newx;//非法
    	 y=newY;//合法
    	// System.out.println(x,y);错误 x为非静态
    	 System.out.println(y);
     }
     public void setXY2(int newX,int newY) { //声明实例方法
    	 x=newX;
    	 y=newY;
    	 z=x+y;;
    	 
    	 System.out.println(x+y);
     }
     public static void main(String args[]) {   
    	 StaticDemo t1=new StaticDemo(); //创建对象
    	 StaticDemo.setXY1(10,20);
    	 //StaticDemo.setXY2(z);  //非法，不能直接引用类的实例方法
    	 t1.setXY1(1, 18); //合法
    	 t1.setXY2(7, 19); //合法
     } 
}
