package exercise;

public class ex08 {

	public static void main(String[] args) {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		//총합
		double disper=0;
		int min=array[0][0];
		int max=0;
		int total=0;
		double sum=0;
		double avg =0.0;
		for (int i =0;i< array.length;i++) {
			for(int z=0;z< array[i].length;z++) {
				sum+=array[i][z];
				++total;
			}
		}
		System.out.println("sum: " + sum);
		//평균
		avg=sum/total;
		System.out.println("avg: " + avg);
		
		//최대값
		for (int i =0;i<array.length;i++) {
			for(int z =0;z<array[i].length;z++) {
				if(max<array[i][z]) {
					max=array[i][z];
				}
			}
		}System.out.println("max : " + max);
		
		//최소값
		for (int i =0;i<array.length;i++) {
			for(int z =0;z<array[i].length;z++) {
				if(min>array[i][z]) {
					min=array[i][z];
				} 
			}
		}System.out.println("min : " + min);
		
		//분산
		for (int i =0;i<array.length;i++) {
			for(int z =0;z<array[i].length;z++) {
				disper+=Math.pow((array[i][z]-avg), 2)/array.length;
				} 
			}
		 System.out.println("dispersion : " + disper);
		
		// TODO Auto-generated method stub

	}
}

