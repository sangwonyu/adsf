import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		String[] strArry = {"김","이","박","한","유"};
		bubbleSort(strArry);
		System.out.println(Arrays.toString(strArry));
	}	
		static void bubbleSort(String[] strArry) {
			int len = strArry.length;
			for(int i=0;i<len-1;i++) {
				for(int k=i+1; k<len;k++) {
					//strArry[i]와strArry[k]를 비교하여 조건에 맞으면 swap
					if(strArry[i].compareTo(strArry[k])>0) {
						String name =strArry[i];
						strArry[i]=strArry[k];
						strArry[k]=name;
					}
				}
			}
		}
	

}
