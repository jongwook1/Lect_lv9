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
			else if(sel==2) {
				um.outUser();
			}
			else if(sel==3) {
				if(um.login()) {
					loginMenu();
					}				
			}
			else if(sel==4) {
				um.logout();
			}
			else if(sel==100) {}
			else if(sel==0) {}
		}

	}



	private void loginMenu() {
		System.out.println(um.getUserList().get(um.log).getName()+"님 로그인되셨습니다");
		while(true) {			
		System.out.println("[1.쇼핑] [2.장바구니목록] [0.뒤로가기]");
		System.out.println("메뉴선택");
		int sel=sc.nextInt();
		if(sel==1) {
			shopMenu();
		}
		else if(sel==2) {
			jangMenu();
		}
		else if(sel==0) {
			break;
		}
		}
	}



	private void jangMenu() {
		while(true) {
		System.out.println("[1.내 장바구니] [2.삭제] [3.구입] [0.뒤로가기]");
		int sel=sc.nextInt();
		if(sel==1) {
			im.printJang(um.getUserList().get(um.log));
		}
		else if(sel==2) {}
		else if(sel==3) {}
		else if(sel==0) {
			break;
		}
		}
	}



	private void shopMenu() {
		while(true) {
		im.printCate();
		System.out.println("[카테] 번호를 입력하세요");
		int caN=sc.nextInt();
		if(caN==-1) {
			break;
		}
		im.printItemList(caN);						//놓치기쉬움				
		System.out.println("[아이템] 번호 입력하세요");
		int itemN=sc.nextInt();
		im.addCart(um.getUserList().get(um.log).getId(),caN,itemN);
		}
	}



	private void printMenu() {
		System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]");
		System.out.println("[100.관리자] [0.종료]");
	}

	private void printAllData() {
		for(int i=0;i<um.getUserList().size();i++) {
		System.out.println(um.getUserList().get(i));}

	}

}
