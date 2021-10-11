package lv1;

public class Ex05 {

	public static void main(String[] args) {
		// 비교연산자 (논리형으로 결과값을 반환)
		// > < >= <=
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		
		boolean result;
		result = num1 == num2;
		System.out.println("num1과 num2가 같은가 :"+result);
		
		// 논리연산자
		//1) and &&
		//2) or ||
		
		
		// num1과 num2가 같거나(or) num1이 작다
		System.out.println(num1 == num2 || num1 < num2);
		
		// num1과 num2가 같고(and) num1이 작다
		System.out.println(num1 == num2 && num1 < num2);
				
		
		
		// 예) 3의 배수이면서, 짝수이면 true 출력
				int num = 12;
				System.out.println(num % 3 == 0 && num % 2 == 0);
				// 문제 1) 과락				
				// 3과목의 평균이 60점 이상이면, true
				// 단, 어느 한 과목이라도 50점 미만이면, false
				int kor = 100;
				int eng = 87;
				int math = 41;
				
				double avg = (kor + eng + math) / 3.0;
								
				System.out.println(avg >= 60 && kor >= 50 && eng >= 50 && math >= 50   );
				
				
			//문제 2) 키가 200cm 이상이거나
			// 몸무게가 200kg 이상이면, 입장(true)
				int height = 180;
				int weight = 80;
				
				
		
		
	}

}
