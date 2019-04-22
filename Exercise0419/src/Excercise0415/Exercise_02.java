package Excercise0415;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exercise_02 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\workspace\\SW\\JAVA\\Exercise0415\\src\\Excercise0415\\addInput.text");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
		String row;
		TreeSet<Member> memberSet = new TreeSet<Member>();
		Member member;
		while ((row = br.readLine()) != null) {
			String[] arr = row.split(",");
			if (arr.length == 2) {
				member = new Member(arr[0], arr[1]);
			} else
			member = new Member(arr[0], arr[1], arr[2]);
			memberSet.add(member);
		}
		for (Member mem : memberSet) {
			System.out.println(mem);
		}
		br.close();
	}

}
