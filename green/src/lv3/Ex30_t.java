package lv3;
import java.util.Scanner;
public class Ex30_t {

	public static void main(String[] args) {
		/*
		 * # 소수찾기[2단계]
		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 * 예)
		 * 입력 : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num= sc.nextInt();		//2~num
		
		int count =0;
		for(int i=2; i<=num;i++) {		//검사할대상은 i
			int cnt =0;					//cnt위치 중요 내부 for들어가기전에 선언 cnt
			for(int j=1; j<=i;j++) {
				if(i % j ==0) {
					cnt++;
				}				
			}
			if(cnt ==2 ) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count + "개 ");
		
	}

}
