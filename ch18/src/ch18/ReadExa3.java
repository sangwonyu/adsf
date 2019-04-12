package ch18;
import java.io.FileReader;
import java.io.Reader;
public class ReadExa3 {

	public static void main(String[] args)throws Exception {
		Reader reader = new FileReader("C:/tmp/test2.txt");
		int readCharNo;
		char[] cbuf=new char[4];
		readCharNo = reader.read(cbuf,1,2);
		System.out.println(readCharNo);
		for(int i=0;i<cbuf.length;i++) {
			System.out.println(cbuf[i]);
		}
		
	}

}
