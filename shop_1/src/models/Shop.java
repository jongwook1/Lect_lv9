package models;

import java.util.Scanner;

import controller.ItemManager;
import controller.UserManager;

public class Shop {	
	public static Scanner sc = new Scanner(System.in);
	
	private UserManager um=UserManager.instance;
	private ItemManager im=ItemManager.instance;

	public void mainMenu() {
		boolean isRun = true;

		while (isRun) {
			printMenu();
			printAllData();
			String input = sc.next();
			int sel=Integer.parseInt(input);
			if(sel==1) {
				um.joinUser();
			}
			else if(sel==2) {}
			else if(sel==3) {}
			else if(sel==4) {}
			else if(sel==100) {}
			else if(sel==0) {}
		}

	}

	private void printMenu() {
		System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]");
		System.out.println("[100.관리자] [0.종료]");
	}

	private void printAllData() {
		// TODO Auto-generated method stub

	}

}
