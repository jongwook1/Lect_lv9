package lv5;

import java.util.Random;
//숫자이동예제가 여러개가 동시에처리되는것- 관련 lv3 Ex19
public class Ex24 {

	public static void main(String[] args) {
		// # 경마 게임
		// 5마리의 말이 랜덤으로 한번에 일정거리 이동가능하다
		// 이동한거리의 합이 20이상이면 도착
		// 등수 출력
		// 조건) 단! 동시도착 예외처리

		Random ran = new Random();

		int horse[][] = new int[5][20];
		int max = 20;
		int mal = 7;

		int rank[] = new int[5];
		int total[] = new int[5];
		System.out.println(horse.length);

		int cnt = 1;
		int z = 0;
		while (true) {
			System.out.println("\ncnt: " + cnt);
			System.out.println("z: " + z);
			boolean record = true;

			for (int i = 0; i < horse.length; i++) {
				for (int j = 0; j < horse[i].length; j++) {
					if (horse[i][j] == mal) {
						System.out.print("말 ");
					} else {
						System.out.print("_ ");
					}

				}
				System.out.println();
			}
			if (cnt == 6) {
				break;
			}

			for (int i = 0; i < horse.length; i++) {
				int move = ran.nextInt(4);
				if (total[i] + move < max) {
					if (total[i] != 0) {
						horse[i][total[i] - 1] = 0;		//total[i]가 인덱스로 들어가므로 -1처리
					}
					total[i] += move; // total[i]값은 //각말들의 이동거리 즉,horse[i][요자리]
					if (total[i] != 0) {
						horse[i][total[i] - 1] = mal;	//total[i]가 인덱스로 들어가므로 -1처리
					}
				}

				else if (total[i] + move >= max && rank[i] == 0) {
					if (record == true) { // 동시도착 예외처리
						horse[i][total[i] - 1] = 0;		//total[i]가 인덱스로 들어가므로 -1처리
						total[i] = 20;
						rank[i] = cnt++;
						horse[i][total[i] - 1] = mal;	//total[i]가 인덱스로 들어가므로 -1처리
						record = false;
					} else {
						i--;
					}

				}
				
			}
			System.out.println();

			z++;
			for (int i = 0; i < rank.length; i++) {
				System.out.print(rank[i] + " ");
			}
			System.out.println();
			try{Thread.sleep(300);}catch(Exception e){}
		}

	}

}
