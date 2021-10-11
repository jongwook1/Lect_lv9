package lv6;

import java.util.Scanner;

class ATM{
	Scanner sc=new Scanner(System.in);
	String name="GREEN BANK";
	
	String arAcc[]= null;
	String arPw[]= null;
	int arMoney[]= null;
	int count=0;
	int loginCheck=-1;	//-1->로그아웃중
	
	void sMember() {
		if(this.arAcc!=null&&this.arPw!=null&&this.arMoney!=null) {
		for(int i=0;i<this.count;i++) {
			System.out.println(this.arAcc[i]+":"+this.arPw[i]+":"+this.arMoney[i]+"원");
		}
		}
	}
	
	void sMenu() {
		System.out.print("로그인 상태 : ");
		if(this.loginCheck==-1) {
			System.out.println("로그아웃");
		}
		else {
			System.out.println(this.arAcc[loginCheck]+"님 로그인중");
		}
		 System.out.println("=== " + this.name + " ===");
			System.out.println("1.회원가입");	
			System.out.println("2.회원탈퇴");
			System.out.println("3.로그인");
			System.out.println("4.로그아웃");
			System.out.println("5.입금하기");
			System.out.println("6.이체하기");			
	}
	void selectMenu() {
		System.out.println("메뉴선택");
		int sel=sc.nextInt();
		
		if(sel==1) {
			jMember();
		}
		else if(sel==2) {
			withdraw();
		}
		else if(sel==3) {
			login();
		}
		else if(sel==4) {
			logout();
		}
		else if(sel==5) {
			income();
		}
		else if(sel==6) {
			trans();
		}
		
	}
	
	int checkAcc(String myAcc) {
		int check=1;
		if(this.arAcc!=null) {
		for(int i=0;i<count;i++) {
			if(this.arAcc[i].equals(myAcc)) {
				check=-1;
			}
		}
		}
		return check;
	}
	
	int checkPw(int accCheck) {
			System.out.println("비빌번호를 입력하세요");
		String myPw=sc.next();
		
		int pwCheck=-1;
		if(this.arPw[accCheck].equals(myPw)) {
			pwCheck=1;
		}
		return pwCheck;			
	}
	
	int dcheckAcc() {
		System.out.println("탈퇴할 계좌입력 ");
		String myAcc=sc.next();
		
		int dcheckAcc=-1;
		for(int i=0;i<count;i++) {
			if(this.arAcc[i].equals(myAcc)) {
				dcheckAcc=i;
			}
		}
		return dcheckAcc;
	}
	
	
	void withdraw() {
		if(count==0) {
			System.out.println("탈퇴할 정보가 없습니다");
			return;
		}
		int accCheck=dcheckAcc();
		
		if(accCheck!=1) {
			int pwCheck= checkPw(accCheck);
			if(pwCheck==-1) {
				System.out.println("비밀번호 잘못입력하셨습니다");
			}else {
				String[] temp1= this.arAcc;
				String[] temp2= this.arPw;
				int[] temp3= this.arMoney;
				this.arAcc=new String[count-1];
				this.arPw=new String[count-1];
				this.arMoney=new int[count-1];
				int j=0;
				for(int i=0;i<count;i++) {
					if(i!=accCheck) {
						this.arAcc[j]=temp1[i];
						this.arPw[j]=temp2[i];
						this.arMoney[j]=temp3[i];
						j++;
					}
				}
				temp1=null;				
				temp2=null;				
				temp3=null;				
			}
			count--;
			System.out.println("탈퇴가되었습니다");
		}
		else {
			System.out.println("없는 계좌입니다");
		}
	}
	
	void jMember() {
		if(count ==0) {
			this.arAcc=new String[count +1];
			this.arPw=new String[count +1];
			this.arMoney=new int[count +1];
		}else if(count>0) {
			String[] temp1 = this.arAcc;
			String[] temp2 = this.arPw;
			int[] temp3 = this.arMoney;
			this.arAcc=new String[count+1];
			this.arPw=new String[count+1];
			this.arMoney=new int[count+1];
			
			for(int i=0;i<count;i++) {
				this.arAcc[i]=temp1[i];
			}
			
			
		}
//		if(count==5) {
//			System.out.println("더이상 가입할수 없습니다");
//			return;
//		}
//		
//		System.out.println("가입할 계좌입력해주세요");
//		String myAcc=sc.next();
//		int check=this.checkAcc(myAcc);
//		
//		if(check==-1) {
//			System.out.println("계좌번호가 중복");
//		}else {
//			System.out.println("비번입력");
//			String myPw=sc.next();
//			
//			this.arAcc[count]=myAcc;
//			this.arPw[count]=myPw;
//			this.arMoney[count]=0;
//			
//			count++;
//			System.out.println("회원가입완료");
//		}
		
	}
	void login() {
		if(this.loginCheck!=-1) {
			System.out.println("로그아웃을 먼저해주세요");
			return;
		}else {
			System.out.println("아이디입력해주세요");
			String myId=sc.next();
			System.out.println("비번입력해주세요");
			String myPw=sc.next();
			for(int i=0;i<count;i++) {
			if(myId.equals(this.arAcc[i])&&myPw.equals(this.arPw[i])) {
				this.loginCheck=i;
				System.out.println("로그인성공");
			}
				}
		}
	}
	
	void logout() {
		if(this.loginCheck==-1) {
			System.out.println("로그인을 먼저해주세요");
			return;
		}else {
			this.loginCheck=-1;
			System.out.println("로그아웃되셨습니다");
		}
	}
	
	void income() {
		if(loginCheck==-1) {
			System.out.println("로그인을 먼저해주세요");
			return;
		}
		else {
		System.out.println("입금할 금액입력");
		int inputM=sc.nextInt();
		
		this.arMoney[this.loginCheck]+=inputM;
		System.out.println("입금완료");
		}
	}
	
	void trans() {
		if(loginCheck==-1) {
			System.out.println("로그인을 먼저해주세요");
			return;
		}else {
		System.out.println("이체할 계좌입력");
		String transAcc=sc.next();
		
		int tIdx=-1;
		for(int i=0;i<count;i++) {
			if(this.arAcc[i].equals(transAcc)) {
				tIdx=i;
			}
		}
		
		if(tIdx==-1) {
			System.out.println("계좌번호 확인해주세요");
		}else {
			System.out.println("이체할 금액 입력");
			int transM=sc.nextInt();
			
			if(this.arMoney[loginCheck]>=transM) {
				this.arMoney[loginCheck]-=transM;
				this.arMoney[tIdx]+=transM;
			}else {
				System.out.println("잔액이 부족");
			}
		}
		}
	}
	
	public void run() {
		while(true) {
			sMember();
			sMenu();
			selectMenu();
		}
	}
}
public class Ex20_atm {

	public static void main(String[] args) {
		
		ATM atm=new ATM();
		atm.run();


	}

}
