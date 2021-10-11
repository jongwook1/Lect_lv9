package lv2_review;

public class L2_Ex18 {

	public static void main(String[] args) {
				// for를 사용해서 풀어보세요 
				//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		
				for(int i=0;i<1000;i++) {	
					int a=i%10;
					if(i%9==0&&a==6) {
						System.out.println(i);
						i=9999;
					}
				}
		
		
		
				//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
				for(int i=0;i<1000;i++) {
					if(i%9==0&&i/10==6) {
						System.out.println(i);
						i=9999;
					}
				}	
		
				//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
				int idx=0;
				for(int i=0;i<1000;i++) {
					if(i%8==0&&i<150) {
						idx=i;
					}
				}
				System.out.println(idx);
				
				

	}

}
