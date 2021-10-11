package lv4;

public class A_08 {

	public static void main(String[] args) {
		/*			
		 * # 석차 출력							
		 * . 성적 순으로 이름 출력              //남의성적 나한테주면x
		 */
		
		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score   = {    87,    42,    100,     11,     98};

		for(int i=0;i<5;i++) {
			int max=score[i];
				int	idx=i;
					for(int j=i;j<5;j++) {
						if(max<score[j]) {
							max=score[j];
							idx=j;
						}
					}
					int temp=score[i];
					score[i]=score[idx];
					score[idx]=temp;
						
					String temp1=name[i];
					name[i]=name[idx];
					name[idx]=temp1;			
							
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%d등 %s %d점\n", i+1, name[i],score[i]);
		}

	}

}
