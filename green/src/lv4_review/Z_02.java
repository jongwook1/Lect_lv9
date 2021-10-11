package lv4_review;

import java.util.Scanner;

public class Z_02 {

	public static void main(String[] args) {
		//시작 12:40
		//종료 13:00
		//소요 00:20
		
		
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
		Scanner sc=new Scanner(System.in);
		
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400

		for (int i = 0; i < pay.length; i++) {
			int sum = 0;
			for (int j = 0; j < pay.length; j++) {
				sum += pay[i][j];
			}
			System.out.print(sum + " ");
		}

		System.out.println();
		// 문제 2) 호를 입력하면 관리비 출력
		// 예 2) 입력 : 202 관리비 출력 : 2000
		System.out.println("호수 입력해주세요");
		int inN = sc.nextInt();
		int idx1 = -1;
		int idx2 = -1;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt.length; j++) {
				if (apt[i][j] == inN) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println(pay[idx1][idx2]);

		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int max = pay[0][0];
		int min = pay[0][0];

		idx1 = -1;
		idx2 = -1;
		int idx3 = -1;
		int idx4 = -1;
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay.length; j++) {
				if (max < pay[i][j]) {
					max = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
				if (min > pay[i][j]) {
					min = pay[i][j];
					idx3 = i;
					idx4 = j;
				}
			}
		}
		System.out.println(apt[idx1][idx2]);
		System.out.println(apt[idx3][idx4]);
		// 문제 4) 호 2개를 입력하면 관리비 교체

		System.out.println("1)호수입력");
		int n1 = sc.nextInt();
		System.out.println("2)호수입력");
		int n2 = sc.nextInt();
		idx1 = -1;
		idx2 = -1;
		idx3 = -1;
		idx4 = -1;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt.length; j++) {
				if (apt[i][j] == n1) {
					idx1 = i;
					idx2 = j;
				} else if (apt[i][j] == n2) {
					idx3 = i;
					idx4 = j;
				}
			}
		}
		int temp = pay[idx1][idx2];
		pay[idx1][idx2] = pay[idx3][idx4];
		pay[idx3][idx4] = temp;

		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt.length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}

	}

}
