package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class L1_t1 {

	public static void main(String[] args) {
		/* # 가위(0)바위(1)보(2) 게임[2단계] 
		 * # 가위바위보 게임[2단계]를
		 *   if - else if 구문으로 변경해보자.
		 */
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		int com=rn.nextInt(3);
		System.out.println(com);
		System.out.print("가위(0),바위(1),보(2) ");
		System.out.println("\n값(0~2)을 입력해주세요");
		int me=sc.nextInt();
		
		if(com==me) {
			System.out.println("비겼다");
		}
		else if(com==0&&me==1) {
			System.out.println("이겼다");
		}
		else if(com==1&&me==2) {
			System.out.println("이겼다");
		}
		else if(com==2&&me==0) {
			System.out.println("이겼다");
		}else {
			System.out.println("졌다");
		}
		

	}

}
