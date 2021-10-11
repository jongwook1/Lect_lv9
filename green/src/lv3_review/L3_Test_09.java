package lv3_review;

import java.util.Scanner;

public class L3_Test_09 {

	public static void main(String[] args) {
		int arr[] = {0,2,0,3,4,0,0,5,0};	
		// 아래 번호를 입력받고 각방향 으로 0 이아닌숫자를 모으시요.
		// 1)left 2)right 
		
		// 예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		// 예) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("번호선택해주세요");
		System.out.println("1)left  2)right");
		int sel=sc.nextInt();
		
		if(sel==1) {
			int idx=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					arr[idx]=arr[i];
					idx++;
//					if(idx>3) {
//						arr[idx]=0;
//					}
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}

	}

}
