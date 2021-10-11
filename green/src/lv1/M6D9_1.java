package lv1;

public class M6D9_1 {

	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int sum = 0;			
		int a = 1;
		while(a <=5) {
			sum +=a;	//왼쪽식은  sum = sum +a				
			a++;			
		}
		
		System.out.println(+sum);
	}

}
