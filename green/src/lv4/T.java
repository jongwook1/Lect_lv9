package lv4;
import java.util.Random;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// ���� 14:00
		// ���� 00:00
		// �ҿ� 00:00
				
		/*
		 * ���� 1)
		 * #
		 * ##
		 * ###
		 */
		System.out.println("����1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("����2");
		/*
		 * ���� 2)
		 * ###						//i0j0 i0j1 i0j2
		 * ##						//i0j0 i0j1
		 * #						//i0j0
		 */

		for(int i=0;i<3;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	


		System.out.println("����3");
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
	
	
	
	System.out.println("����4");
		/*
		 * ���� 4)
		 *   #					//11#
		 *  ###					//1###
		 * #####				//#####
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("#");
			}
			System.out.println();

		}
		
	}

}
