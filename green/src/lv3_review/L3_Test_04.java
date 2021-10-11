package lv3_review;

import java.util.Scanner;

public class L3_Test_04 {

	public static void main(String[] args) {
		/*
		 * # 회원가입 
		 * 1. 가입
		 * . 아이디 와 비밀번호를 입력받아 가입
		 * . 아이디 중복검사
		 * 2. 탈퇴
		 * . 아이디 를 입력받아 탈퇴
		 */

		
Scanner sc = new Scanner(System.in);
		
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			//출력 
			for(int i=0;i<5;i++) {
				System.out.print(ids[i]+" ");
			}
			System.out.println();
			for(int i=0;i<5;i++) {
				System.out.print(pws[i]+" ");
			}
			
			
			System.out.println("\n1.가입");
			System.out.println("2.탈퇴");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				System.out.println("아디입력해주세요");
				int inputId = sc.nextInt();
				
				int check=-1;
				for(int i=0;i<ids.length;i++) {
					if(ids[i]==inputId) {
						check=1;
					}
				}
				if(check==-1) {
					System.out.println("비번입력 ㄱㄱ");
					int inputPw=sc.nextInt();
					
						ids[cnt]=inputId;
						pws[cnt]=inputPw;
						System.out.println(inputId+"님 회원갑완료");
					
					cnt++;
				}
	
			}
			else if(sel == 2) {
				System.out.println("탈퇴할 아디입력 ㄱ");
				int inputId=sc.nextInt();
				
				int dIdx=-1;				
				for (int i = 0; i < cnt; i++) {
					if (ids[i] == inputId) {
                       dIdx=i;
					}
				}
				if(dIdx!=-1) {
					System.out.println("비번입력ㄱ");
					int dPw=sc.nextInt();
					if(pws[dIdx]==dPw) {
						for(int i=dIdx;i<cnt-1;i++) {
							ids[i]=ids[i+1];
							pws[i]=pws[i+1];
						}
						ids[cnt-1]=0;
						pws[cnt-1]=0;
						cnt--;
					}else {
						System.out.println("비밀번호 확인해주세요");
					}
					
				}else {
					System.out.println("회원정보 확인해주세요");
				}
				
			}
			
		}
		

	}

}
