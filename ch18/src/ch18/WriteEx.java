package ch18;
import java.io.FileWriter;
import java.io.Writer;
public class WriteEx {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/tmp/test2.txt");
		char[] data = "홍길동".toCharArray();
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}

}
