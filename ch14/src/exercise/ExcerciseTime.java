package exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcerciseTime {

	public static void main(String[] args) {
		SimpleDateFormat format1 = new SimpleDateFormat("kk:mm:ss");
		Date time = new Date();
		
		//date타입을 string타입으로
		String today = format1.format(time);
		String[] arr= today.split(":");
		System.out.println("퇴근 시간: 18:30:00");
		System.out.println("현재시간: " + format1.format(time));
		int h = 18-Integer.parseInt(arr[0]);
		int m = 30-Integer.parseInt(arr[1]);
		if(m<0) {
			h=h-1;
			m+=60;
		}
		int s =0- Integer.parseInt(arr[2]);
		if(s<0) {
			m=m-1;
			s+=60;
		}
		
		System.out.println("퇴근시간까지 남은 시간은: "+ h+":"+m+":"+s);
	}

}
