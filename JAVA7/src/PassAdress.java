
public class PassAdress {
    int a=25;
    int b=5;
    static void doPower(PassAdress p) {
    	    p.a+=8;
       	p.b*=7;
    }
    public static void main(String[]args) {
    	PassAdress p=new PassAdress();
    	System.out.println("传递之前a和b的数值分别是："+p.a+","+p.b);
    	doPower(p);
    	System.out.println("a传递之后a和b的数值分别是："+p.a+","+p.b);
    }
}
