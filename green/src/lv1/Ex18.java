package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		/*
		 * # 지하철 요금 계산
		 * 1. 이용할 정거장 수를 입력받는다.		// int n = sc.nextInt();
		 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
		 * 3. 요금표
		 * 1) 1~5	: 500원
		 * 2) 6~10	: 600원
		 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)				
		 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
		 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
		 * ... 
		 */
		
		//10정거장 초과 시,
		
		//11      12 / 13      14 / 15     16 / 17        18 / ...
		//홀+1 ==  짝/ 홀+1 ==   짝 / 홀+1 == 짝 /  홀+1 ==   짝  / ...      
		//  반으로 나누면
		//      1   /      2      /     3    /        4		 / ...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정거장수 입력");
		int stop = sc.nextInt();
		
		int total = 0;	// 총 요금
		
		if(stop > 0) {
			total = 500;	//가본 요금
			
			//1차 할증 (6~10)
			if(stop >= 6) {
				total += 100;
			}
			//2차 할증 (11~)
			if(stop > 10) {
				//2정거장마다 50원 할증
				if(stop % 2 == 1) {
					stop ++;	//짝수로 맞춤
				}
				int count = (stop - 10)/2;
				int add = count * 50;
				
				total += add;
			}
			
		}
		
		System.out.println("요금은 " + total + "원입니다");
		

		/*내가 하던거	
		
		
		Random rn = new Random();
		
		int input = sc.nextInt();
		int r = ((input % 2) +1 )/2;			//나머지 1 2 3 4
		  
		System.out.println(input);
		
		if(input <= 5) {
			System.out.println("500원");
		}
		else if (input <= 10) {
			System.out.println("600원");
		}else if (input <= 10) {
			System.out.println("600원");
		}
		
		// c /2 = 0 는 2의 배수 0 1 2 3 4 
		*/
	}
}






