package lv8;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import javax.print.DocFlavor.STRING;

//3.10 12 : 24 ~ 01 : 35
//����ƽ Ȱ�� ��

class UserVer2{
	String id;
	String pw;
	String name;
}

class UserManagerVer2{
	static Scanner scan = new Scanner(System.in);
	static Vector<UserVer2> userlist = new Vector<UserVer2>();
	
	static void dataSetting(String data) {
		String token[] = data.split("\n");
		for(int i = 0; i < token.length; i++) {
			UserVer2 user = new UserVer2();
			String token2[] = token[i].split("/");
			user.id = token2[0];
			user.pw = token2[1];
			user.name = token[3];
			userlist.add(user);
		}
	}
	static boolean checkId(String id) {
		for(int i = 0; i < userlist.size(); i++) {
			for(int j = 0; j < userlist.size(); j++) {
				if(id.equals(userlist.get(i).id)) {
					return true;
				}
			}
		}
		return false;
	}
	static boolean checkLogin(String id, String pw) {
		for(int i = 0; i < userlist.size(); i++) {
			for(int j = 0; j < userlist.size(); j++) {
				if(id.equals(userlist.get(i).id) && pw.equals(userlist.get(i).pw)) {
					return true;
				}
			}
		}
		return false;
	}
	
	static void join() {
		System.out.print("[ȸ������] id�� �Է��ϼ��� : ");
		String id = scan.next();
		if(checkId(id)) {
			System.out.println("�ߺ��� Id�Դϴ�.");
		}
		else {
			System.out.print("[ȸ������] pw�� �Է��ϼ��� : ");
			String pw = scan.next();
			System.out.print("[ȸ������] �̸��� �Է��ϼ��� : ");
			String name = scan.next();
			UserVer2 user = new UserVer2();
			user.id = id;
			user.pw = pw;
			user.name = name;
			userlist.add(user);
			AccountManagerVer2.openAccount(id);
			System.out.println("ȸ�������� �����մϴ�.");
		}
	}
}

class AccountVer2{
	String userId;
	String accountId;
	int money;
}

class AccountManagerVer2{
	static Scanner scan = new Scanner(System.in);
	static Vector<AccountVer2> accountlist = new Vector<>();
	
	static void dataSetting(String data) {
		String token[] = data.split("\n");
		for(int i = 0; i < token.length; i++) {
			AccountVer2 account = new AccountVer2();
			String token2[] = token[i].split("/");
			
			account.userId = token2[0];
			account.accountId = token2[1];
			account.money = Integer.parseInt(token2[2]);
			accountlist.add(account);
		}
	}
	
	static void openAccount(String id) {
		Random ran = new Random();
		String acId = "";
		
		for(int i = 0; i < 3; i++) {
			int r = ran.nextInt(10);
			acId += r;
			int r2 = ran.nextInt(10);
			acId += r2;
			int r3 = ran.nextInt(10);
			acId += r3;
			int r4 = ran.nextInt(10);
			acId += r4;
			if(i < 3 -1 ) {
				acId += "-";
			}
		}
		
		System.out.println("[���»���]" + id + " : " + acId);
		AccountVer2 account = new AccountVer2();
		account.accountId = acId;
		account.userId = id;
		account.money = 0;
		accountlist.add(account);
	}
	
	static Vector<AccountVer2> getPersonalAccount(String id){
		Vector<AccountVer2> personlist = new Vector<>();
		for(int i = 0; i < accountlist.size(); i++) {
			if(accountlist.get(i).userId.equals(id)) {
				personlist.add(accountlist.get(i));
			}
		}
		return personlist;
	}
	
	static void deposit() {
		System.out.print("[�Ա�] id�� �Է��ϼ��� : ");
		String id = scan.next();
		System.out.print("[�Ա�] pw�� �Է��ϼ��� : ");
		String pw = scan.next();
		if(UserManagerVer2.checkLogin(id, pw)) {
			System.out.println("[�Ա�] ���¹�ȣ�� �����ϼ��� : ");
			Vector<AccountVer2> personalAccount = getPersonalAccount(id); //personalAccount �ʱ�ȭ.
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "]" + personalAccount.get(i).accountId + " : ");
				System.out.println(personalAccount.get(i).money);
			}
			int sel = scan.nextInt();
			System.out.print("�ݾ��� �Է��ϼ��� : ");
			int money = scan.nextInt();
			personalAccount.get(sel).money += money;
		}
	}
	
	static void checkBalance() {
		System.out.println("[�Ա�] id �� �Է��ϼ���. ");
		String id = scan.next();
		System.out.println("[�Ա�] pw �� �Է��ϼ���. ");
		String pw = scan.next();
		if(UserManagerVer2.checkLogin(id, pw)) {			
			Vector<AccountVer2> personalAccount = getPersonalAccount(id);
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "] " + personalAccount.get(i).accountId + " : ");
				System.out.println(personalAccount.get(i).money);
			}			
		}
	}
	
	static void addAccount() {
		System.out.print("[�����߰�] id�� �Է��ϼ��� : ");
		String id = scan.next();
		System.out.print("[�����߰�] pw�� �Է��ϼ��� : ");
		String pw = scan.next();
		if(UserManagerVer2.checkLogin(id, pw)) {
			Vector<AccountVer2> personalAccount = getPersonalAccount(id);
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "] " + personalAccount.get(i).accountId + " : ");
				System.out.println(personalAccount.get(i).money);
			}			
			openAccount(id);
		}
		else {
			System.out.println("���� ������ Ȯ���ϼ���.");
		}
	}
} 

class BankVer2{
	
	Scanner scan = new Scanner(System.in);
	
	void run(){

		while(true) {
			System.out.println("(1)ȸ������  (2)�Ա� (3)��ȸ (4)�����߰� (0)����");
			int sel = scan.nextInt();
			if(sel == 1) {
				UserManagerVer2.join();						
			}
			else if(sel == 2) {
				AccountManagerVer2.deposit();				
			}
			else if(sel == 3) {
				AccountManagerVer2.checkBalance();				
			}
			else if(sel == 4) {
				
				AccountManagerVer2.addAccount();
				
			}
			else if(sel == 0) {
				System.out.println("����");
				break;
			}
		}
	}
}





public class test {

	public static void main(String[] args) {
		String userdata = "test01/pw1/��ö��\n";
		userdata += "test02/pw2/�̿���\n";
		userdata += "test03/pw3/�Źμ�\n";
		userdata += "test04/pw4/�ֻ��";
		
		String accountdata = "test01/1111-1111-1111/8000\n";
		accountdata += "test02/2222-2222-2222/5000\n";
		accountdata += "test01/3333-3333-3333/11000\n";
		accountdata += "test03/4444-4444-4444/9000\n";
		accountdata += "test01/5555-5555-5555/5400\n";
		accountdata += "test02/6666-6666-6666/1000\n";
		accountdata += "test03/7777-7777-7777/1000\n";
		accountdata += "test04/8888-8888-8888/1000";
		// 1) test01 ��ö�� �� ���¸� 3�� �������ִ�.
		// 2) test02 �̿��� �� ���¸� 2�� �������ִ�.
		// 3) test03 �Źμ� �� ���¸� 2�� �������ִ�.
		// 4) test04 �ֻ�� �� ���¸� 1�� �������ִ�. 
		
		UserManagerVer2 um = new UserManagerVer2();
		UserManagerVer2.dataSetting(userdata);
		
		AccountManagerVer2 am = new AccountManagerVer2();
		AccountManagerVer2.dataSetting(accountdata);		
		BankVer2 bank = new BankVer2();
		bank.run();




	}

}
