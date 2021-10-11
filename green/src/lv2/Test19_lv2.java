package lv2;

public class Test19_lv2 {

	public static void main(String[] args) {
		//시작 20:45
		//종료 20:47
		//소요 2분
		
		// # 문제2) 24의 약수중에서 2의 배수만출력

		int a = 1;	

		while (a <= 24) {
			if (24 % a == 0 && a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}
	}

}
