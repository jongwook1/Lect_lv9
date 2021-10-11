package lv1;



public class Ex28 {
public static void main(String[] args) {
	/*
	 * # 369게임[2단계]
	 * 1. 1~50까지 반복을 한다.
	 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
	 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...33 짝짝 36 짝짝..
	 */
	
	int n = 1;
	
	
	while(n <= 50) {
		int ten = n / 10;
		int one = n % 10;
		
		
		int clap = 0;
		if(ten % 3 == 0 && ten !=0) {
			clap  ++;
		}
		if(one % 3 == 0 && one !=0) {
			clap  ++;
		}
		
		
		if(clap == 0) {
			System.out.println(n);
		}
		else {
			while(clap > 0) {
				System.out.print("짝");
				clap--;
			}
			System.out.println();// 줄바꿈
		}
		n++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	int n = 1;
	
	while(n < 51) {
		if((n > 30 && n <40) && (n % 10 == 3 ||n % 10 == 6  || n % 10 == 9)) {
			System.out.println("짝짝");
			//System.out.println("n값"+n);
		}			
		else if(n % 10 == 3 ||n % 10 == 6  || n % 10 == 9) {
			System.out.println("짝");
			//System.out.println("n값"+n);
		}else {
			System.out.println(n);
		}
		n++;	
	}	
	
	*/
	
	
	
	
}
}
