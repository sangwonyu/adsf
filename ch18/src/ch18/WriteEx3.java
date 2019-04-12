package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx3 {

	public static void main(String[] args)throws Exception {
		OutputStream os = new FileOutputStream("C:/tmp/test.txt");
		byte[] data = "WriteEx3".getBytes();
		os.write(data,1,2);//offset=1 len=2
		os.flush();
		os.close();
	}

}
