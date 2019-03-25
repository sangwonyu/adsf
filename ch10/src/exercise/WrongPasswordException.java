package exercise;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public void WrongPass(String message) {
		System.out.println(message);
	}
}
