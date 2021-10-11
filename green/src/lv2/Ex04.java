package lv2;

public class Ex04 {

	public static void main(String[] args) {
		//보조제어문 : break, continue
		//ㄴ break : 자신이 속한 반복문을 즉시 종료시킴
		//ㄴ continue : 자신이 속한 반복문의 처음(키워드)으로 돌아감
		int n = 1;
		
		while(true) {
			System.out.println(1);
			while(true) {
				System.out.println(2);
				if(n == 10) {
					continue;		// 이하의 모든 구문을 무시
				}
				break;				
			}
			System.out.println(3);
			n++;
		}		

	}

}
