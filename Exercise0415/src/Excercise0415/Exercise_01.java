package Excercise0415;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercise_01 {

	public static void main(String[] args) {
		HashMap<Integer, String> participants = new HashMap();
		// 참가자 명단
		participants.put(0, "최형준");
		participants.put(1, "홍길동");
		participants.put(2, "홍길동");
		participants.put(3, "홍길동");
		participants.put(4, "김범현");
		participants.put(5, "유상원");
		participants.put(6, "박진우");
		
		name(participants);
	}

	public static void name(HashMap<Integer, String> participants) {
		ArrayList<String> parti = new ArrayList<String>();
		int random = (int) (Math.random() * participants.size());
		for (int i = 0; i < participants.size(); i++) {
			if (random != i) {
				parti.add(participants.get(i));
			}
		}
		System.out.println("completioners:");
		for (String arr : parti) {
			System.out.println(arr);
		}
		System.out.println();

		System.out.println("탈락자: " + participants.get(random));
	}
}
