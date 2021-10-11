package lv6;

import java.util.Scanner;

class Atm2 {
	Scanner sc = new Scanner(System.in);

	private int cnt;
	private String users[][] = null;
	private int moneys[] = null;
	private int log = -1;
	private String name = "Green";

	public void printMenu() {
		System.out.println("=== " + name + " ===");
		System.out.println("1.회원가입");
		System.out.println("2.회원탈퇴");
		System.out.println("3.로그인");
		System.out.println("4.로그아웃");
		System.out.println("5.입금하기");
		System.out.println("6.이체하기");
		System.out.println("0.종료");
	}

	public void join() {
		System.out.println("가입할 아디입력");
		String id = sc.next();
		System.out.println("갑할 비번입력");
		String pw = sc.next();

		int check = -1;
		for (int i = 0; i < this.cnt; i++) {
			if (users[i][0].equals(id)) {
				check = 1;
			}
		}
		if (check == -1) {
			String temp[][] = this.users;
			int moneysTemp[] = this.moneys;

			this.users = new String[cnt + 1][2];
			this.moneys = new int[cnt + 1];

			if (cnt > 0) {
				for (int i = 0; i < cnt; i++) {
					this.users[i][0] = temp[i][0];
					this.users[i][1] = temp[i][1];
					this.moneys[i] = moneysTemp[i];
				}
			}
			this.users[cnt][0] = id;
			this.users[cnt][1] = pw;
			cnt++;
		} else {
			System.out.println("중복된 아디");
		}

	}

	void withdraw() {
		System.out.println("비번입력");
		String pw = sc.next();

		if (this.users[log][1].equals(pw)) {
			String temp[][] = this.users;
			int moneysTemp[] = this.moneys;

			if (this.cnt == 1) {
				this.users = null;
				this.moneys = null;
			} else {
				this.users = new String[cnt - 1][2];
				this.moneys = new int[cnt - 1];

				int idx = 0;
				for (int i = 0; i < temp.length; i++) {
					if (log != i) {
						this.users[idx][0] = temp[i][0];
						this.users[idx][1] = temp[i][1];
						this.moneys[idx] = moneysTemp[i];
						idx++;
					}
				}
			}
			this.cnt--;
			this.log = -1;
		}

	}

	public void login() {
		System.out.println("아디입력");
		String id = sc.next();
		System.out.println("비번입력");
		String pw = sc.next();

		if (cnt > 0) {
			for (int i = 0; i < this.cnt; i++) {
				if (users[i][0].equals(id) && users[i][1].equals(pw)) {
					System.out.println(users[i][i] + "님 로그인되셨습니다");
					log = i;
				}

			}
			if (log == -1) {
				System.out.println("회원정보를 확인하세요");
			}
		} else {
			System.out.println("회원가입을 먼저해주세요");
		}
	}

	public void leave() {
		this.log = -1;
		System.out.println("로그아앗되셧씁니다");
	}

	public void inputMoney() {
		System.out.println("입금할 금액");
		int money = sc.nextInt();
		this.moneys[log] += money;
		System.out.println("현재잔액: " + this.moneys[log] + "원");
	}

	public void transfer() {
		System.out.println("이체할 계좌 아디");
		String id = sc.next();

		int idx = -1;
		for (int i = 0; i < cnt; i++) {
			if (users[i][0].equals(id)) {
				idx = i;
			}
		}
		if (idx == -1 || idx == log) {
			System.out.println("계좌확인요망");
		} else {
			System.out.println("이체할 금액");
			int money = sc.nextInt();

			if (this.moneys[log] >= money) {
				this.moneys[log] -= money;
				this.moneys[idx] += money;
				System.out.println("이체완료");
				System.out.println("현재잔액: " + this.moneys[log] + "원");
			} else {
				System.out.println("잔액부족 -이체실패");
			}
		}
	}

	public void select() {
		this.printMenu();
		System.out.println("메뉴선택");
		int sel = sc.nextInt();
		if (sel == 1) {
			this.join();
		} else if (sel == 2) {
			this.withdraw();
		} else if (sel == 3) {
			this.login();
		} else if (sel == 4) {
			this.leave();
		} else if (sel == 5) {
			this.inputMoney();
		} else if (sel == 6) {
			this.transfer();
		}

	}

	public void run() {
		while (true) {
			for (int i = 0; i < cnt; i++) {
				System.out.printf("%s %s %d\n", this.users[i][0], this.users[i][0], this.moneys[i]);
			}
			this.select();
		}

	}
}

public class Ex20_Atm_Review {

	public static void main(String[] args) {
		Atm2 atm = new Atm2();
		atm.run();

	}

}
