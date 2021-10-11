package lv2;

public class Test7_lv2 {

	public static void main(String[] args) {
		// 시작 12:42
		// 종료 01:00
		// 소요 18분

		// # 문제1)
		// # 운주네 반 학생은 31명입니다.
		// # 이중에서 남학생은 12명 , 여학생은 14명이 봉사할동을 하였습니다. //5
		// # 은주네 반에서 봉사활동을 하지않은 학생은
		// # 몇명인지 출력
int total = 31;
int boy = 12;
int girl = 14;

int none = 0;			//결과값이될 변수

while(boy + girl >0) {
	if(boy > 0) {
		boy--;
		
	}else if(girl > 0) {
		girl--;
	}
	total --;
}System.out.println(total);

while(total>0) {
	total --;
	none++;
}

		
		
		
		
		
		
		
/*
		int total = 31;
		int a = 0;
		int b = 0;
		int cnt = 0;

		while (total > 0) {
			if (a >= 12) {
				if (b >= 14) {
					System.out.println(total);
					cnt++;
				}
				b++;
			}
			total--;
			a++;
		}

		System.out.println("봉사활동을 하지않은 학생의 수: " + cnt);
*/
		
		
		
		
		
		
		
		
		
		
	}

}
