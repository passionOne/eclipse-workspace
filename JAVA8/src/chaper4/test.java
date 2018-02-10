package chaper4;

public class test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          pclass my1=new pclass();//创建plass类对象my1;
          Sclass my2=new Sclass();//创建Sclass类对象my2;
          my1.Draw();//调用my1的方法
          my2.Draw();//调用my2的方法
          my2.NewDraw();//调用my2的NewDraw的方法
          my1=my2;//将子类对象赋值给父类对象
          //调用转换后my1对象的Draw方法（实际上已是子类对象的Draw方法
          my1.Draw();
	}
}
	