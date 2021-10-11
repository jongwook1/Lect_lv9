package lv8;

import java.util.ArrayList;

class User7{
	private String id;
	private String pw;
	private String userName;
	
	public User7(String id,String pw, String userName) {	//생성자
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
	
	//User7 에 대한 
	// 추가/수정/삭제

	public static void dataSetting(String data) {			//static 유무 차이점확인하기
		//data 를 ->파싱-> users 배열을 채우기
		String temp[]=data.split("\n");
		for(int i=0;i<temp.length;i++) {
			String info[]=temp[i].split("/");
			users.add(new User7(info[0],info[1],info[2]));			//이부분 new로 객체생성 하는거 꼭이해하기 아니면 강사님께 질문하기
					
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
	
	public Account7(String id, String number,String money) {		//생성자 money는 파라미터에선 String으로 가져옴 따라서 아래 ㉠에서
		this.id=id;
		this.number=number;
		this.money=Integer.parseInt(money);		//㉠여기서 Integer.pa안하면	아래쪽㉡에서 해줘야함
	}
	
//	public String getAcc() {
//		return this.number;
//	}
	
	public String getId() {
		return this.id;
	}
	
}

class AccountManager7 {
	private static ArrayList<Account7> accs=new ArrayList<Account7>();		//static 유무 차이점확인하기
	
	//Account7 에 대한 
	// 추가/수정/삭제

	public static void dataSetting(String data) {
		//data 를 ->파싱-> accs 배열을 채우기
		
		String temp[]=data.split("\n");
		for(int i=0;i<temp.length;i++) {
			String info[]=temp[i].split("/");	//id/number/money
			accs.add(new Account7(info[0],info[1],info[2]));		//㉡
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
	  // 결과물이 출력되는 메서드
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
			
			// 1) test01 김철수 는 계좌를 3개 가지고있다.
			System.out.printf("%s %s은 계좌를 %d개 가지고 있다.\n", um.getUser(i).getId(), um.getUser(i).getUserName(), cnt);
		}
	}

}
public class Ex11_답 {

	public static void main(String[] args) {
		
		//					id/pw/name;
		String userdata = "test01/pw1/김철수\n";
		userdata += "test02/pw2/이영희\n";
		userdata += "test03/pw3/신민수\n";
		userdata += "test04/pw4/최상민";
		
		
		//						id/number/money
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
		
		UserManager7.dataSetting(userdata);
		AccountManager7.dataSetting(accountdata);		
		Bank7 bank = new Bank7();
		bank.run();

	}

}
