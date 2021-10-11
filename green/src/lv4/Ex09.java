package lv4;

public class Ex09 {

	public static void main(String[] args) {
		
		//배열의 주소 개념
		
		
		int[] arr = {87, 100, 24, 11, 79};
//		int[] temp = arr;		//arr 배열이 가진  값(주소)로 값이 초기화  (주소를 공유) (집하나에 문2개 생긴거)
		int[] temp=new int[5];
				
		System.out.println(arr);
		System.out.println(temp);
		
		for(int i=0;i<5;i++) {
			temp[i] = arr[i];
		}
		
		
		temp[1] = 0;
		

		
		//출력
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
		
		
		
		
	}

}
