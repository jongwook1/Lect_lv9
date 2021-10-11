package lv3;

import java.util.Scanner;

public class Ex25_test {

	public static void main(String[] args) {
		//문제1) 추가 를 선택하고 값을 입력하면 10 , 20 뒤에 저장한다.
		// 최대 5개까지 저장
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};		//2	3	4
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			if(cnt==5) {
				break;
			}
			System.out.println();			
			System.out.println("[1]추가");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if(sel == 1) {

				for(int i=0;i<5;i++) {
				if(arr[cnt]!=0) {
					System.out.println("더이상 값을 입력할수없습니다.");
				}
				}for(int i=0;i<5;i++) {
					if(arr[i]==0) {
						System.out.print("추가할 값 입력 : ");
						int data = sc.nextInt();
						arr[cnt]=data;
						cnt++;
					}
				}
				
				
				
				
			}
		}

	}
}
