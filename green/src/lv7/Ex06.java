package lv7;
import java.util.Scanner;

class User {
	String id;
	String pw;
	int money;
}

class runUser {
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	int max = 100;
	User[] user = new User[this.max];

	void print() {
		if (this.cnt > 0) {
			for (int i = 0; i < cnt; i++) {
				System.out.printf("���̵�: %s, ���: %s, �ܾ�:%d ", this.user[i].id, user[i].pw, this.user[i].money);
				System.out.println();
			}
		}
	}

	boolean select() {
		System.out.println("1)ȸ������ 2)ȸ��Ż�� 3)��ü��� 4)����");
		int sel = sc.nextInt();
		if (sel == 1) {
			join();

		} else if (sel == 2) {
			out();

		} else if (sel == 3) {
			print();

		} else if (sel == 4) {
			return false;
		}
		return true;
	}

	void join() {
		for (int i = 0; i < user.length; i++) {
			user[i] = new User();
		}
		System.out.println("���̵� �Է��ϼ���");
		this.user[cnt].id = sc.next();
		System.out.println("��й�ȣ �Է��ϼ���");
		this.user[cnt].pw = sc.next();
		System.out.println("�ݾ��� �Է��ϼ���");
		this.user[cnt].money = sc.nextInt();
		this.cnt++;

	}

	void out() {
		System.out.println("������ ���̵��Է��ϼ���");
		String outId = sc.next();
		System.out.println("������ ����Է��ϼ���");
		String outPw = sc.next();
		for (int i = 0; i < user.length; i++) {
			if (this.user[i].equals(outId) && this.user[i].equals(outPw)) {
				this.user[i].id = null;
				this.user[i].pw = null;
				this.user[i].money = 0;
			}
			this.cnt--;
		}
	}

	void run() {
		while (true) {
			if (select()) {
			} else {
				break;
			}
		}
	}

}

public class Ex06 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int max=100;
//		User[] user = new User[max];		
		/*
		 * 1. ȸ������ 2. ȸ��Ż�� 3. ��ü���
		 */

//		for(int i=0;i<user.length;i++) {
//			user[i]=new User();
//			System.out.println(user[i]);
//		}

		runUser run = new runUser();
		run.run();

	}

}
