package lv2_review;

public class L2_Ex06 {

	public static void main(String[] args) {
		
		// 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
		int cnt = 0;
		int i = 50;
		while (i <= 100) {
			if (i % 9 == 0) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);

		// 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		i = 0;
		int cnt1 = 0;
		while (i < 1000) {
			if (i % 28 == 0) {
				cnt1 = i;
			}
			i++;
		}
		System.out.println(cnt1);

		// 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		i = 0;
		int cnt3 = 0;
		while (i < 100) {
			if (i % 8 == 0) {
				System.out.print(i + " ");
				cnt3++;
			}

			if (cnt3 >= 5) {
				break;
			}
			i++;
		}

	}

}
