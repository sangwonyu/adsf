package ch18;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class ReadExample {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/tmp/test.txt");
		int readByte;
		while(true) {
			readByte=is.read();
			if(readByte==-1)break;//읽을 것이 없으면 -1의미
			System.out.println((char)readByte);
		}
		is.close();
	}

}
