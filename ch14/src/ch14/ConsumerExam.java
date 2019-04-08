package ch14;
import java.util.function.*;
public class ConsumerExam {

	public static void main(String[] args) {
		//java(t)를 받아 소비
		Consumer<String> consumer = t-> System.out.println(t+"8");
		consumer.accept("java");
		//java,8을 받아 소비
		BiConsumer<String,String> biConsumer=(t,u)->System.out.println(t+u);
		biConsumer.accept("java", "8");
		//double값을 받아 소비
		DoubleConsumer doubleConsumer = d->System.out.println("java"+d);
		doubleConsumer.accept(8.0);
		//객체java와int값을 받아 소비
		ObjIntConsumer<String>objIntConsumer=(t,i)->System.out.println(t+i);
		objIntConsumer.accept("java", 8);
		
	}

}
