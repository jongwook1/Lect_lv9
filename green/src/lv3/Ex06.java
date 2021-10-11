package lv3;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		
		Scanner sc= new Scanner(System.in);
		
	while(true) {
		System.out.println("학번입력:");
		int num =sc.nextInt();
			
			boolean check = false;
			int index =-1;
			//검사 ( hakbuns 배열에 존재하는가)
			for(int i=0; i<5; i++) {
				if(hakbuns[i] == num) {
					//?     i기억
					check =true;
					index= i;					
				}
			}
			if(check == true) {// out bound 오류 출력됨 // 중단위험
			//check 변수 활용 -> 결과값 도출
			System.out.println(scores[index]+"점");
			break;
			}
			else {
				System.out.println("유요한 학번 입력하세요!!");
			}
			
		}
	// 문제) 1등학생의 학번과 성적 출력
	// 정답) 1004번(98점)
	
	int max =0;
	int idx1 = -1;
	
	for(int i=0; i<5; i++) {
		if(scores[i] > max) {
			max = scores[i];	//max 값 갱신
			idx1 = i;
		}
	}
	System.out.println("1등 학생은 " + hakbuns[idx1]+"번 ");
	System.out.println("max : "+ max);
	
	
	

	}

}
