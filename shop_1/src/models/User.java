package models;

import java.util.Random;

public class User {
	private int userCode;
	private String id;
	private String pw;
	private int money;
	private String name;

	public User(int userCode, String id, String pw) {
		this.userCode = userCode;
		this.id = id;
		this.pw = pw;
		this.name = init();
		this.money=100000;		//welcome
	}

	private String init() {
		Random rn = new Random();
		String name = "";
		String[] a = { "김", "박", "이", "최", "정", "오" };
		String[] b = { "철", "병", "만", "여", "아", "영" };
		String[] c = { "수", "욱", "수", "정", "름", "희" };

		for (int i = 0; i < 1; i++) {
			int r = rn.nextInt(a.length);
			name = a[r];
			r = rn.nextInt(b.length);
			name += b[r];
			r = rn.nextInt(c.length);
			name += c[r];
		}
		return name;
	}

	public int getUserCode() {
		return userCode;
	}

	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		String str="";
		str+="[";
		str+=this.userCode+"/";
		str+=this.name+"/";
		str+=this.id+"/";
		str+=this.pw+"/";
		str+=this.money;
		str+="]";		
		return str;
	}
}
