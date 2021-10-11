package lv7;

import java.util.Scanner;

class User333 {
	private String id;
	private String pw;
	private int money;
	private int num;

	public User333(int n) {
		this.num = n;
	}

	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;
	}

	public void setIdPw(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public int getMoney() {
		return this.money;
	}
}

class Runuser333 {
	Scanner sc = new Scanner(System.in);
	private int max = 100;
	private int cnt = 0;
	private int n = 0;

	User333 user[] = new User333[this.getMax()];

	public int getCnt() {
		return this.cnt;
	}

	public void setAddCnt() {
		this.cnt = this.cnt + 1;
	}

	public void setMiCnt() {
		this.cnt = this.cnt - 1;
	}

	public int getMax() {
		return this.max;
	}

	public int getN() {
		return this.n;
	}

	public void setN() {
		this.n = this.n + 1;
	}

	public void userSet() {
		for (int i = 0; i < this.getMax(); i++) {
			user[i] = new User333(this.getN());
			setN();
		}
	}

	public void join() {
		System.out.println("이름입력하세요");
		String id = sc.next();
		System.out.println("비번을 입력하세요");
		String pw = sc.next();
		user[cnt].setIdPw(id, pw);
		this.setAddCnt();
	}

	public void withdraw() {
		System.out.println("탈퇴할 아디입력하세요");
		String id = sc.next();
		System.out.println("탈퇴할 비번입력하세요");
		String pw = sc.next();

		int dIdx = 0;
		for (int i = 0; i < this.getCnt(); i++) {
			if (user[i].getId().equals(id) && user[i].getPw().equals(pw)) {
				dIdx = i;
			}
		}

		User333 temp[] = user;
		user = new User333[this.cnt - 1];

		int idx = 0;
		for (int i = 0; i < cnt; i++) {
			if (i != dIdx) {
				user[idx] = temp[i];
				idx++;
			}
		}
		this.setMiCnt();
	}

	public void printList() {
		for (int i = 0; i < this.getCnt(); i++) {
			System.out.println("아디: " + user[i].getId() + " 비번: " + user[i].getPw());
		}
	}

	public boolean end() {
		int i = 1;
		if (i == 1) {
			return false;
		} else {
			return true;
		}
	}

	public void select() {

		System.out.println("1.가입 2.탈퇴 3.출력");
		System.out.println("메뉴선택");
		int sel = sc.nextInt();
		if (sel == 1) {
			join();
		} else if (sel == 2) {
			withdraw();
		} else if (sel == 3) {
			printList();
		}
	}

	public void run() {
		userSet();
		while (true) {
			select();
		}

	}

}

public class Ex06_회원관리_Review {

	public static void main(String[] args) {

		Runuser333 user = new Runuser333();
		user.run();
		/*
		 * 1. 회원가입 2. 회원탈퇴 3. 전체출력
		 */

	}

}
