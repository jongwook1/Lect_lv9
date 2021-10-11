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
				System.out.printf("아이디: %s, 비번: %s, 잔액:%d ", this.user[i].id, user[i].pw, this.user[i].money);
				System.out.println();
			}
		}
	}

	boolean select() {
		System.out.println("1)회원가입 2)회원탈퇴 3)전체출력 4)종료");
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
		System.out.println("아이디를 입력하세요");
		this.user[cnt].id = sc.next();
		System.out.println("비밀번호 입력하세요");
		this.user[cnt].pw = sc.next();
		System.out.println("금액을 입력하세요");
		this.user[cnt].money = sc.nextInt();
		this.cnt++;

	}

	void out() {
		System.out.println("삭제할 아이디입력하세요");
		String outId = sc.next();
		System.out.println("삭제할 비번입력하세요");
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
		 * 1. 회원가입 2. 회원탈퇴 3. 전체출력
		 */

//		for(int i=0;i<user.length;i++) {
//			user[i]=new User();
//			System.out.println(user[i]);
//		}

		runUser run = new runUser();
		run.run();

	}

}
