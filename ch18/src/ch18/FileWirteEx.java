package ch18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWirteEx {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/tmp/text10.txt");
		FileWriter fw = new FileWriter(file,false);//append 모드 true
		fw.write("FileWirter는 에펜드에펜드어어어억" + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다.헤아아하앙 " + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
		
	}

}
