package chaper5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteCardTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream(	"/Users/lixiao/Desktop/text ");
		for (int i = 48; i <= 59; i++) {
			fos.write(i);
		}
		fos.close();
		FileInputStream fis = new FileInputStream("/Users/lixiao/Desktop/text");
		int n;
		while ((n = fis.read()) != -1);
		{
			System.out.println((char) n + "");
		}
	}
}













