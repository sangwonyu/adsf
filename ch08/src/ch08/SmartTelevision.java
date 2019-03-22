package ch08;

public class SmartTelevision implements RemoteControl, Searchable{
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
		
		public void search(String url) {
			System.out.println(url+"을 검색합니다.");
		}

}
