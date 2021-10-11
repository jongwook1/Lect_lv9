package lv1;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
			
		/*
		 * # 소수찾기[1단계]
		 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
		 * 2. 예) 2, 3, 5, 7, 11, 13, ..
		 * 3. 힌트
		 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
		 * 2) 나머지가 0일 때마다 카운트를 센다.
		 * 3) 그 카운트 값이 2이면 소수이다.      tip;나누어떨어지는횟수가 몇번인지
		 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
		 * 
		 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 한개를 입력하세요");
		int num = sc.nextInt();
		
		int div = 0;
		
		int i = 1; //1~num
		while(i <= num) {
			if(num % i == 0) {		//i % num 으로 하지않기 주의!
				div ++;
			}			
			i ++;
		}
		if(div == 2) {
			System.out.println("소수이다");
		}else {
			System.out.println("소수가 아니다");
		}
	}

}		
		
		
		
		
		
		
		
		
		
		
		
/*	내가한거
 * Scanner sc = new Scanner(System.in);	
	int n = 1;
	int cnt = 0;
	boolean isRun = true;
	
	System.out.println("숫자를 입력하세요");
	int inputN = sc.nextInt();	
			
	while(n <= inputN) {
		int a = (inputN % n);
		//System.out.println("a"+a);
			if(a == 0) {
				//System.out.println(+inputN +"은 소수이다");
					cnt++;
			}else {
				//System.out.println("소수가아니다");
			}
		n++;
	}
	if(cnt == 2) {
		System.out.println(+inputN +"은 소수이다");
	}else {
		System.out.println(+inputN+"은 소수가 아니다");
	}
	*/

