package chaper7;

import mypackage.*;
import mypackage.entity.Reader;

public class ImportSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Book book=new Book();   //基于Book类创建book对象
         book.show();            //调用book对象的show方法
        // Story story =new Story();   //基于Story类创建story对象；非法
        //story.show();               //调用Story的show方法；
         TextBook textbook=new TextBook();
         textbook.show();
         Reader reader=new Reader();
         reader.show();
	}
}
