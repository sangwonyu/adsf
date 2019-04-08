package ch12;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//how1 인터페이스,구현객체 생성 이용
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);*/
		
		//Runnable 익명객체 이용
		Thread thread = new Thread(new Runnable() {
			@Override // 오버라이드 제거해도 실행되긴함.
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
			}
		}
		});
				thread.start();
				
		for(int i =0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
