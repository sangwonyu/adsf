package ch18;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class ReadEx2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/tmp/test.txt");
		int readByteNo;
		byte[] readBytes=new byte[3];//3개씩 읽어드림 hello 5글자중 먼저 hel읽고 나머지 lo읽음
		String data="";
		while(true) {
			readByteNo=is.read(readBytes);//3개박스씩
			System.out.println(readByteNo);
			if(readByteNo==-1)break;//읽을 것이 없으면 -1의미
			data +=new String(readBytes,0,readByteNo);//String(byte타입변수,offset,length)
		}
		System.out.println(data);
		is.close();
	}

}
