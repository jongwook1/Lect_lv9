package lv3;

public class Test06_lv3 {

	public static void main(String[] args) {
		// 시작 09:26
		// 종료 10:00
		// 소요 35분				
		
		// for를 사용해서 풀어보세요
		// 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
		int cnt=0;
		for(int i=50;i<=100;i++) {
			if(i%9==0) {
				cnt++;
			}
		}
		System.out.println("9의배수의개수: " +cnt);
		
		
		// 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		int max=0;
		for(int i=0;i<1000;i+=28) {
			if(max<i) {
				max=i;
			}
		}System.out.println("28의 배수중 가장큰 세자리"+max);
		
		
		// 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32		
		System.out.println("8의 배수중 작은수부터5개: ");
		int cnt1 = 0;
		for (int i = 0; i < 100; i += 8) {
			cnt1++;
			if (cnt1 <= 5) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
	}

}
