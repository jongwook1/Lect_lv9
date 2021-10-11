package lv2;


public class Test9_lv2 {

	public static void main(String[] args) {
		//

		// # 문제3)
		// # 어느 공장에서 한사람이 1시간에 컴퓨터를 4대를 조립할수 있다고한다.
		// # 3명이 컴퓨터 96대를 조립혀면 몇시간이 걸리는가

		int com = 96;
		int p = 4;
		int h = 0;
		int people=3;
		while (com > 0) {
			com -= p;
			h++;
		}
		System.out.println("걸린시간" + h/people);
	}
}
