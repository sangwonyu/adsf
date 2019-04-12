package exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

public class OpenChallengeGrep {

	public static void main(String[] args)throws Exception {
		InputStream is = System.in;
		byte[] datas = new byte[100];
		System.out.print("찾을 문자열을 입력하세요> ");
		int chBytes=is.read(datas);
		String chData=new String(datas,0,chBytes-2);
		
		String filePath = "D:\\workspace\\SW\\JAVA\\ch18\\src\\ch18\\BufferInputStreamEx.java";

		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		int rowN = 0;
		String row;
		//하나씩 받은 문자를 저장하고 찾고자 하는 문자가 되면 출력그리고  char는 다시 null값으로, 이렇게 할 예정이었으나 완성 못함..
		/*char character;
		while((rowN=br.read())!=-1) {
			++row;
			String str+=Character.toString((char)rowN);
			if(str.equals(chData)) {
				System.out.print(row+": ");
				System.out.print(br.readLine());
				System.out.println();
			}
		}*/
		
		while((row=br.readLine())!=null) {
			++rowN;
			if(row.indexOf(chData)>-1) {
				System.out.print(rowN+": ");
				System.out.println(row);
			}
		}
		fr.close();
		br.close();
	}

}
