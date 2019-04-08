package exercise;

public class Container2<T1, T2> {
	private T1 t1;
	private T2 t2;
	
	public T1 getKey() {
		return t1;
	}
	public void setKey(T1 t1) {
		this.t1 = t1;
	}
	public T2 getValue() {
		return t2;
	}
	public void setValue(T2 t2) {
		this.t2 = t2;
	}
}
