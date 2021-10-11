package lv2;

public class Test17_lv2 {

	public static void main(String[] args) {
		// # 문제4) 어느도시에 전체 인구가 400000 명인데 나이가 19세 이하 인구는 35퍼센트
		// # 40세 이상인구는 25퍼센트일때
		// # 19세이하인구 - 40세이상인구 수를 구하시요

		double total = 400000;
		double a = 0;
		double b = 0;

		while (a / total < 0.35) {
			a++;
		}
		while (b / total < 0.25) {
			b++;
		}
		System.out.println("19세이하의 인구수: " + a);
		System.out.println("40세 이상인구수: " + b);
		System.out.println("19세이하인구수-40세이상인구수: " + (a - b));

	}

}
