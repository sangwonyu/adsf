package ch04;

public class WhileKey {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed =0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 &&keyCode!=10) {
				System.out.println("--------------------");
				System.out.println("1.증송|2.감속|3.중지|4.급가속|5.급가감속");
				System.out.println("--------------------");
				System.out.println("선택:");
			}
			
		keyCode=System.in.read();
		
		if(keyCode==49) { speed++;
			System.out.println("현재 속도=" +speed);
		}	else if(keyCode==50) {
			speed--;
			System.out.println("현재 속도=" +speed);
		} else if(keyCode==51) {
			run =false;
		} else if(keyCode==52) {
			speed+=10;
			System.out.println("현재속도=" + speed);
		} else if (keyCode==53) {
			speed-=10;
			System.out.println("현재 속도=" + speed);
		}
	}
		System.out.println("프로그램종료");
	}

}
