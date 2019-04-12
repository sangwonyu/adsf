package ch18;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/tmp/test2.txt");
		int readData;
		while (true) {
			readData = reader.read();
			if (readData == -1)
				break;
			System.out.println((char) readData);
		}
		reader.close();
	}

}
