package lv3;

public class Ex18 {

	public static void main(String[] args) {
		int arr[] = {
				0,3,3,
				3,3,0,
				3,3,3
		};
		//문제2) 만약에 가로에 3이 연속으로 3개있으면 "빙고" 출력
		//가로 검사문
		//[0] 1 2
		//[3] 4 5
		//[6] 7 8
		
		//ver 1
		for(int i=0;i<9;i+=3) {
			int cnt=0;
			if(arr[i] ==3 && arr[i+1]==3 && arr[i+2]==3) {
				cnt++;
			}
			if(cnt==1) {
				System.out.println("빙고");
			}
		}
		
		//ver2.심화버전
		for(int i=0;i<9;i+=3) {		//i : 0         3      6
			int cnt=0;
			for(int j=0;j<3;j++) {
				if(arr[i+j]==3) {	//i+j: 0 1 2 /3 4 5/6 7 8 
					cnt++;
				}
			}
			if(cnt ==3) {
				System.out.println("빙고");
			}
		}
		
		
		
		
		
//		for(int i=0;i<9;i++) {
//			System.out.print(arr[i]);
//			if(i%3==2) {
//			System.out.println();
//			}if(i%3==2&&arr[i]==3) {
//				if(arr[i]>2)
//				System.out.println("빙고");
//			}
//		}	
		
		

	}

}
