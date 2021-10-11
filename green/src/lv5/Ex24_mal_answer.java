package lv5;
////숫자이동예제가 여러개가 동시에처리되는것- 관련 lv3 Ex19
import java.util.Random;

public class Ex24_mal_answer {

	public static void main(String[] args) {
				// # 경마 게임
				// 5마리의 말이 랜덤으로 한번에 일정거리 이동가능하다
				// 이동한거리의 합이 20이상이면 도착
				// 등수 출력
				// 조건) 단! 동시도착 예외처리
		
Random ran = new Random();
		
		final int H = 1;

		int horse[][] = new int[5][20];
		int max = 20;
		
		int rank[] = new int[5];
		int total[] = new int[5];
		
		// ready
		for(int i=0; i<total.length; i++) {
			horse[i][0] = H;
		}
		
		int n = 1;
		boolean run = true;
		while(run){
			// print
			System.out.println("RACE>>>");
			for(int i=0; i<horse.length; i++) {
				for(int j=0; j<horse[i].length; j++) {
					if(horse[i][j] == H) {
						System.out.print("말_");
					}
					else {
						System.out.print("__");
					}
				}
				System.out.println();
			}
			
			if(n > rank.length) break;
			
			// jump
			boolean goal = false;
			for(int i=0; i<total.length; i++) {
				if(total[i] < max-1) {
					int jump = ran.nextInt(4);
					int xx = total[i] + jump;
					
					if(xx < max-1) {
						horse[i][total[i]] = 0;
						total[i] = xx;
					}
					// goal
					else {
						// exception 동시도착 예외처리
						if(goal) {
							i --;
							break;
						}
						else {
							horse[i][total[i]] = 0;
							total[i] = max-1;
							goal = true;
							rank[i] = n;
							n ++;
						}
					}
					horse[i][total[i]] = H;
				}
				
			}
			try { Thread.sleep(300);} catch (Exception e) {}
		}
		
		// result
		for(int i=0; i<rank.length; i++) {
			System.out.printf("horse no.%d %d등\n", i+1, rank[i]);
		}

	}

}
