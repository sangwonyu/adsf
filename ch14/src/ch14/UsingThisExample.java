package ch14;

public class UsingThisExample {

	public static void main(String... args) {
		UsingThis useingThis = new UsingThis();
		UsingThis.Inner inner = useingThis.new Inner();
		inner.method();
	}

}
