package lv4;

public class Ex12 {

	public static void main(String[] args) {
		// 배열 : (같은 자료형의) 여러개의 값을 저장 할수있는것
		//2차원 배열 : 또 다른 배열을 값으로 갖는것

		//선언
		// 자로형 배열명[];
		
		// 초기화
		// = {} ;
		// = new 자료형[개수]
		
		//2차원 배열의 선언
		// 자료형 배열명[][];	// 자료형[][] 배열명;
		
		//2차원 배열의 초기화
		//={{},{},{}};
		// = new 자료형[개수][개수];
		
		int arr[][]= {{1,2},{3,4},{5,6}};
		//				0	  1		2
		//			   0 1	 0 1   0 1	
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//사용
		//배열명[외부인덱스][내부인덱스]
		
		System.out.println(arr[0][0]);
		
		//2차원 반복문을 사용해서 -> arr배열의 전체값(1~6까지)을 출력
		for(int i=0; i<3;i++) {				//i-외부인덱스
			for(int j=0;j<2;j++) {			//j-내부인덱스
				System.out.print(arr[i][j]+" ");
			}
		}
		
		int datas[][] =new int[3][2];			//{{0,0},{0,0},{0,0}}
		//										   00 01  10 11 20 21	  
		
		//2차원 반복문을 사용해서-> datas 배열의 전체값을 1부터6까지 초기화
												//{{1,2},{3,4},{5,6}}
		
		
		int n=1;
		for(int i=0;i<3;i++) {			
			for(int j=0;j<2;j++) {
				datas[i][j]=n;
				n++;
				System.out.print(datas[i][j]+" ");
			}
		}
		
		
	}

}
