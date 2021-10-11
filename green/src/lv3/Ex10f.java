package lv3;

import java.util.Scanner;

public class Ex10f {

	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// 예) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc= new Scanner(System.in);
		System.out.println("값입력:");
		int data =sc.nextInt();
		int bIdx =0;	//인덱스 분리
		for(int i=0;i<5;i++) {	//a배열 순환
			if(a[i] !=data) {
				b[bIdx] = a[i];
				bIdx ++;
			}
		}
		for(int i=0;i<5;i++) System.out.println(b[i]+ " ");
			
		
		
		
/*		System.out.println("값을 입력해주세요");		
		int n=sc.nextInt();
		int bidx=0;
		for(int i=0;i<5;i++) {
			if(a[i]!=n) {
				b[bidx]=a[i];
				//System.out.println("a의값"+a[i]);
				bidx++;
			}
		}for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
*/		
		
		
		System.out.println("2번문제");
		
		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
//		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};		//1002입력하면 65도 같이빠짐
		
		System.out.println("학번 또는 점수 입력 ");
		data=sc.nextInt();
		
		int delIdx =-1;	//학번 기준
		for(int i=0;i<6;i++) {
			if(data ==c[i]) {	//인덱스 i값에 대한 홀짝		->식별 가능
				//학번
				if(i % 2 == 0) {
					//i, i+1
					delIdx =i;
				}
				//점수
				else if(i%2==1){
					//i, i-1
					delIdx = i-1;
				}				
			}
		}		
		//처리
		int dIdx =0;
		for(int i=0;i<6;i+=2) {		//학번기준으로 할때 학번기준값 가져오기		
			if(i != delIdx) {
				d[dIdx] = c[i];	//학번
				d[dIdx+1] = c[i+1];//점수				///////////+1하는 이유는 윗쪽점수인덱스에서 -1했기때문??????????
				dIdx +=2;			//기준인덱스가 2씩 뛰므로
			}
		}
		//출력
		for(int i=0;i<6;i++) {
			System.out.println(d[i]);
		}
		
//	ver.2	
//		int input2 = sc.nextInt();
//		int dindex = 0;
//		for(int i = 0; i < 6; i+=2) {
//			if(c[i] != input2) {
//				d[dindex] = c[i];
//				d[dindex + 1] = c[i+1];
//				dindex += 2;
//			}
//		}
//		
//		for(int i = 0; i < 6; i++) {
//			System.out.println(d[i]);
//		}
		
		
		
		
		
		
		
		
		
//		System.out.println("값을 입력해주세요");		
//		int n1=sc.nextInt();
//		int didx=0;
//		for(int i=0;i<5;i++) {
//			if(c[i]!=n1) {
//				if(i+1)
//				d[didx]=c[i];
//						didx++;
//			}
//		}for(int i=0;i<5;i++) {
//			System.out.println(d[i]);
//		}
	
		
		

	}

}
