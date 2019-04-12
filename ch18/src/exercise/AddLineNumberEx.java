package exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberEx {

	public static void main(String[] args) throws Exception{
		String filePath = "D:\\workspace\\SW\\JAVA\\ch18\\src\\ch18\\BufferInputStreamEx.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		int rowN=0;
		String row;
		while((row=br.readLine())!=null) {
			System.out.println(++rowN+": "+row);
		}
		fr.close();br.close();
	}

}
