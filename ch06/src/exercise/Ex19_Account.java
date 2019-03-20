package exercise;

public class Ex19_Account {
	int balance;
	final int MIN_BALANCE=0;
	final int MAX_BALANCE=1000000;
	
	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		int tmp =this.balance;
		this.balance=balance;
		
		if(balance<MIN_BALANCE||MAX_BALANCE<balance) {
			this.balance=tmp;
		} 
		
	}
}
