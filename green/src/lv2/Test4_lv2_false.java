package lv2;

import java.util.Scanner;

public class Test4_lv2_false {

	public static void main(String[] args) {
		//시작 11:06
		//종료 00:00
		//소요 분
		
		/*
		 * # 쇼핑몰 뒤로가기
		 * 
		 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
		 *      뒤로가기 누르기전까지 남성의류 페이지 를 유지하려고한다.
		 * 힌트) 개층 별로 반복문을 추가 해주면된다. 
		 * 1. 남성의류
		 * 		1) 티셔츠
		 * 		2) 바지
		 * 		3) 뒤로가기
		 * 2. 여성의류
		 * 		1) 가디건
		 * 		2) 치마
		 * 		3) 뒤로가기
		 * 3. 종료
		 */
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sel = 0;
		
		
		while(run) {
		System.out.println("1.남성의류");
		System.out.println("    1)티");
		System.out.println("    2)바지");
		System.out.println("    3)뒤로가기");
		System.out.println("2.여성의류");
		System.out.println("	1)가디건");
		System.out.println(" 	2)치마");
		System.out.println("	3)뒤로가기");
		System.out.println("메뉴를 선택해주세요");
			sel=sc.nextInt();
			if(sel ==1) {
				System.out.println("1.남성의류를 선택하셨습니다.");
				boolean dp = true;
				while(dp) {
					System.out.println("1.남성의류");
					System.out.println("    1)티");
					System.out.println("    2)바지");
					System.out.println("    3)뒤로가기");	
					sel=sc.nextInt();
					if(sel==1) {
						System.out.println("티를 선택하셨습니다");
					}
					else if(sel==2){
						System.out.println("바지를 선택하셨습니다");
					}
					else if(sel ==3) {
						System.out.println("뒤로가기를 선택하셨습니다");
						break;
					}
					
				}
			}
			else if (sel==2) {
				System.out.println("1.남성의류를 선택하셨습니다.");
				boolean dp = true;
				while(dp) {
					System.out.println("2.여성의류");
					System.out.println("    1)가디건");
					System.out.println("    2)치마");
					System.out.println("    3)뒤로가기");	
					sel=sc.nextInt();
					if(sel==1) {
						System.out.println("가디건을 선택하셨습니다");
					}
					else if(sel==2){
						System.out.println("치마를 선택하셨습니다");
					}
					else if(sel ==3) {
						System.out.println("뒤로가기를 선택하셨습니다");
						break;
					}
					
				}
				
			}
			else if(sel==3) {
				System.out.println("종료하겠습니다");
				break;
			}
			
			
			
			
		}
		
		
		

	}

}
