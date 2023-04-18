package exception.custom;

public class Account {
	
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		if(money < 0) {
			System.out.println(new StringBuffer("음수로 입금 불가"));
		}
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(this.balance < money) {
			System.out.println(new StringBuffer("잔고부족"));
		}
		this.balance -= money;
	}
	
}
