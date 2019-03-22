package exercise;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("복사됩니다.");
			}
		};
				
		action.work();
	}

}
