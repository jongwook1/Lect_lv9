package lv4;

public class Test_Dachawonbanbok {

	public static void main(String[] args) {
		/*
		 * # 2차원 반복문
		 * 1   2  3  4  5
		 * 10  9  8  7  6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 21 22 23 24 25
		 */
		int start = 1;
		int end = 5;
		
		for(int i=0; i<5; i++) {
			if(i % 2 == 0) {
				for(int j=start; j<=end; j++) {
					System.out.print(j + "\t");
				}
			}else {
				for(int j=end; j>=start; j--) {
					System.out.print(j + "\t");
				}
			}
			System.out.println();

			start = end + 1;
			end = end + 5;
		}
		

	}

}
