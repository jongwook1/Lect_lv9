package lv1;

public class M6d10_2 {

	public static void main(String[] args) {
		/*
		// * # 369게임[2단계]
		//* 1. 1~50까지 반복을 한다.
	//	 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
	//	 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...33 짝짝 36 짝짝..
		 */
		
		int a = 1;
		int b = 0;
		while(a < 50) {
			if(a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				
				System.out.println("짝");
				if(a / 10 == 3) {
					System.out.println("짝짝");
				}	
				
			}else {
			System.out.println(a);
			}
			
			
			a++;
		}
		
		
	}

}
