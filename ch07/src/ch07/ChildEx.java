package ch07;

public class ChildEx {

	public static void main(String[] args) {
		Parent1 parent =new Child1();
		parent.field1 ="data1";
		parent.method1();
		parent.method2();
	
	/*parent.field2 ="data2";
	parent.method3();*/
	
	Child1 child =(Child1)parent;
	child.field2="yyy";
	child.method3();
	}
}
