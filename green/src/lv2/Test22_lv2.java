package lv2;

public class Test22_lv2 {

	public static void main(String[] args) {
		//시작 21:25
		//종료 21:30
		//소요 5분
		
		
		// # 문제1) 7의 배수를 차례대로 출력했을대 8번째 배수를 출력
		boolean run = true;
		int a=1;
		int cnt =0;
		
		while(true) {
			if(a % 7 ==0) {
				System.out.println("7의 배수"+a);
				cnt++;
				if(cnt==8) {
					break;
				}
			}
			a++;
		}System.out.println("7의 배수를 차례대로 출력했을대 8번째 배수를 출력" + a);	

	}

}
