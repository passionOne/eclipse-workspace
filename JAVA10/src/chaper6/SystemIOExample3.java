package chaper6;

import java.io.*;

public class SystemIOExample3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("d:\\test.txt");
		BufferedOutputStream buffer_out = new BufferedOutputStream(out);
		String s = "These will be writed to d:\\test.txt file!\r\n";
		buffer_out.write(s.getBytes());
		buffer_out.write(s.getBytes());
		buffer_out.write(s.getBytes());
		buffer_out.write(s.getBytes());
		buffer_out.flush();
		buffer_out.close();
		FileInputStream in = new FileInputStream("d:\\test.txt");
		BufferedInputStream buffer_in = new BufferedInputStream(in);
		byte[] b = new byte[1024];
		int num = buffer_in.read(b);
		String str = new String(b, 0, num);
		System.out.println(str);
		buffer_in.close();
	}

}
