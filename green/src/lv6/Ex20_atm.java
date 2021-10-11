package lv6;

import java.util.Scanner;

class ATM{
	Scanner sc=new Scanner(System.in);
	String name="GREEN BANK";
	
	String arAcc[]= null;
	String arPw[]= null;
	int arMoney[]= null;
	int count=0;
	int loginCheck=-1;	//-1->�α׾ƿ���
	
	void sMember() {
		if(this.arAcc!=null&&this.arPw!=null&&this.arMoney!=null) {
		for(int i=0;i<this.count;i++) {
			System.out.println(this.arAcc[i]+":"+this.arPw[i]+":"+this.arMoney[i]+"��");
		}
		}
	}
	
	void sMenu() {
		System.out.print("�α��� ���� : ");
		if(this.loginCheck==-1) {
			System.out.println("�α׾ƿ�");
		}
		else {
			System.out.println(this.arAcc[loginCheck]+"�� �α�����");
		}
		 System.out.println("=== " + this.name + " ===");
			System.out.println("1.ȸ������");	
			System.out.println("2.ȸ��Ż��");
			System.out.println("3.�α���");
			System.out.println("4.�α׾ƿ�");
			System.out.println("5.�Ա��ϱ�");
			System.out.println("6.��ü�ϱ�");			
	}
	void selectMenu() {
		System.out.println("�޴�����");
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
			System.out.println("�����ȣ�� �Է��ϼ���");
		String myPw=sc.next();
		
		int pwCheck=-1;
		if(this.arPw[accCheck].equals(myPw)) {
			pwCheck=1;
		}
		return pwCheck;			
	}
	
	int dcheckAcc() {
		System.out.println("Ż���� �����Է� ");
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
			System.out.println("Ż���� ������ �����ϴ�");
			return;
		}
		int accCheck=dcheckAcc();
		
		if(accCheck!=1) {
			int pwCheck= checkPw(accCheck);
			if(pwCheck==-1) {
				System.out.println("��й�ȣ �߸��Է��ϼ̽��ϴ�");
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
			System.out.println("Ż�𰡵Ǿ����ϴ�");
		}
		else {
			System.out.println("���� �����Դϴ�");
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
//			System.out.println("���̻� �����Ҽ� �����ϴ�");
//			return;
//		}
//		
//		System.out.println("������ �����Է����ּ���");
//		String myAcc=sc.next();
//		int check=this.checkAcc(myAcc);
//		
//		if(check==-1) {
//			System.out.println("���¹�ȣ�� �ߺ�");
//		}else {
//			System.out.println("����Է�");
//			String myPw=sc.next();
//			
//			this.arAcc[count]=myAcc;
//			this.arPw[count]=myPw;
//			this.arMoney[count]=0;
//			
//			count++;
//			System.out.println("ȸ�����ԿϷ�");
//		}
		
	}
	void login() {
		if(this.loginCheck!=-1) {
			System.out.println("�α׾ƿ��� �������ּ���");
			return;
		}else {
			System.out.println("���̵��Է����ּ���");
			String myId=sc.next();
			System.out.println("����Է����ּ���");
			String myPw=sc.next();
			for(int i=0;i<count;i++) {
			if(myId.equals(this.arAcc[i])&&myPw.equals(this.arPw[i])) {
				this.loginCheck=i;
				System.out.println("�α��μ���");
			}
				}
		}
	}
	
	void logout() {
		if(this.loginCheck==-1) {
			System.out.println("�α����� �������ּ���");
			return;
		}else {
			this.loginCheck=-1;
			System.out.println("�α׾ƿ��Ǽ̽��ϴ�");
		}
	}
	
	void income() {
		if(loginCheck==-1) {
			System.out.println("�α����� �������ּ���");
			return;
		}
		else {
		System.out.println("�Ա��� �ݾ��Է�");
		int inputM=sc.nextInt();
		
		this.arMoney[this.loginCheck]+=inputM;
		System.out.println("�ԱݿϷ�");
		}
	}
	
	void trans() {
		if(loginCheck==-1) {
			System.out.println("�α����� �������ּ���");
			return;
		}else {
		System.out.println("��ü�� �����Է�");
		String transAcc=sc.next();
		
		int tIdx=-1;
		for(int i=0;i<count;i++) {
			if(this.arAcc[i].equals(transAcc)) {
				tIdx=i;
			}
		}
		
		if(tIdx==-1) {
			System.out.println("���¹�ȣ Ȯ�����ּ���");
		}else {
			System.out.println("��ü�� �ݾ� �Է�");
			int transM=sc.nextInt();
			
			if(this.arMoney[loginCheck]>=transM) {
				this.arMoney[loginCheck]-=transM;
				this.arMoney[tIdx]+=transM;
			}else {
				System.out.println("�ܾ��� ����");
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
