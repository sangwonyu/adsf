package exercise;
import java.util.Scanner;
public class Openchallenge {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		/*System.out.println("Matrix의 행과 열의 수를 결정하시오.>cols");
		int cols = Integer.parseInt(scanner.nextLine());
		System.out.println("Matrix의 행과 열의 수를 결정하시오.>rows");
		int rows = Integer.parseInt(scanner.nextLine());
		
		int[][] matrix=new int[cols][rows];
		System.out.println("Matrix의 행과 열 각각의 값을 정하시오");
		for(int i=0; i<rows;i++) {
			for (int z=0; z<cols;z++) {
				matrix[i][z] = Integer.parseInt(scanner.nextLine());
				
			}
		}*/
		
		int[][] fir = {
				{1,2,3},
				{4,5,6}
		};
		int[][] sec = {
				{1,2},
				{3,4},
				{5,6}
		};
		int[][] thir=new int[fir.length][sec[0].length];
		
			for(int i =0; i<fir[0].length;i++) {
				thir[0][0]+=(fir[0][i])*(sec[i][0]);
				thir[0][1]+=(fir[0][i])*(sec[i][1]);
			}
		
		// TODO Auto-generated method stub

	}

}
