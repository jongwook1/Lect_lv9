package controll;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Account;
import models.User;

public class UserManager {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	private ArrayList<User> users = null; // 패키지다르므로 import해줌 import models.User;
	public static UserManager instance = new UserManager();

	private UserManager() {
		this.users = new ArrayList<>();
	}

	public void joinUser() {
		System.out.print("id ");
		String id = BankManager.sc.next();
		System.out.print("pw: ");
		String pw = BankManager.sc.next();

		boolean check = false;
		for (User user : users) { // users 배열을 돌면서 User 객체를 하나씩 꺼내온 것을 변수 user에 담음
			if (id.equals(user.getId()))
				check = true;
		}

		if (!check) {
			System.out.print("name: ");
			String name = BankManager.sc.next();

			this.users.add(new User(randomCode2(), id, pw, name));
		} else {
			System.out.println("중복된 아이디 입니다");
		}

	}

	public void removeUser() {
		System.out.print("id ");
		String id = BankManager.sc.next();
		System.out.print("pw: ");
		String pw = BankManager.sc.next();

		// 객체로 삭제
		User delUser = null;
		for (User user : users) { // users 배열을 돌면서 User 객체를 하나씩 꺼내온 것을 변수 user에 담음
			if (id.equals(user.getId()) && pw.equals(user.getPw())) {
				delUser = user;
			}
		}
		this.users.remove(delUser);
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	private int randomCode2() {
		Random rn = new Random();

		while (true) {
			int rCode = rn.nextInt(8999) + 1000;

			boolean check = false;
			for (User user : users) {
				if (rCode == user.getCode())
					check = true;
			}
			if (!check)
				return rCode;
		}

	}

// 탈퇴

// 사이즈
	public int getUsersSize() {
		return this.users.size();
	}

// 회원조회
	public User getUser(int index) {
		return this.users.get(index);
	}
// ㄴ아이디
// ㄴ패스워드
// ㄴ이름
// ㄴ머니	

	public int getUserAccSize(int log) {

		return this.users.get(log).getAccsSize();
	}

	public void addAcc(int log, Account e) {
		this.users.get(log).addAcc(e);
	}

	public ArrayList<User> getUsers() {
		return this.users;
	}

	public void removeAcc(int log,Account e) {
		this.users.get(log).removeAcc(e);
		
	}

	public void addUser(User e) {
		this.users.add(e);
		
	}

}
