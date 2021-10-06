package controller;

import java.util.ArrayList;
import java.util.Random;

import models.Shop;
import models.User;

public class UserManager {
	public static UserManager instance = new UserManager();
	public static int log=-1;
	
	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	ArrayList<User> userList = new ArrayList<>();

	public void joinUser() {
		System.out.print("id:");
		String id = Shop.sc.next();
		System.out.print("pw:");
		String pw = Shop.sc.next();

		boolean check = false;

		for (int i = 0; i < userList.size(); i++) {
			if (this.userList.get(i).getId().equals(id)) {
				check = true;
			}
		}
		if (!check) {
			User u = new User(ranCode(), id, pw);
			this.userList.add(u);
		} else {
			System.out.println("중복된 아디입니다");
		}

	}

	private int ranCode() {
		Random rn = new Random();

		boolean check = false;
		while (true) {
			int code = rn.nextInt(899) + 100;
			for (int i = 0; i < this.userList.size(); i++) {
				if (this.userList.get(i).getUserCode() == code) {
					check = true;
				}
			}
			if (!check) {
				return code;
			}
		}
	}

	public void outUser() {
		System.out.println("삭제할 유저코드 입력하세요");
		int delcode=Shop.sc.nextInt();
		
		User delUser=null;
		
		for(User u:userList) {
			if(u.getUserCode()==delcode) {
				delUser=u;
			}
		}
		this.userList.remove(delUser);
		
//		int idx=-1;
//		for(int i=0;i<this.userList.size();i++) {
//			if(this.userList.get(i).getUserCode()==delUcode) {
//				idx=i;
//			}
//		}
//		this.userList.remove(idx);
		
		
		
	}

	public boolean login() {
		if (this.log == -1) {
			System.out.print("id:");
			String id = Shop.sc.next();
			System.out.print("pw:");
			String pw = Shop.sc.next();
			for (int i = 0; i < this.userList.size(); i++) {
				if (this.userList.get(i).getId().equals(id) && this.userList.get(i).getPw().equals(pw)) {
					this.log = i;
					return true;
				}
			}
			if (this.log == -1) {
				System.out.println("아디와 비번 확인해주세요");
				return false;
			}
		} else {
			System.out.println("로그아웃을 먼저해주세요");
			return false;
		}
		return false;
	}

	public void logout() {
		if(this.log!=1) {
			System.out.println(userList.get(log).getName()+"님 로그아웃되셨습니다");
			this.log=-1;
		}else {
			System.out.println("로그인을 먼저해주세요");
		}
		
	}
	
	
	
	
	
	
	

}
