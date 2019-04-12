package ch18;

import java.io.*;

public class PrintStreamEx {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/tmp/text10.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("프린터 보조 스트림");
		ps.print("마치 ");
		ps.println("프린터 한 것 처럼");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
		fos.close();
	}

}
