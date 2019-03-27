package openchallenge;
import java.util.Scanner;
public class Open02 {

	public static void main(String[] args) {
		System.out.println("아무숫자 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine();
		
		
		DashInsert dash =new DashInsert();
		dash.dashInsert(str);
	}

}
