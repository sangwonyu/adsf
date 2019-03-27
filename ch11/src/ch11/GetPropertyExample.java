package ch11;
import java.util.*;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName =System.getProperty("os.name");
		String userName =System.getProperty("user.name");
		String userHome =System.getProperty("user.name");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈디렉토리: " + userHome);
		
		System.out.println("------------------------");
		System.out.println(" [ key ] value");
		System.out.println("------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey:keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" +key+"] "+ value);
		}
		
		String javaHome=System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME] "+javaHome);
		
		for(Map.Entry entry: System.getenv().entrySet())
			System.out.println(entry.getKey() +"="+entry.getValue());
	}

}
