package exercise;

import java.io.*;

public class OpenChallengeHexaDump {

	public static void main(String[] args) throws IOException {

		byte[] buf = new byte[16];
		int row; int offset = 0;

		InputStream is = new FileInputStream("D:\\workspace\\SW\\JAVA\\ch18\\bin\\ch18\\BufferInputStreamEx.class");
		//buf 읽을 단위를 제공하면서 저장되는 공간, row는 단순히 buf가 읽은 단위를 나타냄.
		while ((row = is.read(buf)) > -1) {
			System.out.printf("%08X: ", offset);
			for(int i=0;i<row;i++) {
				System.out.printf("%02X ", buf[i]);
				if (i==7) System.out.print(" ");
			}
			if (row != 16) {
				for(int i=0;i<(16-row)*3+1;i++) {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			showChar(buf, row);
			offset += 16;
		}
	}
	
	static void showChar(byte[] buf, int size) {
		for (int i=0; i<size; i++) {
			if (buf[i] >= 32 && buf[i] <= 126)
				System.out.print((char)buf[i]);
			else
				System.out.print(".");
			if (i==7) System.out.print(" ");
		}
		System.out.println();
	}
}
