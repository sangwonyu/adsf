package exercise;

public class NotExistIDExeption extends Exception{
	public NotExistIDExeption() {}
	public void NotExist(String message) {
		System.out.println(message);
	}
}
