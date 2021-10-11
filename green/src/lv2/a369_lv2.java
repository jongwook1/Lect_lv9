package lv2;

public class a369_lv2 {

	public static void main(String[] args) {
		/*
		 * # 369게임[2단계]
		 * 1. 1~50까지 반복을 한다.
		 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
		 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
		 */

		int a = 1;
		
		while(a<=50) {
			
			int ten = a / 10;
			int one = a % 10;
			int clap = 0;
			
			if(ten % 3 == 0 && ten != 0 ) {			
			clap++;
			}
			if(one % 3 == 0 && one != 0) {
			clap++;
			}
			
			if(clap == 0) {
				System.out.println(a);
			}
			else if (clap == 1) {
				System.out.println("짝");
			}
			else if(clap ==2) {
				System.out.println("짝짝");
			}
			a++;
		}

	}

}
