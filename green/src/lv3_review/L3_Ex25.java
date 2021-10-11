package lv3_review;

public class L3_Ex25 {

	public static void main(String[] args) {
		/*
		 * ¿¹)
		 * ###
		 * ###
		 * ###
		 */
		
		System.out.println("ver.1");
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		System.out.println();

		System.out.println("ver.2");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
