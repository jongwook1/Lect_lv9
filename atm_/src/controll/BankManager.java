package controll;

import java.util.Scanner;

import models.Bank;

public class BankManager {
	public static Scanner sc = new Scanner(System.in);

	public static BankManager instance = new BankManager();

	private FileManager fm = FileManager.instance;
	private UserManager um = UserManager.instance;
	private AccountManager am = AccountManager.instance;

	private boolean check=true;
	public void run() {
		fm.load();
		boolean isRun = true;
		while (isRun) {
			if(this.check) {
			System.out.println(Bank.instance.getBrand() + " ATM");
			printAllData();
			printMenu2();
			selectMenu2();
			}else {
				fm.save();
				break;
			}
		}
	}

	private void printAllData() {
		for (int i = 0; i < um.getUsersSize(); i++) {
			System.out.println(um.getUser(i));

			for (int j = 0; j < um.getUserAccSize(i); j++) {
				System.out.println(um.getUser(i).getAcc(j));//

			}

		}
	}

	private void printMenu2() {
		if (Bank.log == -1) {
			System.out.println("1.로그인 2.회원가입 3.회원탈퇴");

		} else {
			System.out.println("1.입금 2.출금 3.이체 4.조회 5.계좌생성 6.계좌철회 7.로그아웃 8.종료");
		}

	}

	private void selectMenu2() {
		System.out.print("메뉴");
		String input = sc.next();
		try {
			int sel = Integer.parseInt(input);

			if (Bank.log == -1) {
				if (sel == 0) {
//					fm.load2();
					}
				else if (sel == 1)
					login2();

				else if (sel == 2)
					um.joinUser();

				else if (sel == 3)
					um.removeUser();

			} else {
				if (um.getUserAccSize(Bank.log) > 0) {
					if (sel == 1)
						am.inputMoney(Bank.log);
					else if (sel == 2)
						am.withdrawMoney(Bank.log);
					else if (sel == 3)
						am.transferMoney(Bank.log);
					else if (sel == 4)
						am.printAccs();
					else if (sel == 6)
						am.removeAcc(Bank.log);
				}

				if (sel == 5)
					am.createAcc(Bank.log);
				if (sel == 7)
					logout2();			
				if(sel==8) {
					end();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void end() {
		this.check=false;
		
	}

	private void login2() {
		System.out.print("id: ");
		String id = sc.next();
		System.out.print("pw: ");
		String pw = sc.next();

		for (int i = 0; i < um.getUsersSize(); i++) {
			if (id.equals(um.getUser(i).getId()) && pw.equals(um.getUser(i).getPw())) {
				Bank.log = i;
			}
		}
		if (Bank.log != -1)
			System.out.println("로그인 성공!");
	}

	private void logout2() {
		Bank.log = -1;
	}

}
