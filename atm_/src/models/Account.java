package models;

public class Account {
	public static final int MAX = 3;

	private int userCode;

	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	private int accNum;
	private int money;

	public Account(int userCode, int accNum) {
		this.userCode = userCode;
		this.accNum = accNum;
		this.money = 1000; // welcome
	}

	public Account(int userCode, int accNum, int money) {
		this.userCode = userCode;
		this.accNum = accNum;
		this.money = money; // welcome
	}

	public int getUserCode() {
		return this.userCode;
	}

	public int getAccNum() {
		return this.accNum;
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


//	public void minerMoney(int money) {
//		
//	}

	public String toString() {
		return this.accNum + " : " + this.money;
	}

}
