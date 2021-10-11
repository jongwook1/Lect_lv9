package lv1;

import java.util.Scanner;

public class Test4_lv1 {

	public static void main(String[] args) {
		// 직접구현 1. 놀이기구 
		// 시작 09:12
		// 종료 09:20
		// 소요 8분 00
		
			
		
		/*
		 * # 놀이기구 이용제한
		 * 1. 키를 입력받는다.
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
		 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
		 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력해주세요");
		int h = sc.nextInt();
		
		if(h >= 120) {
			System.out.println("놀이기구 사용가능!");
		}else if(h < 120){
			System.out.println("부모님과 오셨나요? 같이왔으면 1번 안왔으면 2번");
			int y = sc.nextInt();
			
			if(y == 1) {
				System.out.println("놀이기구 사용가능!");
			}else if (y == 0) {
				System.out.println("부모님과오면 사용할수있어요!");
			}			
		}		
		
	}

}
