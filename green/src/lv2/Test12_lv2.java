package lv2;

public class Test12_lv2 {

	public static void main(String[] args) {
		// 시작 16:00
		// 종료 16:10
		// 소요 10분

		// # 문제 2) 민수네 반 학생은 26명입니다
		// # 민수네반 학생들에게 도화지를 2 장씩 나누어 주려고합니다.
		// # 도화지는 10장씪 묶음으로만 판매하고 10장에 1200원입니다.
		// # 총얼마가 필요한가요?

		int total = 26;
		int bun = 10;
		int divide = 2;
		int td = 1;
		int cash = 0;

		while (total > 0) {

			if (bun == 0) {
				bun = 10;
				td++;
			}
			bun -= divide;
			total--;
		}
		System.out.println("필요한 묶음의 수: " + td);
		cash = td * 1200;
		System.out.println("필요한 현금 : " + cash);

	}

}
