package ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ch11");
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors =clazz.getDeclaredConstructors();
				for(Constructor constructor : constructors) {
					System.out.print(constructor.getName()+"(");
					Class[] parameters = constructor.getParameterTypes();
					printParamethers(parameters);
					System.out.println(")");
				}
		System.out.println();
		
		System.out.println("필드 정보");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName()+" " +field.getName());
		}
		System.out.println();
		
		System.out.println("메소드 정보");
		Method[] methods =clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName() +"(");
			Class[] paramethers =method.getParameterTypes();
			printParamethers(paramethers);
			System.out.println(")");
		}
	}
	private static void printParamethers(Class[] paramethers) {
		for(int i=0; i<paramethers.length;i++) {
			System.out.println(paramethers[i].getName());
			if(i<(paramethers.length-1)) {
				System.out.print(",");
			}
		}
	}
}
