package exam;

public class SumAndMean {

	public static void main(String[] args) {
		int[][] intArray= {
				{95,86,88},
				{88,92,96,85},
				{78,83,93,87,88}
		};
		//sum
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int z=0;z<3+i;z++) {
				sum+=intArray[i][z];
			}
		}System.out.println("총합은 " +sum);
		
		//Mean
		double mean=0;
		mean=sum/12;
		System.out.println("평균은 "+mean+intArray.length);
	}

}
