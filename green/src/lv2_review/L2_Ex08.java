package lv2_review;

public class L2_Ex08 {

	public static void main(String[] args) {
		/*
		 * # 369게임[2단계]
		 * 1. 1~50까지 반복을 한다.
		 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
		 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
		 */

		int i=1;
				
		while(i<=50) {
			int a=i%10;
			int b=i/10;
			int cnt=0;
			if(a==3||a==6||a==9) {		
				cnt++;
			}
			if(b==3||b==6||b==9) {
				cnt++;
			}
			if(cnt==1) {
				System.out.println("짝");
			}else if(cnt==2){
				System.out.println("짝짝");
			}else {
				System.out.println(i);
			}
			
			i++;
		}
		
	}

}
