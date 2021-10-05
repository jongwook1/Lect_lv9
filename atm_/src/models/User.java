package models;

import java.util.ArrayList;

public class User {
	private ArrayList<Account> accs = new ArrayList<Account>();

	private int code; // �⺻Ű ����ó���ϵ� 1000~9999 �ߺ������ʴ� ������
	private String id;
	private String pw;
	private String name;

	public User(int code, String id, String pw, String name) { // ������ (Ŭ������ ��������� �ʱ�ȭ�ϸ鼭 �ʼ��ΰ�)
		this.code = code;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAcc(int index) {
		return this.accs.get(index);
	}

	public int getAccsSize() {
		return this.accs.size();
	}

	public void addAcc(Account e) {
		this.accs.add(e);
	}

	public void removeAcc(int idx) {
		this.accs.remove(idx);
	}
	
	public void removeAcc(Account e) {
		this.accs.remove(e);
	}

	public String toString() {
		String str = "";
		str += this.code + " ";
		str += this.id + "/";
		str += this.pw + " : ";
		str += this.name;
		str += "(" + this.accs.size() + ")";
		return str;
	}

	public ArrayList<Account> getAccs() {
		return accs;
	}

	public void setAccs(ArrayList<Account> accs) {
		this.accs = accs;
	}

}
