package lv2;

public class Test26_lv2 {

	public static void main(String[] args) {
		// 시작 22:00
		// 종료 22:03
		// 소요 3분

//	#문제 1) 8 과 12 의 최소 공배수를 구하시요
//	# 최소 공배수란 각 수의 배수를 나열한다음 처음으로 같은숫자를 말한다.
//	# 예) 8 16 24... 
//	# 예) 12 24....
//	# 여기서 24가 최소공배수이다.
		boolean run = true;
		int a = 1;

		System.out.println(a);
		while (run) {
			if (a % 8 == 0 && a % 12 == 0) {
				System.out.println("8 과 12 의 최소 공배수: " + a);
				run = false;
			}
			a++;
		}

	}

}
