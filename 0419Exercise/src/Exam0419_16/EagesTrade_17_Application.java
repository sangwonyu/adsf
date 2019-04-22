package Exam0419_16;
import java.sql.SQLException;
import java.util.*;
public class EagesTrade_17_Application {

	public static void main(String[] args) throws SQLException {
		Scanner scanner =new Scanner(System.in);
		System.out.println("선수를 영입하겠습니까?(y/n)");
		String join2 = scanner.nextLine();
		if(join2.equals("y")) {
		System.out.println("1군으로 등록할 등번호를 입력하세요");
		int backNum = Integer.parseInt(scanner.nextLine());
		
		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();
		
		System.out.println("포지션을 입력하세요");
		String po = scanner.nextLine();
		
		System.out.println("고등학교를 입력하세요");
		String high = scanner.nextLine();
		
		System.out.println("던지는 손을 입력하세요");
		String thro = scanner.nextLine();
		
		System.out.println("치는 손을 입력하세요");
		String hit = scanner.nextLine();
		
		System.out.println("생일을 입력하세요");
		int birth = Integer.parseInt(scanner.nextLine());
		
		System.out.println("연봉을 입력하세요");
		int sal = Integer.parseInt(scanner.nextLine());
		
		EaglesTrade_17 join = new EaglesTrade_17(); 
		join.trade(backNum,name,po,high,thro,hit,birth,sal);
		}
		
		
		System.out.println("trade를 원하십니까(y/n)");
		String tra = scanner.nextLine();
		if(tra.equals("y")) {
		System.out.println("트레이드할 등번호를 입력하세요");
		int backNum2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("이름을 입력하세요");
		String name2 = scanner.nextLine();
		
		System.out.println("포지션을 입력하세요");
		String po2 = scanner.nextLine();
		
		System.out.println("고등학교를 입력하세요");
		String high2 = scanner.nextLine();
		
		System.out.println("던지는 손을 입력하세요");
		String thro2 = scanner.nextLine();
		
		System.out.println("치는 손을 입력하세요");
		String hit2 = scanner.nextLine();
		
		System.out.println("생일을 입력하세요");
		int birth2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("연봉을 입력하세요");
		int sal2 = Integer.parseInt(scanner.nextLine());
		
		EaglesTrade_17 join = new EaglesTrade_17(); 
		join.trade22(backNum2,name2,po2,high2,thro2,hit2,birth2,sal2);
		} 
		else {
			System.out.println("다음기회에~");
		}
		
	}

}
