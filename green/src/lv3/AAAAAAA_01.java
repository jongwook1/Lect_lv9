package lv3;

public class AAAAAAA_01 {

	public static void main(String[] args) {
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3-i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}	
		
		
		System.out.println();
		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < 2 - i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
				
		
		/*
		 * 문제 4)
		 *   #
		 *  ###
		 * #####
		 */
			
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
