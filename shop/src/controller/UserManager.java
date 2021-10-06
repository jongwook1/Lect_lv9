package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Cart;
import models.Shop;
import models.User;

public class UserManager {
	public static Scanner sc=new Scanner(System.in);
	public static UserManager instance=new UserManager();
	private ArrayList<User> userList=null;
//	ArrayList<Cart> jangList = new ArrayList<Cart>();
	public static int log=-1;
	
		private UserManager(){
			userList=new ArrayList<User>();
		}
		


		public void joinUser() {
			System.out.print("id: ");
			String id=sc.next();
			System.out.print("pw: ");
			String pw=sc.next();
			
			boolean check=false;
			for(User u : userList) {
				if(u.equals(id)) {
					check=true;
				}
			}
			if(!check) {
				User u=new User(ranCode(),id,pw);
				userList.add(u);				
			}else {
				System.out.println("중복된 아디입니다");
			}			
			
			
		}

		public void setUsers(ArrayList<User> users) {
			this.userList = users;
		}

		public ArrayList<User> getUsers() {
			return userList;
		}

		private int ranCode() {
			Random rn = new Random();
			boolean check = false;

			while (true) {
				int code = rn.nextInt(899) + 100;

				for (int i = 0; i < userList.size(); i++) {
					if (userList.get(i).getUserCode() == code) {
						check = true;
					}
				}
				if (!check) {
					return code;
				}
			}

		}

		public void outUser() {
			System.out.println("탈퇴할 유저코드 입력하세요");
			int delUserCode=sc.nextInt();
			
			User delUser=null;
			for(User u : userList) {
			if(u.getUserCode()==delUserCode) {
				delUser=u;
			}
			}
			this.userList.remove(delUser);
			
		}

		public boolean logIn() {
			if (this.log == -1) {
				System.out.print("id: ");
				String id = sc.next();
				System.out.print("pw: ");
				String pw = sc.next();

				for (int i = 0; i < this.getUsers().size(); i++) {
					if (userList.get(i).getId().equals(id) && userList.get(i).getPw().equals(pw)) {
						System.out.println(this.userList.get(i).getName() + "님 로그인되셨습니다");
						this.log = i;
						return true;
					}
				}
				if (this.log == -1) {
					System.out.println("아이디와 비번확인해주세요");
					return false;
				}
			} else {
				System.out.println("로그아웃을 먼저해주세요");
				return false;
			}
			return false;

		}

		public void logOut() {
			if(this.log!=-1) {
				System.out.println(this.userList.get(this.log).getName()+"님 로그아웃되셨습니다");
				this.log=-1;
				
			}
			
		}




		
		
		
	
}
