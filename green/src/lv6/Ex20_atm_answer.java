package lv6;

import java.util.Scanner;

class ATMa {
	Scanner sc = new Scanner(System.in);

	// id,pw,money
	int cnt;
	String users[][] = null;
	int moneys[] = null;
	int log = -1;

	String name = "grn";

	void printMenu() {
		System.out.println("=== " + name + " ===");
		System.out.println("1.ȸ������");
		System.out.println("2.ȸ��Ż��");
		System.out.println("3.�α���");
		System.out.println("4.�α׾ƿ�");
		System.out.println("5.�Ա��ϱ�");
		System.out.println("6.��ü�ϱ�");

	}

	void selectMenu() {
		System.out.println("�޴�����: ");
		int sel = sc.nextInt();
		if (sel == 1) {
			join();
		} else if (sel == 2) {
			if (log != -1)
				withdraw();
			else
				System.out.println("�α����� ���ּ���");
		} else if (sel == 3) {
			login();
		} else if (sel == 4) {
			if (log != -1)
				leave();
			else
				System.out.println("�α����� ���ּ���");

		} else if (sel == 5) {
			if (log != -1)
				inputMoney();
			else
				System.out.println("�α����� ���ּ���");
		} else if (sel == 6) {
			if (log != -1)
				transfer();
			else
				System.out.println("�α����� ���ּ���");
		}
	}

	void join() {
		System.out.print("id: ");
		String id = sc.next();
		System.out.print("pw: ");
		String pw = sc.next();

		// check
		int check = -1;
		for (int i = 0; i < this.cnt; i++) {
			if (this.users[i][0].equals(id))
				check = i;
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
			System.out.println("�ߺ��� ���̵��Դϴ�");
		}

	}

	void withdraw() {
		System.out.println("pw: ");
		String pw = sc.next();

		if (this.users[log][1].equals(pw)) {
			String temp[][] = this.users;
			int moneysTemp[] = this.moneys;

			if (this.cnt == 1) {
				this.users = null;
				this.moneys = null;
			} else {
				this.users = new String[this.cnt - 1][2];
				this.moneys = new int[this.cnt - 1];

				int idx = 0;
				for (int i = 0; i < temp.length; i++) {
					if (i != log) {
						this.users[idx][0] = temp[i][0];
						this.users[idx][1] = temp[i][1];
						this.moneys[idx] = moneysTemp[i];
						idx++;
					}
				}

			}
			this.cnt--;
			this.log = -1;

		} else {
			System.out.println("ȸ�������� Ȯ�����ּ���");
		}
	}

	void login() {
		System.out.print("id: ");
		String id = sc.next();
		System.out.print("pw: ");
		String pw = sc.next();

		for (int i = 0; i < cnt; i++) {
			if (this.users[i][0].equals(id) && this.users[i][1].equals(pw))
				this.log = i;
		}
		if (log == -1) {
			System.out.println("ȸ�������� Ȯ���ϼ���");
		}

	}

	void leave() {
		this.log = -1;
		System.out.println("�α׾ƿ��Ǿ����ϴ�");
	}

	void inputMoney() {
		System.out.println("�Ա��� �ݾ�: ");
		int money = sc.nextInt();
		this.moneys[log] += money;
		System.out.println("���� �ܾ�: " + this.moneys[log] + "��");

	}

	void transfer() {
		System.out.println("��ü�� ����id:");
		String tId = sc.next();

		int idx = -1;
		for (int i = 0; i < this.users.length; i++) {
			if (this.users[i][0].equals(tId))
				idx = i;
		}
		if (idx == -1 || idx == log) {
			System.out.println("���������� �ٽ� Ȯ�����ּ���");
		} else {
			// transfer
			System.out.print("��ü�� �ݾ�: ");
			int tMoney = sc.nextInt();

			if (this.moneys[log] >= tMoney) {
				this.moneys[log] -= tMoney;
				this.moneys[idx] += tMoney;
				System.out.println("������ü�� �Ϸ�Ǿ����ϴ�");
				System.out.println("���� �ܾ�: " + this.moneys[log] + "��");
			} else {
				System.out.println("�ܾ׺��� ��ü����");
			}
		}

	}

	public void run() {
		while (true) {
			for (int i = 0; i < cnt; i++) {
				System.out.printf("%s %s %d\n", this.users[i][0], this.users[i][0], this.moneys[i]);
			}
			printMenu();
			selectMenu();
		}

	}

}

public class Ex20_atm_answer {

	public static void main(String[] args) {
		ATMa atm = new ATMa();
		atm.run();

	}

}
