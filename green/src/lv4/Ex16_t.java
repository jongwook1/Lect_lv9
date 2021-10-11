package lv4;

import java.util.Scanner;

public class Ex16_t {

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
	
		for(int i=0;i<3;i++) {
			int sum =0;
			for(int j=0;j<3;j++) {
				sum+= pay[i][j];
			}
			System.out.printf("%d층 %d원\n", i+1, sum);
		}
		
				
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.println("호수입력: ");
		int door =sc.nextInt();
		int a=-1;
		int b=-1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(apt[i][j]==door) {
					a=i;
					b=j;
				}
			}
		}
		System.out.println(pay[a][b]+ "원");
		
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		a=0;
		b=0;
		int max=pay[a][b];
		int c=0;
		int d=0;
		int min= pay[c][d];			// 비교할대상중 임의값하나
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(max<pay[i][j]) {
					max=pay[i][j];
					a=i;
					b=j;
				}
				if(min>pay[i][j]) {
						min=pay[i][j];
						c=i;
						d=j;
					}
			}

		}
		System.out.println(apt[a][b]);
		System.out.println(apt[c][d]);
		// 문제 4) 호 2개를 입력하면 관리비 교체
	
		a=-1;
		b=-1;
		c=-1;
		d=-1;
		
		System.out.println("호수1: ");
		door=sc.nextInt();
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
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(pay[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
