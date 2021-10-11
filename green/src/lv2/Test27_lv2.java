package lv2;

public class Test27_lv2 {

	public static void main(String[] args) {
//	시작	22:20
//	종료 22:25
//	소요 5분
//	# 문제2) 수인이는 4일 마다 수영장을 가고 형주는 6일마다 수영장에간다
//	# 두사람이  4월 3일에 만났다면 다음에 만날날은 언제인가?
		int n = 1;
		int a = 4;
		int b = 6;
		boolean run = true;
		while (run) {
			if (n % a == 0 && n % b == 0) {
				System.out.println("최소공배수:"+n);
				System.out.println("다음 만날날은 4월3일에 4와6의 최소공배수를 더한다" + (3 + n) + "일");
				run = false;
			}
			n++;
		}

	}

}
