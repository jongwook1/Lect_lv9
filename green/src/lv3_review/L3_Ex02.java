package lv3_review;

import java.util.Random;

public class L3_Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Random rn=new Random();
		
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for(int i=0;i<5;i++) {
			int rN=rn.nextInt(100)+1;
			arr[i]=rN;
		
			System.out.print(arr[i]+" ");
			
		}
		
		
		System.out.println();
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int sum=0;
		
		for(int i=0;i<5;i++) {
			int rN=rn.nextInt(100)+1;
			arr[i]=rN;
			sum=arr[i];
			System.out.print(arr[i]+" ");
			
		}
		int avg=sum/5;
		System.out.println("총점: " +sum+"평균: "+avg);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt=0;
		for(int i=0;i<5;i++) {
			int rN=rn.nextInt(100)+1;
			arr[i]=rN;
			if(arr[i]>=60) {
				cnt++;
			}
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("합격생의 수: "+cnt);
		
		
	}

}
