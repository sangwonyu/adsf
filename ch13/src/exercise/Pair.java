package exercise;

public class Pair<T, V> {
	private T t1;
	private V v1;
	
	public Pair(T t1, V v1) {
		this.t1 = t1;
		this.v1 = v1;
	}

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public V getV1() {
		return v1;
	}

	public void setV1(V v1) {
		this.v1 = v1;
	}
	
	
}
