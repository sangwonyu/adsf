package ch18;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			File file = new File ("D:\\workspace\\SW\\JAVA\\ch18\\src\\ch18\\FileInputStreamEx.java");
			FileInputStream fis = new FileInputStream(file);
			
			int data;
			while((data=fis.read())!=-1) {
				System.out.write(data);
			}
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
