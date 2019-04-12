package ch18;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx2 {

	public static void main(String[] args)throws Exception {
		Writer writer = new FileWriter("C:/tmp/test2.txt");
		char[] data = "홍길동 홍길동".toCharArray();
		writer.write(data);
		writer.flush();
		writer.close();
	}

}
