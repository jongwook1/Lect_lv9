package lv4;

import java.util.Scanner;

public class Ex16q {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		int[] garo = new int[3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				garo[i]+=pay[i][j];
			}
			
		}
		for(int i=0;i<3;i++) {
			System.out.print(garo[i]+" ");
		}
					
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.println("\n호수를 입력하세요");
		int ad=sc.nextInt();
		
		int idx1 = -1;
		int idx2 = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ad) {
					idx1 = i;
					idx2 = j;
				}

			}
		}
		for (int i = 0; i < 1; i++) {		//필요없음		있어야출력되는거아닌가?물어보기
			for (int j = 0; j < 1; j++) {	//필요없음		있어야출력되는거아닌가?물어보기
				System.out.println(pay[idx1][idx2]+"원");				
			}
		}
				
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int max=0;
		idx1 = -1;
		idx2 = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
					if(max<pay[i][j]) {
						max=pay[i][j];
						idx1=i;
						idx2=j;
					}
			}
		}
		for (int i = 0; i < 1; i++) {			//필요없음
			for (int j = 0; j < 1; j++) {		//필요없음
				System.out.println(apt[idx1][idx2]);				
			}
		}
		
		int min=2100;
		idx1 = -1;
		idx2 = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
					if(min>pay[i][j]) {
						min=pay[i][j];
						idx1=i;
						idx2=j;
						
					}
			}
		}
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println(apt[idx1][idx2]);				
			}
		}
						
		// 문제 4) 호 2개를 입력하면 관리비 교체
		int a=-1;
		int b=-1;
		int c=-1;
		int d=-1;
		
		System.out.println("호수1: ");
		int door=sc.nextInt();
		System.out.println("호수2: ");
		int door2=sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(apt[i][j]==door) {
					a=i;
					b=j;
				}
				if(apt[i][j]==door2) {
					c=i;
					d=j;
				}
			}
		}
		int temp=pay[a][b];
		pay[a][b]=pay[c][d];
		pay[c][d]=temp;
		
		for(int i=0;i<3;i++) {			//여기선 왜씀?
			for(int j=0; j<3;j++) {		// 왜씀? 안써도 출력되는거아닌가 위에처럼?
				System.out.print(pay[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
