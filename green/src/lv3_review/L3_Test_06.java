package lv3_review;

import java.util.Random;

public class L3_Test_06 {

	public static void main(String[] args) {
		
		
		// for를 사용해서 풀어보세요
		// 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
		
		
		int cnt=0;
		for(int i=50;i<=100;i++) {
			if(i%9==0) {				
				cnt++;
			}			
		}
		System.out.println("50에서 100까지중에서 9의 배수의개수: " +cnt);
		
		// 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		int max=0;
		for(int i=0;i<1000;i++) {
			if(i%28==0) {
				if(i>max) {
					max=i;
				}
			}
		}
		System.out.println("28의 배수 중에서 가장 큰 세자리 수: "+max);
					
		
		// 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		int cnt2=0;
		int idx=-1;
		for(int i=0;i<100;i++) {
			if(i%8==0) {
				cnt2++;
				System.out.print(i);
				if(cnt2==5) {
					break;
				}
			}
			
		}
		
		
	}

}
