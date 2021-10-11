package lv3;

import java.util.Scanner;

public class Ex05_other {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};		
		char code[] = {'a','b','c','d','e'};
		
		//arr 배열에서 입력받은 값을 찾으면 -> 해당 코드를 출력
		
		
		System.out.println("정수 입력: ");
		int data = sc.nextInt();
		
		
		int idx =0;						///// 인덱스 정보를 저장하는 변수는 음수로 초기화를 하자
										///인덱스 값은 0부터 존재하기때문에 -> 유요한값 ex)0 으로 초기화하면 값을 잘못 참조할수있음
		
		for(int i=0; i<5; i++) {
			if(data == arr[i]) {
				idx = i;
			}
		}
		
		//idx활용-->code 출력
		System.out.println(code[idx]);
		if(idx == -1) {
			System.out.println("존재하지 않는 값입니다!");
		}else {
			System.out.println(code[idx]);
		}

	}

}
