package opench;

import java.util.*;

public class Openchallenge1 {

	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		Employee employee = new Employee();
		String[] emlist = employee.names();

		// 1-1번 문제
		for (int i = 0; i < emlist.length; i++) {
			char firstName = emlist[i].charAt(0);
			if (Character.toString(firstName).equals("김")) {
				num++;
			} else if (Character.toString(firstName).equals("이")) {
				num2++;
			}
		}
		System.out.println("중복 포함 이: " + num2 + "김: " + num);

		// 1-2번문제
		num = 0;
		for (int i = 0; i < emlist.length; i++) {
			if (emlist[i].equals("이재영")) {

				num++;
			}
		}
		System.out.println("이재영 중복수: " + num);

		// 1-3번문제
		List<String> nameList = new ArrayList<String>();
		for (int i = 0; i < emlist.length - 1; i++) {
			for (int z = i + 1; z < emlist.length; z++) {
				if (emlist[i].equals(emlist[z])) {
					emlist[z] = "";
				}
			}
		}
		for (int i = 0; i < emlist.length; i++) {
			if (!emlist[i].equals("")) {
				nameList.add(emlist[i]);
			}
		}
		System.out.println(nameList);

		// 1-4
		String[] arr = new String[nameList.size()];

		for (int i = 0; i < nameList.size(); i++) {
			arr[i] = nameList.get(i);
		}
		bubbleSort1(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		// 2-1
		num=0;
		num2=0;
		List<String> employee2 =Arrays.asList("이유덕","이재영","권종표","이재영","박민호","강상희","이재영","김지완","최승혁","이성연","박영서","박민호","전경헌","송정환","김재성","이유덕","이재영","전경헌");
		for(String name:employee2) {
			if (Character.toString(name.charAt(0)).equals("김")) {
				num++;
			} else if (Character.toString(name.charAt(0)).equals("이")) {
				num2++;
			}
		}
		System.out.println("2-1문제 이: " + num2 + "김: " + num);
		
		// 2-2
		num=0;
		for(String name:employee2) {
			if (name.equals("이재영")) {
				num++;
			} 
		}
		System.out.println("2-2문제 이재영 중복수: " + num);
		
		//2-3
		Set<String> nameSet = new HashSet<String>();
		for(String name:employee2) {
			nameSet.add(name);
		}
		System.out.println("2-3문제"+ nameSet);
		
		//2-4
		TreeSet<String> nameTreeSet = new TreeSet<String>();
		for(String name:employee2) {
			nameTreeSet.add(name);
		}
		System.out.println("2-4문제"+ nameTreeSet);
	}
	
	
	
	static void bubbleSort1(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int z = i + 1; z < arr.length; z++) {
				if (arr[i].compareTo(arr[z]) > 0) {
					String name = arr[i];
					arr[i] = arr[z];
					arr[z] = name;
				}
			}
		}
	}
}
