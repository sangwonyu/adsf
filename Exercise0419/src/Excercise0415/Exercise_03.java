package Excercise0415;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Exercise_03 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\workspace\\SW\\JAVA\\Exercise0415\\src\\Excercise0415\\가사.text");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
		String row;
		Word wordSet;
		int sameWord = 1;
		int total = 1;
		
		while ((row = br.readLine()) != null) {
			StringTokenizer strToken = new StringTokenizer(row, " .,");
			while (strToken.hasMoreTokens()) {
				String word = strToken.nextToken();
				wordSet=new Word(1,word);
				HashMap<Integer, String> wordMap = new HashMap<Integer, String>();
				
				wordMap.put(total, word);
				total++;
			}
		}
	}

}
