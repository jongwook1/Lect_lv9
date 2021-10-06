package models;

import java.util.ArrayList;
import java.util.Random;

public class User {
	
	int userCode;
	String id;
	String pw;
	int money;
	String name;
	//
//	private ArrayList<Cart> umJangList = new ArrayList<Cart>();
//	
//	public ArrayList<Cart> getUmJangList() {
//		return umJangList;
//	}
	//
//
//	public void setUmJangList(ArrayList<Cart> umJangList) {
//		this.umJangList = umJangList;
//	}
	//
//	private ArrayList<Item> umItemList=new ArrayList<Item>();
//	
//	
//
//	public ArrayList<Item> getUmItemList() {
//		return umItemList;
//	}
	//
	public User(int code,String id,String pw) {
		this.userCode=code;
		this.name=init();
		this.id=id;
		this.pw=pw;
		this.money=100000;		//welecome
	}
	
	private String init() {
		Random ran=new Random();
		String name="";
		String[] a = { "김", "박", "이", "최", "정", "오" };
		String[] b = { "철", "병", "만", "여", "아", "영" };
		String[] c = { "수", "욱", "수", "정", "름", "희" };
		for (int i = 0; i < 10; i++) {
			int r = ran.nextInt(a.length);
			name = a[r];
			r = ran.nextInt(b.length);
			name += b[r];
			r = ran.nextInt(c.length);
			name += c[r];
			return name;
			
		}
		return name;
	}
	


	public String getName() {
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
