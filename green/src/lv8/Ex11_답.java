package lv8;

import java.util.ArrayList;

class User7{
	private String id;
	private String pw;
	private String userName;
	
	public User7(String id,String pw, String userName) {	//������
		this.id=id;
		this.pw=pw;
		this.userName=userName;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	
}

class UserManager7 {
	private static ArrayList<User7> users=new ArrayList<User7>();
	
	//User7 �� ���� 
	// �߰�/����/����

	public static void dataSetting(String data) {			//static ���� ������Ȯ���ϱ�
		//data �� ->�Ľ�-> users �迭�� ä���
		String temp[]=data.split("\n");
		for(int i=0;i<temp.length;i++) {
			String info[]=temp[i].split("/");
			users.add(new User7(info[0],info[1],info[2]));			//�̺κ� new�� ��ü���� �ϴ°� �������ϱ� �ƴϸ� ����Բ� �����ϱ�
					
		}		
	}
	
	public int getSize() {
		return users.size();
	}
	
	public User7 getUser(int index) {
		return users.get(index);
	}
	
	
}

class Account7{
	private String id;
	private String number;
	private int money;
	
	public Account7(String id, String number,String money) {		//������ money�� �Ķ���Ϳ��� String���� ������ ���� �Ʒ� ������
		this.id=id;
		this.number=number;
		this.money=Integer.parseInt(money);		//�����⼭ Integer.pa���ϸ�	�Ʒ��ʨ����� �������
	}
	
//	public String getAcc() {
//		return this.number;
//	}
	
	public String getId() {
		return this.id;
	}
	
}

class AccountManager7 {
	private static ArrayList<Account7> accs=new ArrayList<Account7>();		//static ���� ������Ȯ���ϱ�
	
	//Account7 �� ���� 
	// �߰�/����/����

	public static void dataSetting(String data) {
		//data �� ->�Ľ�-> accs �迭�� ä���
		
		String temp[]=data.split("\n");
		for(int i=0;i<temp.length;i++) {
			String info[]=temp[i].split("/");	//id/number/money
			accs.add(new Account7(info[0],info[1],info[2]));		//��
		}	
	}
	
	public int getSize() {
		return accs.size();
	}
	
	public Account7 getAcc(int index) {
		return accs.get(index);
	}
	
	
}

class Bank7 {
	
	private UserManager7 um= new UserManager7();
	private AccountManager7 am= new AccountManager7();
	
  void run() {
	  // ������� ��µǴ� �޼���
	  System.out.println(um.getSize());		//4
	  System.out.println(am.getSize());		//8
	  
	  sortAccById();
  }

  private void sortAccById() {
		for(int i=0; i<um.getSize(); i++) {
			int cnt = 0;
			for(int j=0; j<am.getSize(); j++) {
				if(um.getUser(i).getId().equals(am.getAcc(j).getId())) {
					cnt ++;
				}
			}
			
			// 1) test01 ��ö�� �� ���¸� 3�� �������ִ�.
			System.out.printf("%s %s�� ���¸� %d�� ������ �ִ�.\n", um.getUser(i).getId(), um.getUser(i).getUserName(), cnt);
		}
	}

}
public class Ex11_�� {

	public static void main(String[] args) {
		
		//					id/pw/name;
		String userdata = "test01/pw1/��ö��\n";
		userdata += "test02/pw2/�̿���\n";
		userdata += "test03/pw3/�Źμ�\n";
		userdata += "test04/pw4/�ֻ��";
		
		
		//						id/number/money
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
		
		UserManager7.dataSetting(userdata);
		AccountManager7.dataSetting(accountdata);		
		Bank7 bank = new Bank7();
		bank.run();

	}

}
