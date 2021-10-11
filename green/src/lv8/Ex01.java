package lv8;
//ArrayList를 활용한 컨트롤러 구현

import java.util.ArrayList;
import java.util.Scanner;

//class Integer{
//	
//	
//	
//}

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 1.추가 2.삭제 3.삽입 4.종료 //삭제(인덱스) 삭제(값) 수정도 추가하기
			System.out.println(arr);
			System.out.println("1.추가 2. 삭제(인덱스)  3. 삭제(값)  4. 삽입 5. 수정 6. 종료");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("추가할 값을 입력하세요");
				Integer num = sc.nextInt();
				arr.add(num);

			} else if (sel == 2) {
				System.out.println("삭제할 인덱스 입력해주세요");
				Integer index = sc.nextInt();
//				arr.add(index, num);
			} else if (sel == 3) {
				System.out.println("삭제할 값을 입력해주세요");
				Integer delData = sc.nextInt();
				arr.remove(delData);
			} else if (sel == 4) {
				System.out.println("삽입할 위치를 입력해주세요");
				Integer addIdx = sc.nextInt();
				System.out.println("삽입할 값을 입력해주세요");
				Integer addData = sc.nextInt();
				arr.add(addIdx, addData);
			} else if (sel == 5) {
				System.out.println("수정할 위치를 입력해주세요");
				Integer setIdx = sc.nextInt();
				System.out.println("수정할 값을 입력해주세요");
				Integer setData = sc.nextInt();
				arr.set(setIdx, setData);
			} else if (sel == 6) {
				System.out.println("종료하겠습니다");
				break;
			}

		}

	}

}
