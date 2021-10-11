package lv2_review;

public class L2_Ex05 {

	public static void main(String[] args) {		
		
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		int i=0;
		while(i<100) {
			if(i%9==0&&i%10==6) {
				System.out.println(i);
				break;
			}
			i++;
		}
		
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		while(i<100) {
			if(i%9==0&&i/10==6) {
				System.out.println(i);
				break;
			}
			i++;
		}
	
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
//ver1		
		int temp = 0;
		i = 0;
		while (i < 1000) {
			if (i % 8 == 0 && i < 150) {
				temp = i;
			}
			i++;
		}
		System.out.println(temp);
		
//ver2
		i=999;
		while(i>0) {
			if(i%8==0&&i<150) {
				System.out.println(i);
				break;
			}
			i--;
		}
		

	}

}
