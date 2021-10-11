package lv4_review;

public class L4_Ex06 {

	public static void main(String[] args) {
		/*
		 * # 석차 출력
		 * . 성적 순으로 이름 출력
		 */
		
		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score   = {    87,    42,    100,     11,     98};
	
		
		for(int i=0;i<score.length;i++) {
			int max=score[i];
			int idx=i;
			for(int j=i;j<score.length;j++) {
				if(max<score[j]) {
					max=score[j];
					idx=j;
				}
			}
			int temp=score[i];
			score[i]=score[idx];
			score[idx]=temp;
			
			String temp2=name[i];
			name[i]=name[idx];
			name[idx]=temp2;
		}
		
		for(int i=0;i<5;i++) {
			System.out.printf("%d등 %s %d점\n", i+1, name[i],score[i]);
		}
		
	}

}
