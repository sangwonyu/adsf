package ch18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\tmp\\Lighthouse.jpg");
		FileOutputStream fos = new FileOutputStream("C:\\tmp\\Copy.jpg");
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while( (readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
	}

}
