package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex22_no_overlap {

	public static void main(String[] args) {
		/*
		 * #  1 to 4
		 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
		 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
		 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
		 * 예)
		 * 4 2 3 1
		 * 입력 : 3
		 * 4 2 3 9
		 * 입력 : 1
		 * 4 9 3 9
		 * ...
		 */

		int[] arr = new int[4];					//1~4 {4,0,0,0}
		int[] check = new int[4];				//	  {0,0,0,1}
												//	   0 1 2 3 인덱스					
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int gameNum =1;
		int idx=0;
		while (idx<4) {	//arr배열에 차곡차곡 중복없는 값을 저장(1~4)
			int rNum =rn.nextInt(4)+1;					
			if(check[rNum-1]==0) {
				arr[idx] =rNum;
				check[rNum-1]=1;
				idx++;
			}
			
		
		}
		while(true) {
		System.out.print("번호: ");
		for(int i=0; i<4;i++) {
			System.out.print(i+1 +" ");
		}
		System.out.print("\n블럭: ");
		for(int i=0; i<4;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n번호 입력: ");
		int input = sc.nextInt()-1;
		
		if(arr[input]==gameNum) {					//<----이부분혼자풀때 틀렸음 다시보기 input가져오므로 for문으로 가두지않아야함
			System.out.println("딩동댕");
			gameNum++;
		}
		else {
			System.out.println("땡");
		}
		if(gameNum>4) {			//종료
			break;
		}
		
		}
		
		
	}

}
