package exam;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Scanner;
import java.util.regex.Pattern;
public class ResidentRegist {

	public static void main(String[] args) throws ParseException {
		System.out.println("주민등록 앞7자리를 입력하세요(ex:950825-1)");
		Scanner scanner = new Scanner(System.in);
		String regist=scanner.nextLine();
		//입력값 재입력
		while(!fail(regist)) {
			System.out.println("다시 입력하세요.>");
			regist=scanner.nextLine();
		}
		int fo=Integer.parseInt(regist.substring(0, 5));
		int year = fo/10000;
		int month= (fo-(fo/10000)*10000)/100;
		int date = fo%100;
		
		SimpleDateFormat df = new SimpleDateFormat("yy년 MM월 dd일");
		Date d=(Date) df.parse(year+"년"+month+"월"+date+"일");
		String result =df.format(d);
		
	}
	
	
	public static boolean fail(String reg) {
		if(Pattern.matches("^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4]$", reg)) {
			System.out.println("올바른 형식입니다.");
			return true;
		}System.out.println("잘못된 형식입니다.");
		return false;
	}
}
