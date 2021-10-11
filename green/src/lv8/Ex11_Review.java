package lv8;

import java.util.ArrayList;

class User777{
	String id;
	String pw;
	String name;
	
	public User777(String id,String pw,String name) {
		this.id=id;
		this.pw=pw;
		this.name=name;
	}
	
}
class UserManager777 {

	private static ArrayList<User777> users= new ArrayList<User777>();
	public static void dataSetting(String userdata) {
		
		String temp[]=userdata.split("\n");
		for(int i=0;i<temp.length;i++) {
			String info[]=temp[i].split("/");		//info[0]-test info[1]-pw info[2]-name
			users.add(new User777(info[0],info[1],info[2]));		
			
		}		

	}
}

class Account777{
	String id;
	String account;
	int money;
	
	public Account777(String id,String account,String money) {
		this.id=id;
		this.account=account;
		this.money=Integer.parseInt(money);
	}
}
class AccountManager777 {
	
	private static ArrayList<Account777> accs= new ArrayList<>();
	
	public static void dataSetting(String accountdata) {
		String temp[]=accountdata.split("\n");
		for(int i=0;i<temp.length;i++) {
			String info[]=temp[i].split("/");
			accs.add(new Account777(info[0],info[1],info[2]));
		}
	}
}

class Bank777 {
	private UserManager777 um=new UserManager777();
	private AccountManager777 am=new AccountManager777();
	
	private void sortAccByid() {
		
	}
	
	
	
  void run() {
	  sortAccByid();
  }

}
public class Ex11_Review {

	public static void main(String[] args) {
		String userdata = "test01/pw1/±èÃ¶¼ö\n";
		userdata += "test02/pw2/ÀÌ¿µÈñ\n";
		userdata += "test03/pw3/½Å¹Î¼ö\n";
		userdata += "test04/pw4/ÃÖ»ó¹Î";
		
		String accountdata = "test01/1111-1111-1111/8000\n";
		accountdata += "test02/2222-2222-2222/5000\n";
		accountdata += "test01/3333-3333-3333/11000\n";
		accountdata += "test03/4444-4444-4444/9000\n";
		accountdata += "test01/5555-5555-5555/5400\n";
		accountdata += "test02/6666-6666-6666/1000\n";
		accountdata += "test03/7777-7777-7777/1000\n";
		accountdata += "test04/8888-8888-8888/1000";
		// 1) test01 ±èÃ¶¼ö ´Â °èÁÂ¸¦ 3°³ °¡Áö°íÀÖ´Ù.
		// 2) test02 ÀÌ¿µÈñ ´Â °èÁÂ¸¦ 2°³ °¡Áö°íÀÖ´Ù.
		// 3) test03 ½Å¹Î¼ö ´Â °èÁÂ¸¦ 2°³ °¡Áö°íÀÖ´Ù.
		// 4) test04 ÃÖ»ó¹Î Àº °èÁÂ¸¦ 1°³ °¡Áö°íÀÖ´Ù. 
		
		UserManager777.dataSetting(userdata);
		AccountManager777.dataSetting(accountdata);		
		Bank777 bank = new Bank777();
		bank.run();

	}

}
