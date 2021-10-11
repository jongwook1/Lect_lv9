package lv4;

public class Ex08_re {

	public static void main(String[] args) {
		/*			
		 * # 석차 출력							
		 * . 성적 순으로 이름 출력              //남의성적 나한테주면x
		 */
		
		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score   = {    87,    42,    100,     11,     98};
		
//		for(int i=0;i<score.length;i++) {	
//			int cnt=0;
//				for(int j=i;j<score.length;j++) {
//					if(score[i]<score[j]) {
//						
//						int temp=score[i];
//						score[i]=score[j];
//						score[j]=temp;
//						String temp2=name[i];
//						name[i]=name[j];
//						name[j]=temp2;	
//						
//					
//					}
//					
//				}
//				
//				System.out.printf("%d 등 %d점",i+1,score[i]);
//				System.out.print(name[i]+" ");
//				

		
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
		for(int i=0;i<name.length;i++) {
		System.out.printf("%d %d %s" ,i+1,score[i],name[i] );
		}
	
		
		
		
		
		

	}

}
