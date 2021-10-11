package lv2;

public class Test10_lv2 {

	public static void main(String[] args) {
		// 시작 15:45
		// 종료 16:00
		// 소요 15분
		// # 문제4)
		// # 귤 6개의 무게는 840g, 사과 3개의 무게는 750g 입니다.
		// # 귤5개와 사과 4개의 무게는 몇g인지 출력 (단 각각의 귤끼리 무게는 같고 각각의 사과끼리는 무게가같다)

		int sumg = 0;
		int gg = 840 / 6; // 140
		int ag = 750 / 3; // 250

		int g = 5;
		int a = 4;

		while (g >= 0 && a >= 0) {

			// System.out.println("g"+g);
			// System.out.println("a"+a);
			if (g == 0) {
				sumg += ag;
			}
			if (a == 0) {
				sumg += gg;
			} else {
				sumg += (gg + ag);
			}
			//System.out.println(sumg);

			g--;
			a--;

		}
		System.out.println("귤5개와 사과4개의 무게:" +sumg+"g");

	}
}
