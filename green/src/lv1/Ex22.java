package lv1;

public class Ex22 {

	public static void main(String[] args) {
		// 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5, 6, 7, 8, 9
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3
		// 문제3) 1~10까지 반복해 짝수만 출력
		// 정답3) 2, 4, 6, 8, 10
		
		/* 문2
		int num1 = 1;
		
		while(num1 <= 10){			
			num1++;
			if(num1 >= 5 && num1 <= 9) {
				System.out.println(+num1);
			}			
		}
		*/
		
		/* 문2
		int b = 10;
		
		while(b > 0) {
			if(b <= 6 && b >= 3) {
				System.out.println(+b);
			}
			b --;			
		}
		*/
		
		/*문3
		int c = 1;
		
		while(c <= 10 ) {
			if(c % 2 == 0) {
				System.out.println(+c);
			}
			c++;
		}
		*/
		
		
		
		//기본문제2 
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		
		
		
		//문1
		int cnt = 0;
		int sum = 0;
		int a = 1;
		while(a <=5) {
			sum +=a;
			a++;
		}
		
		sum = 0;
		a =1;
		while(a <= 10) {
			if(a < 3 || a> 7) {
				System.out.println(a);
				sum += a;
				cnt ++;
			}
			a++;
		}
		//문3
		//정답 37
		System.out.println(+sum);
		
		
		//문4
		//정답 6
		System.out.println(+cnt);
		
		
		
		
		
		
		
		
		
		
	}
}