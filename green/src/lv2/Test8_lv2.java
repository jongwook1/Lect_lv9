package lv2;

public class Test8_lv2 {

	public static void main(String[] args) {
		// 시작 14:15
		// 종료 14:35
		// 소요 20분

		// # 문제2)
		// # 연필 7타를 여학생 2명과 남학생 4명에게 남김없이 똑같이 나누어 주었을때
		// # 한사람은 연필을 몇 자루 가지게 되는 지 출력 (연필 1타는 12자루)
		// # 힌트 ) 7 * 12 / 6

		int total = 7 * 12;
		int girl = 2;
		int boy = 4;
		int cnt = 0;
		while (total > 0) {
			while (boy + girl > 0) {
				if (boy > 0) {
					boy--;
				} else if (girl > 0) {
					girl--;
				}
				total--;
			}
			
			// System.out.println(total);
			cnt++;
			girl = 2;
			boy = 4;
		}
		System.out.println("한사람당 가지는 연필개수 : " + cnt);
	}
}
