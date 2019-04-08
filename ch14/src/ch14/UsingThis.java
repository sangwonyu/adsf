package ch14;

public class UsingThis {
	public int outterField=10;
	
	class Inner {
		int innerField=20;
		//메인 메소드에서의 메소드함수 사용하기위함.
		void method() {
			//람다식
			MyInterface fi=()-> {
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField+"\n");//바깥 객체의 참조를 얻기위해 클래스명.this사용
				
				System.out.println("InnerField: "+ innerField);
				System.out.println("InnerField: "+ this.innerField+"\n");//람다식 내부에서this는inner객체참조
			};
			fi.method();
		}
	}
}
