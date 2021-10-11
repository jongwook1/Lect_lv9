package lv4;

public class Lv4_test00 {

	public static void main(String[] args) {
		/*
		 * # 2차원 반복문
		 * 1   2  3  4  5
		 * 10  9  8  7  6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 21 22 23 24 25
		 */
	
		for (int i = 0; i < 2; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 5; j++) {
					System.out.print(j + " ");

				}
			} else {
				for (int j = 10; j > 5; j--) {
					System.out.print(j + " ");
					
				}
			}
			System.out.println();

		}
		for (int i = 0; i < 2; i++) {
			if (i % 2 == 0) {
				for (int j = 11; j <= 15; j++) {
					System.out.print(j + " ");
				}
			} else {
				for (int j = 20; j > 15; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		for (int i = 21; i <= 25; i++) {
			System.out.print(i + " ");
		}
		
	}

}
