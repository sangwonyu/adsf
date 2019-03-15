package exercise;

public class exercise05 {

	public static void main(String[] args) {
		
		for(double x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				double z =(60-4*x)/5;
				if(z==y) {
					System.out.println("("+(int)x+","+y+")");
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
