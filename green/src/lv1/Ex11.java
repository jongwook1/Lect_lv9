package lv1;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		

		/*
		 * # 최대값 구하기[1단계]
		 * 1. 숫자 3개를 입력받는다.
		 * 2. 입력받은 3개의 수를 비교하여,
		 * 3. 가장 큰 수(MAX)를 출력한다.
		 */
				 
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("숫자1입력: ");
		a = sc.nextInt();
		System.out.println("숫자2입력: ");
		b = sc.nextInt();
		System.out.println("숫자3입력: ");
		c = sc.nextInt();
		
		int max = a;	//비교대상의 값들 중 임의의 한개 값으로 초기화
		
		if(max < b) {
			max = b;
		}
		if(max < c) {			//else 를 쓰면 빠져나가므로 안댐
			max = c;
		}
	}

}
