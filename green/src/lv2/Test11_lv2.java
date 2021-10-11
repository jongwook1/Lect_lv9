package lv2;

public class Test11_lv2 {

	public static void main(String[] args) {
		// 문제 1) 마트에서 오이를 3개씩 묶어서 1500원에 판다고 한다
		// # 오이가 14개 필요하다. 돈이 얼마필요한가(오이는 묶음으로만 판다)

		int oi = 14;
		int bun = 3;
		int price = 1500;

		int cash = 0;

		while (oi > 0) {
			oi -= bun;
			cash += price;
		}
		System.out.println("엄마가 " + cash + "원 주셨다");
	}
}
