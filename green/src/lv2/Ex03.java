//while문도 작성하기
package lv2;

public class Ex03 {

	public static void main(String[] args) {
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		
		boolean run = true;
		int a = 0;
		while(run) {
			if(a % 9 == 0 && a % 10 ==6) {
				System.out.println(a);
				run = false;
			}			
			a++;
		}		
		
		for(int i=0; i<100; i+=9) {
			int ten = i / 10;
			int one = i % 10;
			if(one == 6) {
				System.out.println(i);
				i = 100;				//one ==6 인 if을 벗어나게하기위해 씀
			}
		}
		
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		
		for(int i=1; i<100; i++) {
			if(i % 9 == 0 && i/10 ==6) {
				System.out.println(i);
				i=100;
			}			
		}
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144		//max값써도 되고 거꾸로 내려가도됌
		int max =0; //for안에 선언하면 계속 초기화하므로  for문 밖에서 선언
		for(int i =0; i<150; i++ ) {
			if(i % 8 ==0 && max < i) {
				max =i;
			} 			
		}System.out.println(max);
	}
}
