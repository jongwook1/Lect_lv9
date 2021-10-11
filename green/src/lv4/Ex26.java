
package lv4;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// 문제1) 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력
		// (단 ! 짝수자리의 수는 짝수자리라고 출력)
		// 예) 123 ==> 2
		// 예) 1234 ==> 짝수의 자리이다
		// 예) 1 ==> 1
		// 예) 1234567 ==> 4
		// 힌트 자리수를 구하고 배열을 만든다음 하나씩 저장
		// 예) ==> 123 ==> 3 ==> arr[] = new int[3];

//		// lv2test할때 6.12 자릿수 환산했던거 참고해서
//		double num = 6.12; // 612
//		// while...
//
//		int digit = 0;
//		while (num % 1 > 0) {
//			num *= 10;
//			digit++;
//		}
//		System.out.println(digit);
//		System.out.println(num);
//
//		// 원자리수로 복귀
//		while (digit > 0) {
//			num /= 10;
//			digit--;
//		}
//
//		System.out.println(num);
		

		Scanner sc=new Scanner(System.in);
		
		System.out.print("1~1백만 숫자입력: ");
		int num =sc.nextInt();
		
		if(num >=1 &&num<= 1000000) {
			int temp=num;			//num변수는 딴곳에 써야하므로 temp변수만들어 넣어줌
			
			
			int digit=0;
			while(temp>0) {
				temp /=10;		//몫만 가져옴
				digit++;
				
			}
			System.out.println(digit);
			
			if(digit%2==0) {
				System.out.println("짝수자리 수  입니다.");
			}else {
				int arr[]=new int [digit];		//{1,2,3,4,5}넣었다고 가정시
				
				int idx=arr.length-1;
				while(digit>0) {		
				arr[idx]=num %10;				//꼬리땐거 가져온거
				num /=10;
				idx--;
				digit--;
				}
//				for(int i=0;i<arr.length;i++) {
//					System.out.print(arr[i]+" ");
//				}
				
				System.out.println(arr[arr.length/2]);

				
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
