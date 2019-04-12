package ch18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {

	public static void main(String[] args) throws Exception{
		FileInputStream fis =new FileInputStream("C:/tmp/text10.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA)ois.readObject();
		System.out.println("fiedl1: " +v.field1);
		System.out.println("field2.fiedl1: " +v.field2.field1);
		System.out.println("fiedl3: " +v.field3);
		System.out.println("fiedl4: " +v.field4);
	}

}
