package test;

public class xxlingxing {

	private static final int z = 0;
	private static int x;
	private static int a;
	private static int b;
	private static int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  System.out.println("星星菱形图案如下:");   
			  System.out.println();
			  for(int x=1;x<=5;x++)
			  {
				  for(int y=1;y<=5-x;y++)
					  System.out.print(" ");    
				  for(int z=1;z<=2*x-1;z++)
					  System.out.print('*');
				  System.out.println();    
			  }
			  for(int a=1;a<=4;a++)
			  {
				  for(int b=1;b<=a;b++)
				  System.out.print(" ");    
			  for(int c=7;c>=2*a-1;c--)
				  System.out.print('*');    
			  System.out.println();    
	}

}
}
