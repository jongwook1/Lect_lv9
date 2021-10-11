package lv4;

import java.util.Random;

public class Ex23_t_lotto {

	public static void main(String[] args) {
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.		---------	//랜덤값(0 1) 2개부여 ->1이 나올때 3으로 대체
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.
		 */

		int[][] lottoSet = new int[5][7];
		
		Random rn=new Random();
		
		boolean win=false;
		
		for(int i=0;i<lottoSet.length;i++) {
			int cnt=0;
			
			for(int j=0;j<lottoSet[i].length;j++) {
				int num=rn.nextInt(2);//!!!!!!!!!!!!!!!!!!!!!!!  0->0, 1->3
				if(num==1) {
					lottoSet[i][j]=3;
					cnt ++;
				}else {
					lottoSet[i][j]=0;
					cnt =0;
				}
				if (cnt == 3) {
					// 당첨 발견!
					if (win == false) {// 첫 당첨
						win = true;
					} else {// 중복 당첨 -> 다시뽑기
						i--;
						break;	// i번째 당첨셋의  값 부여중지
					}
				}
					
			}
			if(win == false && i == lottoSet.length-1) {	//당첨셋 하나도 없는 경우
				i--;
			}
		}
		//출력
		for(int i=0;i<lottoSet.length;i++) {
			for(int j=0;j<lottoSet[i].length;j++) {
				System.out.print(lottoSet[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
