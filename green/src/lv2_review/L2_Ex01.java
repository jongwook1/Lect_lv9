package lv2_review;

public class L2_Ex01 {

	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int i=1;
		int sum=0;
		while(i<=5) {
			sum+=i;
			i++;
		}
		System.out.println("1~5까지으 합: "+sum);
		
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		i=1;
		sum=0;
		int cnt=0;
		while(i<=10) {
			if(i<3||i>=7) {
				System.out.print(i+" ");
				sum+=i;
				cnt++;
			}
			i++;
		}
		
System.out.println();
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
System.out.println(" 문제2의 조건에 맞는 수들의 합:  "+sum);

		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
System.out.println("문제2의 조건에 맞는 수들의 개수:  "+cnt);

	}

}
