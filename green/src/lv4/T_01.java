package lv4;

public class T_01 {

	public static void main(String[] args) {
		/*
		 * ���� 1)
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
		 * ���� 2)
		 * ###
		 * ##
		 * #
		 */
		for(int i=0;i<3;i++) {
			for(int j=i;j<3;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 * ���� 3)
		 * @##
		 * @@#
		 * @@@
		 */
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("@");
			}
			
			for(int j=0;j<2-i;j++) {
				System.out.print("#");
			}
			System.out.println();
			
			}
			
		System.out.println();
		/*
		 * ���� 4)
		 *   #
		 *  ###
		 * #####
		 */
		for(int i=0;i<3;i++) {
			for(int j=0;j<2-i;j++) {
				System.out.print(" ");
			}for(int j=0;j<i*2+1;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	
	}

}
