package lv3;

public class Test08_lv3 {

	public static void main(String[] args) {
		// 시작 11:30
		// 종료 11:45
		// 소요 15분		
		
		int arr[] = {10,20,30,40,50};	
		int b[] = new int[5];
		// arr의 값중 4의 배수만 b에 거꾸로저장
		// 예) b = {0,0,0,40,20};
		
		int idx=3;
		for(int i=0;i<5;i++) {
			if(arr[i]%4==0) {
				b[idx]=arr[i];
				idx++;
			}
		}
		int temp=b[3];
		b[3]=b[4];
		b[4]=temp;
		for(int i=0;i<5;i++) {
			System.out.print(b[i]+" ");
		}

	}

}
