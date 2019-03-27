package ch11;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
