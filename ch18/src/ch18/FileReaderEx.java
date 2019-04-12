package ch18;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("D:\\workspace\\SW\\JAVA\\ch18\\src\\ch18\\FileReaderEx.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo=fr.read(cbuf))!=-1) {
			String data = new String (cbuf,0,readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
