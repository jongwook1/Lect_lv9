package lv1_review;

public class Ex03_l1 {

	public static void main(String[] args) {
		// 예) 3의 배수이면서, 짝수이면 true 출력
				int num = 12;
				System.out.println(num % 3 == 0 && num % 2 == 0);
				
				// 문제 1) 과락
				// 3과목의 평균이 60점 이상이면, true
				// 단, 어느 한 과목이라도 50점 미만이면, false
				int kor = 100;
				int eng = 87;
				int math = 41;
				
				System.out.println((kor+eng+math)/3>60);
				

		    // 문제 2) 키가 200cm이상이거나 몸무게가 200kg 이상이면, 입장(true)
				int h=200;
				int w=50;
				
				System.out.println(h>=200||w>=200);
				
	}

}
