package ch14;
import java.util.function.*;
public class SupplierEx {

	public static void main(String[] args) {
		//int값 리턴
		IntSupplier intSupplier = ()->{
			int num = (int) (Math.random()*6)+1;
			return num;
		};
		
		int num =intSupplier.getAsInt();
		System.out.println("눈의 수: " +num);
	}

}
