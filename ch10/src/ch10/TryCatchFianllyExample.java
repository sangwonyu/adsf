package ch10;

public class TryCatchFianllyExample {

	public static void main(String[] args) {
		try {
			Class clazz =Class.forName("java.lan.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
