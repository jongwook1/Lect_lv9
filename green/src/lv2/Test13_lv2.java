package lv2;

public class Test13_lv2 {

	public static void main(String[] args) {
		//시작 18:50
		//종료 18:57
		//소요시간 7분
		
		// #문제3) 가게에서 24600원 짜리 옷을샀습니다.
		//# 1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?

	int	total=24600;
	int bun= 1000;
	int cnt=0;
	
	while(total>0) {
		total-=bun;
		cnt++;
	}System.out.println("필요한 1000원짜리의 개수 : "+ cnt);
		
		
	}

}
