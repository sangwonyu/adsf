package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Outputex2 {

	public static void main(String[] args)throws Exception {
		OutputStream os = new FileOutputStream("C:/tmp/test.txt");
		byte[] data = "Outputex2".getBytes();
		os.write(data);
		os.flush();
		os.close();

	}

}
