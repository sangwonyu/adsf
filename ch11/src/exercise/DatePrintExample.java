package exercise;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String strNow2 =sim.format(now);
		System.out.println(strNow2);
	}

}
