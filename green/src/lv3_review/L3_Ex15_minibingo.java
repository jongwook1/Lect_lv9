package lv3_review;

public class L3_Ex15_minibingo {

	public static void main(String[] args) {
		int arr[] = {
				0,0,0,
				0,0,0,
				3,3,3
		};

		//문제1) 배열을 위와 같이3줄씩 출력

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i%3==2) {
			System.out.println();
			}
		}
		
	}

}
