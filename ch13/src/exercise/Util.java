package exercise;

public class Util {

	public static Integer getValue(Pair<String, Integer> pair, String string) {
		if(pair.getT1().equals(string)) {
			int age = pair.getV1();
			return age;
		} else {
		return null;
		}
	}

}
