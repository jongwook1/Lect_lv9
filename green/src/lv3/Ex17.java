package lv3;

public class Ex17 {

	public static void main(String[] args) {
		int arr[] = {
				0,0,0,
				0,0,0,
				3,3,3
		};
		//문제1) 배열을 위와 같이3줄씩 출력
		
		
		for (int i = 0; i < 9; i++) {
			System.out.print(arr[i]);
			if (i % 3 == 2) {
				System.out.println();
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if(arr[i]==3) {
				System.out.print("■");
			}else {
				System.out.print("□");
			}if(i%3==2) {
				System.out.println();
			}
			
		}
		
		
		
		
	}
}
