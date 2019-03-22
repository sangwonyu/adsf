package ch08;
//개발코드, 여기에 명령을 함
public class RemoteControlExample {

	public static void main(String[] args) {
	/*	RemoteControl rc;
		rc=new Television();
		rc.turnOn();
		rc.setVolume(100);
		rc=new Audio();
		rc.turnOff();*/
		
		RemoteControl rc =new RemoteControl() { //익명 구현 객체
			public void turnOn() {
				System.out.println("추상메소드 turnOn() 구현");
			}
			public void turnOff() {
				System.out.println("추상메소드 turnOff() 구현");
			}
			public void setVolume(int volume) {
				System.out.println("추상메소드 setVolume() 구현"+volume);
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc.setMute(true);
		

	}

}
