package lv3;

public class Ex29 {

	public static void main(String[] args) {		//사각형먼저그리기
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		for(int i=0;i<3;i++) {
			//System.out.print("i"+i);
			for(int j=0;j<3;j++) {
				System.out.print("#");
				
			}System.out.println(" ");
		}
		
		
		
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		System.out.println();
		for(int i=0; i<3; i++) {			// i : 0   1    2
			for(int j=0; j<=i; j++) {		// j : 0 /0 1 /0 1 2
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
		for(int i=0;i<3;i++) {		// i :   0  1   2
									// j :  3번/2번/ 1번
			for(int j=0;j<3-i;j++) {
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
		for(int i=0;i<3;i++) {				//i:   0    	1   		 2
			for(int j=0;j<=i;j++) {			//j:   0 	 / 0 1		 /0 1 2
				System.out.print("@");
			}
			for(int j=0; j<2-i;j++) {		// j: 0   1  / 0 			 /X       
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
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<2-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
