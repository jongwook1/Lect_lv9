package controll;

import java.util.ArrayList;
import java.util.Random;

import models.Account;
import models.Bank;

public class AccountManager {
	private ArrayList<Account> accs = new ArrayList<>();
	public static AccountManager instance = new AccountManager();

	private UserManager um = UserManager.instance;

	// �α����� ȸ���� ���¸� �����ؼ� ���������� ������
	public void inputMoney(int log) {
		int accIdx=selectUserAccs(log,"�Ա��� ");
		
		System.out.println("�Աݱݾ� : ");
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
		int accIdx=selectUserAccs(log,"�����");
		
		System.out.println("��ݱݾ� : ");
		String input=BankManager.sc.next();
		
		try {
			int money=Integer.parseInt(input);
			int balance=um.getUser(log).getAcc(accIdx).getMoney();
			if(money<=balance) {
			balance-=money;
			um.getUser(log).getAcc(accIdx).setMoney(balance);
			}else {
				System.out.println("�ܾ��� �����մϴ�");
			}
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void transferMoney(int log) {
		System.out.println("��ü�� ���¹�ȣ : ");
		int inputAcc=BankManager.sc.nextInt();
		System.out.println("��ü�� �ݾ�: ");
		int inputMoney=BankManager.sc.nextInt();
		
		try {
			int accNum=inputAcc;
			int money=inputMoney;
			
			//���� ���� Ȯ��
			int accIdx=-1;
			for(int i=0;i<this.accs.size();i++) {
				if(this.accs.get(i).getAccNum()==accNum) {
					accIdx=i;
				}
			}
			
			
			//�� ���� Ȯ��
			int myAccIdx=selectUserAccs(log,"����� ");
			
			int balance=this.accs.get(myAccIdx).getMoney();
//��������		int balance=um.getUser(log).getAcc(myAccIdx).getMoney();
			
			if(balance >=money && myAccIdx != accIdx) {
				//��ü ����
				balance-=money;
				this.accs.get(myAccIdx).setMoney(balance);
				
				balance=this.accs.get(accIdx).getMoney();
				balance+=money;
				this.accs.get(accIdx).setMoney(balance);
				
			}else {
				System.out.println("������ �ܾ��� Ȯ���ϼ���");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
//		printAccs();
//		System.out.println(um.getUser(log).getName() + "���� ���̺������������� ���¹�ȣ�� �Է��ϼ���");
//		int accN1 = BankManager.sc.nextInt();
//		int idx1 = -1;
//		for (int i = 0; i < um.getUser(log).getAccsSize(); i++) {
//			if (accN1 == um.getUser(log).getAcc(i).getAccNum()) {
//				idx1 = i;
//			}
//		}
//
//		System.out.println("������ ��ü���� ���¹�ȣ�� �Է��ϼ���");
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
//		System.out.println("��ü�� �ݾ��Է��ϼ���");
//		int money = BankManager.sc.nextInt();
//		if (um.getUser(log).getAcc(idx1).getMoney() >= money) {
//			um.getUser(log).getAcc(idx1).minerMoney(money);
//			um.getUser(idx2).getAcc(idx3).addMoney(money);
//		} else {
//			System.out.println("�ܾ��� �����մϴ�");
//		}

	}

	public void printAccs() {
		for (int i = 0; i < um.getUsersSize(); i++) {
			for (int j = 0; j < um.getUser(i).getAccsSize(); j++) {
				String name = um.getUser(i).getName();
				int accN = um.getUser(i).getAcc(j).getAccNum();
				int money = um.getUser(i).getAcc(j).getMoney();
				System.out.printf(" %s���� ���¹�ȣ%d �ܾ�%d", name, accN, money);
			}
			System.out.println();
		}
	}
	
	
	private int selectUserAccs(int log,String sub) {
		printUserAcc(log);
		
		int accIdx=-1;
		
//		System.out.printf("%s���¼��� (1~d%)",sub,um.getUserAccSize(log));
		System.out.printf("%s���� ����: (1~%d):",sub,um.getUser(log).getAccsSize());
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
			System.out.println("�ִ� ���� ���� �ʰ�");
		}
	}

	public void removeAcc(int log) {
		if (um.getUserAccSize(log) > 1) {
			int delAccIdx=this.selectUserAccs(log, "������");
			
			int defaultAccIdx=this.selectUserAccs(log, "�⺻");
			
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
//		System.out.println("������ ���¹�ȣ�� �Է��ϼ���");
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
