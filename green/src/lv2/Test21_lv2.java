package lv2;

public class Test21_lv2 {

	public static void main(String[] args) {
			//시작 21:05
			//종료 21:07
			//소요시간 2분
		
		
			//# 문제4) 50 부터 100 까지의 자연수중에서 9의 배수는 모두 몇개?
		
		int a = 100;
		int cnt =0;
		while(a >= 50) {
			if(a % 9 ==0) {
				//System.out.println("9의 배수" + a);
				cnt++;
			}				
			a--;	
		}System.out.println("50~100까지 자연수중 9의 배수의 수: " + cnt);
		
		
		
	}

}
