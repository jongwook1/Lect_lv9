package lv4;

public class Ex15_t_garo_sero_sum {

	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},								
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
		//		ij    ij    ij   ij
		//      00    01    02   03
		//      10    11    12   13
		//      20    21    22   23		
		
		
			int[] garo = new int[3];		//{0,0,0}
			int[] sero = new int[4];		//{0,0,0,0}
			
			for(int i=0; i<3;i++) {			//i:행
				for(int j=0;j<4;j++) {		//j:열
					garo[i]+=arr[i][j];
					sero[j]+=arr[i][j];
				}
			}
			
			
			
			
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
			for(int i=0; i<3;i++) {
				System.out.print(garo[i]+" ");
			}
			System.out.println();
			
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612

			for(int i=0; i<4;i++) {
				System.out.print(sero[i]+" ");
			}
			System.out.println();

	}

}
