package controll;

import java.util.ArrayList;
import java.util.Random;

import models.Account;
import models.Bank;

public class AccountManager {
	private ArrayList<Account> accs = new ArrayList<>();
	public static AccountManager instance = new AccountManager();

	private UserManager um = UserManager.instance;

	// 로그인한 회원의 계좌만 선별해서 계좌정보를 보여줌
	public void inputMoney(int log) {
		int accIdx=selectUserAccs(log,"입금할 ");
		
		System.out.println("입금금액 : ");
		String input=BankManager.sc.next();
		
		try {
			int money=Integer.parseInt(input);
			
			int balance=um.getUser(log).getAcc(accIdx).getMoney();
			balance+=money;
			um.getUser(log).getAcc(accIdx).setMoney(balance);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}



	public void withdrawMoney(int log) {
		int accIdx=selectUserAccs(log,"출금할");
		
		System.out.println("출금금액 : ");
		String input=BankManager.sc.next();
		
		try {
			int money=Integer.parseInt(input);
			int balance=um.getUser(log).getAcc(accIdx).getMoney();
			if(money<=balance) {
			balance-=money;
			um.getUser(log).getAcc(accIdx).setMoney(balance);
			}else {
				System.out.println("잔액이 부족합니다");
			}
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void transferMoney(int log) {
		System.out.println("이체할 계좌번호 : ");
		int inputAcc=BankManager.sc.nextInt();
		System.out.println("이체할 금액: ");
		int inputMoney=BankManager.sc.nextInt();
		
		try {
			int accNum=inputAcc;
			int money=inputMoney;
			
			//상대방 계좌 확인
			int accIdx=-1;
			for(int i=0;i<this.accs.size();i++) {
				if(this.accs.get(i).getAccNum()==accNum) {
					accIdx=i;
				}
			}
			
			
			//내 계좌 확인
			int myAccIdx=selectUserAccs(log,"출금할 ");
			
			int balance=this.accs.get(myAccIdx).getMoney();
//같은내용		int balance=um.getUser(log).getAcc(myAccIdx).getMoney();
			
			if(balance >=money && myAccIdx != accIdx) {
				//이체 시작
				balance-=money;
				this.accs.get(myAccIdx).setMoney(balance);
				
				balance=this.accs.get(accIdx).getMoney();
				balance+=money;
				this.accs.get(accIdx).setMoney(balance);
				
			}else {
				System.out.println("계좌의 잔액을 확인하세요");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
//		printAccs();
//		System.out.println(um.getUser(log).getName() + "님의 돈이빠져나갈통장의 계좌번호를 입력하세요");
//		int accN1 = BankManager.sc.nextInt();
//		int idx1 = -1;
//		for (int i = 0; i < um.getUser(log).getAccsSize(); i++) {
//			if (accN1 == um.getUser(log).getAcc(i).getAccNum()) {
//				idx1 = i;
//			}
//		}
//
//		System.out.println("상대방의 이체받을 계좌번호를 입력하세요");
//		int accN2 = BankManager.sc.nextInt();
//		int idx2 = -1;
//		int idx3 = -1;
//		for (int i = 0; i < um.getUsersSize(); i++) {
//			for (int j = 0; j < um.getUser(i).getAccsSize(); j++) {
//				if (accN2 == um.getUser(i).getAcc(j).getAccNum()) {
//					idx2 = i;
//					idx3 = j;
//				}
//			}
//		}
//		System.out.println("이체할 금액입력하세요");
//		int money = BankManager.sc.nextInt();
//		if (um.getUser(log).getAcc(idx1).getMoney() >= money) {
//			um.getUser(log).getAcc(idx1).minerMoney(money);
//			um.getUser(idx2).getAcc(idx3).addMoney(money);
//		} else {
//			System.out.println("잔액이 부족합니다");
//		}

	}

	public void printAccs() {
		for (int i = 0; i < um.getUsersSize(); i++) {
			for (int j = 0; j < um.getUser(i).getAccsSize(); j++) {
				String name = um.getUser(i).getName();
				int accN = um.getUser(i).getAcc(j).getAccNum();
				int money = um.getUser(i).getAcc(j).getMoney();
				System.out.printf(" %s님의 계좌번호%d 잔액%d", name, accN, money);
			}
			System.out.println();
		}
	}
	
	
	private int selectUserAccs(int log,String sub) {
		printUserAcc(log);
		
		int accIdx=-1;
		
//		System.out.printf("%s계좌선택 (1~d%)",sub,um.getUserAccSize(log));
		System.out.printf("%s계좌 선택: (1~%d):",sub,um.getUser(log).getAccsSize());
		String input=BankManager.sc.next();
		
		try {
			int idx=Integer.parseInt(input);
			
			int cnt=0;
			for(int i=0;i<this.accs.size();i++) {
				if(this.accs.get(i).getUserCode()==this.getUserCode(log)) {
					cnt++;
					if(cnt==idx) {
						accIdx=i;
					}
				}
			}			
			
			return accIdx;
		} catch (Exception e) {
			return accIdx;
		}
		
	}
	
	public void printUserAcc(int log) {
		int n=0;
//		int index=-1;
		
//		for(int i=0;i<this.accs.size();i++) {
//			if(this.accs.get(i).getUserCode()==this.getUserCode(log)) {
//				System.out.printf(n+1+")"+this.accs.get(i));
//				index=i;
//				n++;
//			}
//		}
		
		for (int i = 0; i < this.um.getUserAccSize(log); i++) {
			System.out.println(n + 1 + ")" + um.getUser(log).getAcc(i));
			n++;
		}		
		
	}

	public int getUserCode(int log) {

		int userCode = um.getUser(log).getCode();
		return userCode;
	}

	public void createAcc(int log) {
		if (um.getUserAccSize(log) < Account.MAX) {
			Account newAcc = new Account(getUserCode(log), ranAccNum());
			this.accs.add(newAcc);
			um.addAcc(log, newAcc);
		} else {
			System.out.println("최대 개설 개수 초과");
		}
	}

	public void removeAcc(int log) {
		if (um.getUserAccSize(log) > 1) {
			int delAccIdx=this.selectUserAccs(log, "삭제할");
			
			int defaultAccIdx=this.selectUserAccs(log, "기본");
			
			if(delAccIdx!=defaultAccIdx) {
				int money=this.accs.get(delAccIdx).getMoney();
				int balance=this.accs.get(defaultAccIdx).getMoney();
				balance+=money;
				this.accs.get(defaultAccIdx).setMoney(balance);
				
				Account delAcc=this.accs.get(delAccIdx);
				this.accs.remove(delAcc);
				um.removeAcc(log, delAcc);
			}
			
		}
//		System.out.println("삭제할 계좌번호를 입력하세요");
//		int removeAccN = BankManager.sc.nextInt();
//		int idx = -1;
//		for (int i = 0; i < um.getUser(log).getAccsSize(); i++) {
//			if (removeAccN == um.getUser(log).getAcc(i).getAccNum()) {
//				idx = i;
//			}
//		}
//
//		um.getUser(log).removeAcc(idx);

	}

	public int ranAccNum() {
		Random rn = new Random();

		boolean check = false;
		while (true) {
			int rNum = rn.nextInt(89999) + 10000;

			for (Account acc : accs) {
				if (rNum == acc.getAccNum())
					check = true;
			}
			if (!check) {
				return rNum;
			}
		}
	}
	
	public int getAccsSize() {		
		return this.accs.size();
	}

	public Account getAcc(int index) {
		return this.accs.get(index);
	}



	public void addAccount(Account e) {
		this.accs.add(e);
		
	}
}
