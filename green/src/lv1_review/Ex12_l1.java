package lv1_review;

import java.util.Scanner;

public class Ex12_l1 {

	public static void main(String[] args) {
		/*
		 * # 놀이기구 이용제한
		 * 1. 키를 입력받는다.
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
		 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
		 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("부모님과 함께오셨나요?(yes:1, no:0)");
		int sel=sc.nextInt();
		
		if (sel == 0) {
			System.out.println("키를입력해주세여");
			int h = sc.nextInt();
			if (h >= 120) {
				System.out.println("놀이기구 이용가능");
			} else if (h < 120) {
				System.out.println("놀이기구 이용불가!");
			}
		}else if(sel==1) {
			System.out.println("놀이기구 이용가능");
		}
			
		
	}

}
