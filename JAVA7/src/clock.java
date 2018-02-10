
public class clock{
	int hour,minute,second;
	clock(int xiaoshi,int fenzhong,int miao)
	{
	 hour=xiaoshi;
	 minute=fenzhong;
	 second=miao;
	}
	void show()
	{
System.out.println("现在的时间为：" +hour+":"+minute+":"+second);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clock clock1=new clock(1,50,45);
		clock1.show();
		clock clock2=new clock(11,53,25);
		clock2.show();
		clock clock3=new clock(20,16,4);
		clock3.show();
}		
	}

	
	