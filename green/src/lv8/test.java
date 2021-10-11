package lv8;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import javax.print.DocFlavor.STRING;

//3.10 12 : 24 ~ 01 : 35
//스태틱 활용 후

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
		System.out.print("[회원가입] id를 입력하세요 : ");
		String id = scan.next();
		if(checkId(id)) {
			System.out.println("중복된 Id입니다.");
		}
		else {
			System.out.print("[회원가입] pw를 입력하세요 : ");
			String pw = scan.next();
			System.out.print("[회원가입] 이름을 입력하세요 : ");
			String name = scan.next();
			UserVer2 user = new UserVer2();
			user.id = id;
			user.pw = pw;
			user.name = name;
			userlist.add(user);
			AccountManagerVer2.openAccount(id);
			System.out.println("회원가입을 축하합니다.");
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
		
		System.out.println("[계좌생성]" + id + " : " + acId);
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
		System.out.print("[입금] id를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[입금] pw를 입력하세요 : ");
		String pw = scan.next();
		if(UserManagerVer2.checkLogin(id, pw)) {
			System.out.println("[입금] 계좌번호를 선택하세요 : ");
			Vector<AccountVer2> personalAccount = getPersonalAccount(id); //personalAccount 초기화.
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "]" + personalAccount.get(i).accountId + " : ");
				System.out.println(personalAccount.get(i).money);
			}
			int sel = scan.nextInt();
			System.out.print("금액을 입력하세요 : ");
			int money = scan.nextInt();
			personalAccount.get(sel).money += money;
		}
	}
	
	static void checkBalance() {
		System.out.println("[입금] id 를 입력하세요. ");
		String id = scan.next();
		System.out.println("[입금] pw 를 입력하세요. ");
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
		System.out.print("[계좌추가] id를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[계좌추가] pw를 입력하세요 : ");
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
			System.out.println("계좌 정보를 확인하세요.");
		}
	}
} 

class BankVer2{
	
	Scanner scan = new Scanner(System.in);
	
	void run(){

		while(true) {
			System.out.println("(1)회원가입  (2)입금 (3)조회 (4)계좌추가 (0)종료");
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
				System.out.println("종료");
				break;
			}
		}
	}
}





public class test {

	public static void main(String[] args) {
		String userdata = "test01/pw1/김철수\n";
		userdata += "test02/pw2/이영희\n";
		userdata += "test03/pw3/신민수\n";
		userdata += "test04/pw4/최상민";
		
		String accountdata = "test01/1111-1111-1111/8000\n";
		accountdata += "test02/2222-2222-2222/5000\n";
		accountdata += "test01/3333-3333-3333/11000\n";
		accountdata += "test03/4444-4444-4444/9000\n";
		accountdata += "test01/5555-5555-5555/5400\n";
		accountdata += "test02/6666-6666-6666/1000\n";
		accountdata += "test03/7777-7777-7777/1000\n";
		accountdata += "test04/8888-8888-8888/1000";
		// 1) test01 김철수 는 계좌를 3개 가지고있다.
		// 2) test02 이영희 는 계좌를 2개 가지고있다.
		// 3) test03 신민수 는 계좌를 2개 가지고있다.
		// 4) test04 최상민 은 계좌를 1개 가지고있다. 
		
		UserManagerVer2 um = new UserManagerVer2();
		UserManagerVer2.dataSetting(userdata);
		
		AccountManagerVer2 am = new AccountManagerVer2();
		AccountManagerVer2.dataSetting(accountdata);		
		BankVer2 bank = new BankVer2();
		bank.run();




	}

}
