package exercise;

public class Ex20_AccountBank {
	private String ano;
	private String owner;
	private int balance;
	
	//private으로 생성한 필드나 메소드에 접근하는방법 
	//1. 생성자를 이용
	//2. setter() 메소드 이용 
	//클래스이름 객체이름 = new 클래스이름();
	//객체이름.setAno(값);
	

	
	public Ex20_AccountBank(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner=owner;
		this.balance=balance;
	}

	public String getAno() {
		System.out.print("계좌 번호:");
		return ano;
	}

	public void setAno(String ano) {
		
		this.ano = ano;
	}

	public String getOwner() {
		System.out.print("계좌주:");
		return owner;
	}

	public void setOwner(String owner) {
		
		this.owner = owner;
	}

	public int getBalance() {
		System.out.print("통장 잔액:");
		return balance;
	}

	public void setBalance(int balance) {
		this.balance += balance;
	}

	@Override
	public String toString() {
		return "Ex20_AccountBank [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
	

}
