package lv3;

import java.util.Scanner;

public class Ex07_2 {

	public static void main(String[] args) {
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		// 문제4) 학번을 입력하면 점수 출력 
		// 예) 1001==>20 , 1003 ==> 54
		
		Scanner sc= new Scanner(System.in);
		System.out.println("학번을 입력해주세요");
		int n = sc.nextInt();
		for(int i =0;i<6;i++) {
			if(arr[i]==n) {
			//System.out.println(i);
				System.out.println(arr[i+1]);			
			}
		}		
		// 문제5) 점수를 입력하면 학번 출력 
		// 예) 20 ==> 1001 , 45 ==> 1002
		System.out.println("점수를 입력해주세요");
		int n2=sc.nextInt();
		for(int i =0;i<6;i++) {
			if(arr[i]==n2) {
				System.out.println(arr[i-1]);
			}
		}
	}
}
