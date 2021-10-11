package lv3_review;

public class L3_Test_08 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};	
		int b[] = new int[5];
		
		// arr의 값중 4의 배수만 b에 거꾸로저장
		// 예) b = {0,0,0,40,20};
		int idx=3;
		for(int i=4;i>0;i--) {
			if(arr[i]%4==0) {
				b[idx]=arr[i];
				idx++;
			}			
		}
		for(int i=0;i<5;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
