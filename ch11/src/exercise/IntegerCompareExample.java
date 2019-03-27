package exercise;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);
		
		/*Wrapper Class인 Integer Class는 -128 ~ 127 사이의 숫자는 ==으로 내부의 값을 비교할 수 있다.
		따라서 100은 범위안에 해당하므로 비교가 가능해서 true값을 반환한다.
		Integer의 경우 -128 ~ 127 의 범위를 넘는 숫자는 ==으로 비교할 수 없고,
		포장 클래스의 내부 값을 비교하도록 오버라이딩 된 equals() 메소드로 비교해야 한다.*/
	}

}
