package chaper5;

import java.util.Random;

public class random {
	private Random rand=new Random();
	public Shape next(){
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
		    return new  Triangle();
		}
    }
	
	private static  random gen=new random();
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Shape[]s=new Shape[9];
			for(int i=0;i<s.length;i++)
				s[i]=gen.next();
			for(Shape shp:s)
				shp.draw();
	    }
}

	
	
	
	
	

	
