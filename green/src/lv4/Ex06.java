package lv4;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * # ATM[4단계] : 전체 기능구현
		 * 1. 회원가입
		 * . id와 pw를 입력받아 가입
		 * . 가입 시 돈 1000원 부여
		 * . id 중복체크
		 * 2. 회원탈퇴
		 * . 로그인시에만 이용가능
		 * 3. 로그인
		 * . id와 pw를 입력받아 로그인
		 * . 로그아웃 상태에서만 이용가능
		 * 4. 로그아웃
		 * . 로그인시에만 이용가능
		 * 5. 입금
		 * . 로그인시에만 이용가능
		 * 6. 이체
		 * . 로그인시에만 이용가능
		 * 7. 잔액조회
		 * . 로그인시에만 이용가능
		 */
		final int SIZE = 3;	
		int ids[]=new int[SIZE];
		int pws[]=new int[SIZE];
		int p1M=50000;
		int p2M=60000;
		int coin=0;
		int login=-1;		//-1:로그아웃된상태  //0~:로그아웃안한상태
		int money=0;
		
		Scanner sc= new Scanner(System.in);
		
		int cnt=0;
		boolean run= true;
		while(run) {			
			for(int i=0;i<3;i++) {
				System.out.print(ids[i]+" ");
			}
			System.out.println();
			for(int i=0;i<3;i++) {
				System.out.print(pws[i]+" ");
			}
			System.out.println("\n1.회원가입");
			System.out.println("2.회원탈퇴");
			System.out.println("3.로그인");
			System.out.println("4.로그아웃");
			System.out.println("5.입금");
			System.out.println("6.이체");
			System.out.println("7.잔액조회");
			System.out.println("8.종료");
			
			System.out.println("메뉴를 선택해주세요");
			
			int sel=sc.nextInt();
			
			if(sel==1) {
				if(cnt<3) {
				System.out.println("id입력해주세요");
				int inputId=sc.nextInt();
				
				boolean check=true;
				for (int i = 0; i < 3; i++) {
					if (inputId == ids[i]) {
						check=false;
						System.out.println("중복된아아이디입니다");
					}
				}if(check==true) {
					System.out.println("비밀번호 입력");
					int inputPw= sc.nextInt();
										
					ids[cnt]=inputId;
					pws[cnt]=inputPw;
					coin+=1000;
					cnt++;
					System.out.println("회원가입되신것을 환영합니다");
				}				
			}else {
				System.out.println("회원정원이 마감되었습니다");
			}
				}
			else if(sel==2) {
				System.out.println("탈퇴할 아이디를 입력하세요");
				int inputid=sc.nextInt();
				
				int delidx=-1;
				for(int i=0;i<3;i++) {
					if(inputid==ids[i]) {
						delidx=i;
					}
				}
				if(delidx!=-1) {
					System.out.println("탈퇴할 비번을 입력하세요");
					int inputpw=sc.nextInt();
					
					if(inputpw==pws[delidx]) { 
					for(int i=delidx;i<cnt-1;i++) {						
							ids[i]=ids[i+1];
							pws[i]=pws[i+1];
							
					}
					ids[cnt-1]=0;		
					pws[cnt-1]=0;			
					cnt--;
					System.out.println("탈퇴처리가 되었습니다");
					
					}else {
						System.out.println("비번이 틀립니다 확인바람");
					}
					
				}else {
					System.out.println("가입된 아디가 없습니다 확인바람");
				}				
			}
			else if(sel==3) {
				if(login==-1) {
					System.out.println("아이디를 입력하세요");
					int inputid=sc.nextInt();
					
					int inidx = -1;
					for (int i = 0; i < 3; i++) {
						if (inputid == ids[i]) {
							inidx = i;
						}
					}
					if(inidx!=-1) {
						System.out.println("비번을 입력하세요");
						int inputpw=sc.nextInt();
						
						if(inputpw==pws[inidx]) {
							System.out.println("로그인이 되었습니다.");
							login=1;
						}else {
							System.out.println("비번을 확인하세요");
						}						
					}else {
						System.out.println("아이디를 확인하세요");
					}					
				}else {
					System.out.println("로그인상태입니다");
				}
			}
			else if(sel==4) {
				if(login == -1) {
					System.out.println("로그인을 먼저 해주세요!");
				}
				else {
					System.out.println("로그아웃을 했습니다.");
					login = -1; //
				}
			}
			else if(sel==5) {
				if(login==-1) {
					System.out.println("로그인먼저해주세요");
				}else {
					System.out.println("입금할 금액을 입력해주세요");
					int inpuM=sc.nextInt();
					if(inpuM > 0) {
						if(login == 1) {
							p1M += inpuM;
						}
						
					}
					
				}
			}
			else if(sel==6) {
				if(login == -1) {
					System.out.println("로그인을 먼저 해주세요!");
				}else {
					System.out.println("이체받을 계좌(아디)입력");
					int inputid=sc.nextInt();
					System.out.println("이체할 금액 입력");
					int inputM=sc.nextInt();
					if (login == 1) {
						for (int i = 0; i < 3; i++) {
							if (ids[i] == inputid) {
								if (inputM <= p1M) {
									p2M += inputM;
									p1M -= inputM;
									System.out.println("이체완료");
								}else {
									System.out.println("잔고가 부족합니다");
								}
							}
						}
					}
					
				}
			}
			else if(sel==7) {
				if(login ==-1) {
					System.out.println("로그인을 먼저 해주세요!");
				}else {
					if(login==1) {
						System.out.println("현재잔액:"+ (p1M+coin)+"원");
					}else if(login == 2) {
						System.out.println("현재 잔액: " + (p2M+coin) + "원");
					}
				}
			}else if(sel==8) {
				run=false;
				System.out.println("종료하겠습니다");
			}
			
			
			
			
			
			
			
			
			
		}

	}

}
