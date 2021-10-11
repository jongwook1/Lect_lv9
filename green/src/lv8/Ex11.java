package lv8;

import java.util.Scanner;
import java.util.Vector;

class User9 {
	String id;
	String pw;
	String name;

	void print() {
		System.out.printf("�̸� %s �Ƶ� %s ��� %s \n", this.name, this.id, this.pw);
	}
}

class UserManager9 {
	static Vector<User9> userlist = new Vector<User9>();

	public static void dataSetting(String userdata) {
		String temp[] = userdata.split("\n");
		for (int i = 0; i < temp.length; i++) {
			User9 user = new User9();
			String temp2[] = temp[i].split("/");
			user.id = temp2[0];
			user.pw = temp2[1];
			user.name = temp2[2];
			userlist.add(user);
			user.print();

//			User9 user[]= new User9[temp.length];
//			user[i]=new User9();
//			String temp2[]=temp[i].split("/");
//			user[i].id=temp2[0];
//			user[i].pw=temp2[1];
//			user[i].name=temp2[2];
//			user[i].print();
		}
	}

	void checkUser(String searchId) {
		for (int i = 0; i < userlist.size(); i++) {
			if (userlist.get(i).equals(searchId)) {
				System.out.println(userlist.get(i).name);
			}

		}
	}

}

class Account9 {
	String userId;
	String accountId;
	String money;

	void print() {
		System.out.printf("�Ƶ� %s ���� %s �� %s \n", this.userId, this.accountId, this.money);
	}

}

class AccountManager9 {
	Scanner sc = new Scanner(System.in);
//	Account9 account[] =new Account9[1];
	

	UserManager9 um = new UserManager9();

	static Vector<Account9> accountlist = new Vector<>();

	public static void dataSetting(String accountdata) {
		String temp[] = accountdata.split("\n");
		for (int i = 0; i < temp.length; i++) {
			Account9 account = new Account9();
			String temp2[] = temp[i].split("/");
			account.userId = temp2[0];
			account.accountId = temp2[1];
			account.money = temp2[2];
			accountlist.add(account);
			account.print();

//			Account9 account[] =new Account9[temp.length];
//			account[i]=new Account9();
//			String temp2[]=temp[i].split("/");
//			account[i].userId=temp2[0];
//			account[i].accountId=temp2[1];
//			account[i].money=temp2[2];
//			account[i].print();
		}
	}

	void accountCheck() {
		int cnt=0;
		int accountCnt = 0;
		for (int i = 0; i <um.userlist.size(); i++) {
			for(int j=0;j<accountlist.size();j++) {
				if (um.userlist.get(i).id.equals(accountlist.get(j).userId)) {				
					accountCnt++;						
				}
				
			}
		}
		
		for(int i=0;i<um.userlist.size();i++) {
		System.out.printf("�Ƶ�:%s �̸�:%s ������ ����:%d \n",um.userlist.get(i).id,um.userlist.get(i).name,accountCnt);
//			
		}
		
//		String uName = "";
//		for (int i = 0; i < um.userlist.size(); i++) {
//			if (um.userlist.get(i).id.equals(um.userlist.get(i).id)) {
//				uName = um.userlist.get(i).name;
//			}
//		}
//
//		for(int i=0;i<um.userlist.size();i++) {
//		System.out.println("userId: " + um.userlist.get(i).id + " �̸�: " + uName + " ������ ����: " + accountCnt);
//		}
//		for(int i=0;i<account.length;i++) {
//			account[i]=new Account9();
//		if(accountlist.get(i).equals(searchId)){
//			cnt++;
//		}
//		}
//		System.out.println(cnt);
	}

}

class Bank9 {
	private UserManager9 um = new UserManager9();
	private AccountManager9 am = new AccountManager9();
	
	void run() {
		am.accountCheck();
	}

}

public class Ex11 {

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

		UserManager9.dataSetting(userdata);
		AccountManager9.dataSetting(accountdata);
		Bank9 bank = new Bank9();
		bank.run();

	}

}


