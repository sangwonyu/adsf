package ch08;
//구현객체, 인터페이스에서 명령 한 것을 처리, 개발 코드에서 티비구현객체를 부르면 여기 실행
public class Television implements RemoteControl{
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV켭니다");
	}
	//trunOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV끕니다.");
	}
	
	//setVolume()추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if ( volume<RemoteControl.MIN_VOLUME
	) {this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println("현재 tv 볼륨: " +this.volume);
	
	}
}
