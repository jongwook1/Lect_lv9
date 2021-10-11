package lv4_review;

import java.util.Random;
import java.util.Scanner;

public class L4_Ex03 {

	public static void main(String[] args) {
		/*
		 * # 숫자 야구 게임
		 * 1. me에 1~9 사이의 숫자 3개를 저장
		 *    (단, 중복되는 숫자는 저장 불가)
		 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
		 * 3. 숫자와 자리가 같으면 		strike += 1
		 *    숫자만 같고 자리가 틀리면 	ball += 1
		 * 예)
		 * 정답 : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		
			Scanner sc=new Scanner(System.in);	
		int[] com = {1, 7, 3};
		int[] me = new int[3];		
		
		int s=0;
		int b=0;
		
		while(true) {
			for(int i=0;i<3;i++) {
				System.out.print(com[i]+" ");				
			}
			System.out.println();
			for(int i=0;i<3;i++) {
				System.out.print(me[i]+" ");				
			}
			System.out.println("S: "+s+"  B: "+b);
			
			
			for(int i=0;i<3;i++) {
				System.out.println("숫자 입력 ㄱ");
				int n=sc.nextInt();
				int check=-1;
				for(int j=0;j<3;j++) {
					if(me[j]==n) {
						check=1;
					}
				}
				if(check==-1) {
					me[i]=n;
				}else {
					System.out.println("중복숫자 안댐");
					i--;
				}
			}
			
			for(int i=0;i<3;i++) {				
					for(int j=0;j<3;j++) {
						if(com[i]==me[j]) {
							if(i==j) {
								s++;
							}else {
								b++;
							}
						}
					}				
			}
			if(s==3) {
			break;
			}
		}
		

	}

}
