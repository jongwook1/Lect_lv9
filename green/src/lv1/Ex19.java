package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		/*
		 * # 연산자 기호 맞추기 게임
		 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
		 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
		 * 3. 위 숫자는 연산자 기호에 해당된다.
		 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
		 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
		 * 예) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    정답 : 2번
		 */
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int a = rn.nextInt(10) +1;
		int b = rn.nextInt(10) +1;
		
		int op = rn.nextInt(4)+1;
		
		int result = 0;
		
		if(op == 1) {
			
		}
		else if(op == 1) {
			result = a + b;
		}
		else if(op == 2) {
			result = a - b;
		}
		else if(op == 3) {
			result = a * b;
		}
		else if(op == 4) {
			result = a / b;
		}
		
		//문제보여주기
		System.out.println(a + "? " +b + "=" + result);
		System.out.println("연산자는? 1)+ 2)- 3)* 4) %");
		
		
		int answer = sc.nextInt();
		
		//검사
		if(answer == op) {
			System.out.println("정답");
		}else{
			System.out.println("땡");
		}
		
		
		
		
		
		
		
		/*	Scanner sc = new Scanner(System.in);
			Random rn = new Random();
			int rN1 = rn.nextInt(10) +1;
			int rN2 = rn.nextInt(10) +1;
			int rN3 = rn.nextInt(4) +1;			//연산자 기호
			
			System.out.println(rN1+ "?" + rN2 + "=" + (rN1 + rN2));
			System.out.println("다음중 맞는 정답은 ?");
			System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4.나머지");
			System.out.println("정답을 입력하세요");
			
			int input = sc.nextInt();
			
			if(input == 1) {				
				System.out.println("덧셈");
				System.out.println("정답 : " + input +"번");
			}else if(input == 2) {
				System.out.println("뺄셈");
				System.out.println("정답 : " + input +"번");
			}else if(input == 3) {
				System.out.println("곱셈");
				System.out.println("정답 : " + input +"번");
			}else if(input == 4) {
				System.out.println("나머지");
				System.out.println("정답 : " + input +"번");
			}else {
				System.out.println("잘못선택하셨습니다");			
			}			
			*/			
	}
}

/*
 if(input == 1) {				
				System.out.println("덧셈");
			}else if(input == 2) {
				System.out.println("뺄셈");
			}else if(input == 3) {
				System.out.println("곱셈");
			}else if(input == 4) {
				System.out.println("나머지");
			}
 */
 
