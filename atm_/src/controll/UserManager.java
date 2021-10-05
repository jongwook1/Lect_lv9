package controll;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Account;
import models.User;

public class UserManager {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	private ArrayList<User> users = null; // ��Ű���ٸ��Ƿ� import���� import models.User;
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
		for (User user : users) { // users �迭�� ���鼭 User ��ü�� �ϳ��� ������ ���� ���� user�� ����
			if (id.equals(user.getId()))
				check = true;
		}

		if (!check) {
			System.out.print("name: ");
			String name = BankManager.sc.next();

			this.users.add(new User(randomCode2(), id, pw, name));
		} else {
			System.out.println("�ߺ��� ���̵� �Դϴ�");
		}

	}

	public void removeUser() {
		System.out.print("id ");
		String id = BankManager.sc.next();
		System.out.print("pw: ");
		String pw = BankManager.sc.next();

		// ��ü�� ����
		User delUser = null;
		for (User user : users) { // users �迭�� ���鼭 User ��ü�� �ϳ��� ������ ���� ���� user�� ����
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

// Ż��

// ������
	public int getUsersSize() {
		return this.users.size();
	}

// ȸ����ȸ
	public User getUser(int index) {
		return this.users.get(index);
	}
// �����̵�
// ���н�����
// ���̸�
// ���Ӵ�	

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
