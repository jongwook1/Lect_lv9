package lv3;

import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// 문제 1) 다음 리스트를 값을 입력하면   번호 출력 
		// 예) 51 ==> 2
		// 예) 10 ==> 0
		Scanner sc= new Scanner(System.in);
		int ipn=sc.nextInt();
		
		for(int i=0;i<5;i++) {		
		if(a[i]==ipn) {
	System.out.println(i);}	}
		System.out.println(" 2번");
		// 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		//int idx=-1
		for(int i=0;i<5;i++) {
			if(a[i] %2 ==1) {
				b[i]=a[i];
				//idx++;
			}
		}for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		System.out.println("3번");
		
		
		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)
	    // 2번문제와 조금 다름
		// 예) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int idx=0;
		for(int i=0;i<5;i++) {
			if(a[i]%2==1) {
				c[idx]=a[i];
				idx++;
			}
		}for(int i=0;i<5;i++) {
			System.out.println(c[i]);
		}
		
		
		
		
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		// 문제4) 학번을 입력하면 점수 출력 
		// 예) 1001==>20 , 1003 ==> 54
		System.out.println("학번 ㄱㄱ");
		int num =sc.nextInt();
		
			
		
		
		
		// 문제5) 점수를 입력하면 학번 출력 
		// 예) 20 ==> 1001 , 45 ==> 1002
			for(int i=0;i<6;i+=2) {
				if(num==arr[i]) {
					System.out.println("점수"+arr[i]+"학번"+arr[i-1]);
				}
			}


	}

}
