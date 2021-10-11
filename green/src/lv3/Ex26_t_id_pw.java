package lv3;

import java.util.Scanner;

public class Ex26_t_id_pw {

	public static void main(String[] args) {
		/*
		 * # 회원가입 
		 * 1. 가입
		 * . 아이디 와 비밀번호를 입력받아 가입
		 * . 아이디 중복검사
		 * 2. 탈퇴
		 * . 아이디 를 입력받아 탈퇴
		 */
		Scanner scan =new Scanner(System.in);
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		//             0      1   2  3  4
		int cnt = 2;
		boolean run = true;
		while(run) {
			System.out.println("cnt "+cnt);
			for(int i=0;i<5;i++) {
				System.out.print(ids[i]+" ");
			}
			System.out.println();
			for(int i=0;i<5;i++) {
				System.out.print(pws[i]+" ");
			}			
			System.out.println();
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {	//배열컨트롤러 (추가)
				System.out.println("가입할 아이디:");
				int inputId=scan.nextInt();
				
				
				boolean check=true;
				for(int i=0; i<cnt; i++) {//중복여부확인
					if(ids[i]==inputId) {
						check=false;
					}
				}
				if(check==true) {
					System.out.println("비밀번호 입력");
					int inputPw= scan.nextInt();
					
					ids[cnt] =inputId;
					pws[cnt] =inputPw;
					cnt++;
					
					System.out.println("회원가입을 환영합니다");
				}
				else {
					System.out.println("이미 사용중인 아이디입니다");
				}
			}
			else if(sel == 2) {
				System.out.println("탈퇴할 아이디 입력: ");
				int inputId =scan.nextInt();
				
				int delIdx=-1;
				for(int i=0;i<5;i++) {	//삭제할 인덱스의 정보 찾기
					if(ids[i]== inputId) {
						delIdx=i;
					}
				}
				if(delIdx != -1) {
					System.out.println("비밀번호 입력:");
					int inputPw =scan.nextInt();
					
					if(pws[delIdx]==inputPw) {
						
						for(int i=delIdx; i<cnt-1;i++) {		//한칸씩땡김 //여기 cnt-1 범위 놓치기쉬움!!
							ids[i] =ids[i+1];
							pws[i] =pws[i+1];
						}						//이 아래부분(세줄) 주석처리후 실행하고 문제점발견하고 주석풀고 다시하면 이해하기쉬움
						ids[cnt-1]=0;			//마지막인덱스부분처리를위해(끝부분처리)
						pws[cnt-1]=0;			//마지막인덱스부분처리를위해(끝부분처리)
						cnt--;
						
						
						
//		이렇게하면틀림		ids[delIdx]=0;
//						pws[delIdx]=0;
//						cnt--;
					}else {
						System.out.println("회원정보를 다시 확인하세요");
					}
				}else {
					System.out.println("회원정보를 다시 확인하세요");
				}
				
				
				
			}
			
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
