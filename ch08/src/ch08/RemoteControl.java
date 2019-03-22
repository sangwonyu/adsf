package ch08;
//개발코드에서 명령한 것이 인터페이스로 넘어감. 명령한대로 구현객체에 넘김
public interface RemoteControl {
	//상수
	public static int MAX_VOLUME=10;
	public static int MIN_VOLUME=0;
	
	//추상메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	//디폴트 메소드
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
