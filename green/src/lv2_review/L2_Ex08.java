package lv2_review;

public class L2_Ex08 {

	public static void main(String[] args) {
		/*
		 * # 369����[2�ܰ�]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */

		int i=1;
				
		while(i<=50) {
			int a=i%10;
			int b=i/10;
			int cnt=0;
			if(a==3||a==6||a==9) {		
				cnt++;
			}
			if(b==3||b==6||b==9) {
				cnt++;
			}
			if(cnt==1) {
				System.out.println("¦");
			}else if(cnt==2){
				System.out.println("¦¦");
			}else {
				System.out.println(i);
			}
			
			i++;
		}
		
	}

}
