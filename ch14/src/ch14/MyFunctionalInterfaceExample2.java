package ch14;

public class MyFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		MyFunctionalInterface2 fi;
		
		fi=(x,y) ->{
			int result =x+y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		
		fi=(x,y)-> x+y;
		System.out.println(fi.method(2, 5));
		
		fi=(x,y)->x+y;
				System.out.println(fi.method(2, 5));
		}

}
