package lv1;

import java.util.Scanner;

public class a_lv3_ex26_id_pw {

	public static void main(String[] args) {
		/*
		 * # 회원가입 
		 * 1. 가입
		 * . 아이디 와 비밀번호를 입력받아 가입
		 * . 아이디 중복검사
		 * 2. 탈퇴
		 * . 아이디 를 입력받아 탈퇴
		 */
		Scanner sc =new Scanner(System.in);
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		//             0      1   2  3  4
		int cnt = 2;
		
		while(true) {

			for(int i=0;i<5;i++) {
				System.out.print(ids[i]+" ");				
			}
			System.out.println();
			for(int i=0;i<5;i++) {
				System.out.print(pws[i]+" ");				
			}
			System.out.println("\n1.가입");
			System.out.println("2.탈퇴");
			int sel=sc.nextInt();
			
			if(sel==1) {

			
			System.out.println("아이디를 입력 ㄱ");
			int inputId=sc.nextInt();
			
			//중복검사
			boolean check=true;
			for(int i=0;i<5;i++) {
				if(inputId==ids[i]) {
					check=false;
				}
			}
			
			if(check==true) {
				System.out.println("비번입력 ㄱ");
				int inputPw=sc.nextInt();
//				for(int i=0;i<5;i++) {
					ids[cnt]=inputId;
					pws[cnt]=inputPw;
					cnt++;
//				}
			}else {
				System.out.println("중복된 아디");
			}
			
		
			
		}
		else if (sel == 2) {
			System.out.println("탈퇴할 아디입력 ㄱ");
			int inputId = sc.nextInt();

			int idx = -1;
			for (int i = 0; i < 5; i++) {
				if (ids[i] == inputId) {
					idx = i;
				}
			}

			if (idx != -1) {
				System.out.println("비번입력ㄱ");
				int inputPw =sc.nextInt();

				if (pws[idx] == inputPw) {
					for (int i = idx; i < cnt-1; i++) {		//여기 cnt-1 범위 놓치기쉬움!!
						ids[i] = ids[i + 1];
						pws[i] = pws[i + 1];
					}

					ids[cnt - 1] = 0;
					pws[cnt - 1] = 0;
					cnt--;
				} else {

				}

			} else {

			}

		}
			
			
			
			
			
			
		}
		
		
		

	}

}
