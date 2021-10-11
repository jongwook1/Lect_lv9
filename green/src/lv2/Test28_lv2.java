package lv2;

public class Test28_lv2 {

	public static void main(String[] args) {
//		시작 22:30
//		종료 22:35
//		소요 5분		
////	# 문제3) 가로가 12 이고 세로가 8인 직사각형모양의 종이를 늘어놓아
////	# 만들수있는 가장작은 정사각형을 만들려고한다. 직사각형은몇장이 필요한가?

		int x = 12;
		int y = 8;
		int a = 1;
		boolean run = true;
		while (run) {
			if (a % x == 0 && a % y == 0) {
				System.out.println("직사각형은 " + a + "장 필요");
				run = false;
			}
			a++;
		}
	}
}
