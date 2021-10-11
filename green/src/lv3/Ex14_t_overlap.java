package lv3;

import java.util.Random;

public class Ex14_t_overlap {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[1단계]
		 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
		 * 2. 단, 중복되는 숫자는 없어야 한다.
		 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
		 * 
		 * 예)
		 * 랜덤숫자 : 1
		 * check = {0, 1, 0, 0, 0}
		 * arr   = {1, 0, 0, 0, 0}
		 * 랜덤숫자 : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * 랜덤숫자 : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		Random rn = new Random();
		int[] check = new int[5];		//중복처리를 위한 도구
		// {0,1,0,0,0}
		//  0 1 2 3 4 =>
		int[] arr = new int[5];			//결과값을 저장할 배열 -->arr 배열 출력 (결과)

		int idx=0; //arr인덱스 (유효한 값이 채워질때에만 증가)
		while(idx < 5) {
			//arr배열에 차곡차곡-> 중복 없이 값(0~4)을 저장
			int rNum = rn.nextInt(5);		//0~4
			
			if(check[rNum] == 0) {//중복확인
				//idx증감식을 조건문 안에 가두기			
				arr[idx]=rNum;
				check[rNum] =1;	//사용처리
				idx++;
			}			
		}
		
		for(int i=0; i <5 ; i++) {
			System.out.println(arr[i]+" ");
		}
//ver.2		
//		int[] check = new int[5];
//		int[] arr = new int[5];
//		
//		for(int i=0; i<5; i++) {
//			int r = rn.nextInt(5);
//			arr[i] = r;
//			if(check[r] == 0) {
//				check[r] = 1;
//			}else {
//				i -= 1;
//			}
//		}
//		for(int i=0; i <5 ; i++) {
//			System.out.println(arr[i]+" ");
//		}
		


	}

}
