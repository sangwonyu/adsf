package exercise;

public class ex07 {

	public static void main(String[] args) {
		
		int max=0;
		double sum=0;
		double avg=0;
		double disper=0;
		int[] array= {1,5,3,8,2};
		int min=array[0];
		//최대값
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("max " + max);
		
		//합
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("sum: " + sum);
		
		//평균
		avg=sum/array.length;
		System.out.println("avg :" + avg);
		//최소값
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}else min=array[0];
		} System.out.println("min: " + min);
		
		//분산
		for(int i=0;i<array.length;i++) {
			disper+=Math.pow((array[i]-avg),2)/array.length;
		}
		System.out.println("dispersion:" + disper);
		// TODO Auto-generated method stub

	}

}
