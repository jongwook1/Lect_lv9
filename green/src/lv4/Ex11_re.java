package lv4;

public class Ex11_re {

	public static void main(String[] args) {
		/*
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		위 배열에서 똑같은 숫자의 개수가 가장 적은 숫자와 가장 많은 숫자 의  개수를  출력 
		예) 개수가 가장적은숫자 ==> 100
		예) 개수가 가장많은숫자 ==> 3
		가장 많은 갯수 출력 : 3 ===> 5개 
		가장 적은 갯수 출력 : 100 ===> 1개
	 */
		
		 int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		
		 int max=0;
		 int maxN=0;
		 
		 int min=a.length;
		 int minN=0;
		 
		 
		 for(int i=0;i<a.length;i++) {
			 int cnt=0;
			 for(int j=0;j<a.length;j++) {
				 if(a[i]==a[j]) {
					 cnt++;
				 }
			 }
			 if(cnt>max) {
				 max=cnt;
				 maxN=a[i];
			 }
			 if(cnt<min) {
		 		 min=cnt;
		 		 minN=a[i];
		 	 }
		 }
		 	 
		 System.out.println("가장많은수: "+maxN+"    "+max+"개");
		 System.out.println("가장적은수: "+minN+"    "+min+"개");

	}

}
