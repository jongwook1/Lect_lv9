package lv2;
/**/
public class Ex02 {
public static void main(String[] args) {
	// 문제 1) 1부터 5까지 출력
			// 정답 1) 1, 2, 3, 4, 5
	
 //  int a = 1;
//	while(a <= 5) {
//		System.out.println(a);
//		a++;		
//	}
	
//	for(int aa = 1 ; aa <= 5; aa++) {
//		System.out.println(aa);
//	}
	
	
			// 문제 2) 1부터 10까지 반복해, 5~9까지 출력         <---for 못품(품)
			// 정답 2) 5, 6, 7, 8, 9
	
//	int b = 1;
//	while(b <= 10) {
//		if(b>=5 && b<=9) {
//			System.out.println(b);
//			}
//		b++;
//	}
	
	
//	for(int bb = 1; bb<=10 ; bb++) {
//		if(bb<=9 && bb>=5) {											------요부분을 생각못했음
//		System.out.println(bb);}
//	}
	
	
			// 문제 3) 1부터 10까지 반복해 6~3까지 출력	        <-----이건 while도 못품
			// 정답 3) 6, 5, 4, 3
	
	int c = 10;
	
	while(c >= 10) {
		if(c <=6 && c >=3) {
			System.out.println(c);
		}
		
		c--;
	}
	
	
	for(int cc =10; 10>=1; cc--) {
		if(cc <= 6 && cc >= 3)
			System.out.println(cc);
	}
	
	
	
			// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력         <-------for못
			// 정답 4) 1, 2, 7, 8, 9, 10

	
	 
	
	
}
}
