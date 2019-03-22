package ch07;

class Aa{}

class Bb extends Aa{}
class C extends Aa{}

class D extends Bb{}
class E extends C{}

public class PromotionExample {
	public static void main(String[] args) {
		Bb b =new Bb();
		C c = new C();
		D d = new D();
		E e = new E();
		
		Aa a1=b;
		Aa a2 =c;
		Aa a3=d;
		Aa a4=e;
		
		Bb b1 = d;
		C c1 = e;
		
		//B b3=e;
		//C c2=d;
	}
}
