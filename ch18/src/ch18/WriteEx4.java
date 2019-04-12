package ch18;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx4 {

	public static void main(String[] args)throws Exception {
		Writer writer = new FileWriter("C:/tmp/test2.txt");
		String data= "안녕 자바 프로그램";
		writer.write(data);
		writer.flush();
		writer.close();
	}

}
