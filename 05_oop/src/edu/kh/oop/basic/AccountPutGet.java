package edu.kh.oop.basic;

public class AccountPutGet {
	private String password;
	private String name;
	private long balance;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void deposit(long account) {
		balance += account;
	}

	public void putMoney(String password, long account, AccountPutGet other) {
		if(!this.password.equals(password)) {
			System.out.println("비밀번호가 맞지 않습니다.");
			return;
		}
		if(this.balance < account) {
			System.out.println("출금 금액이 초과되었습니다.");
		}
		other.deposit(account);

		this.balance -= account;
		System.out.printf("송금자 금액%d 피송금자 금액%d", this.balance, other.balance);
	}
	
	
}
