package lv2;

public class a369_lv2 {

	public static void main(String[] args) {
		/*
		 * # 369����[2�ܰ�]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */

		int a = 1;
		
		while(a<=50) {
			
			int ten = a / 10;
			int one = a % 10;
			int clap = 0;
			
			if(ten % 3 == 0 && ten != 0 ) {			
			clap++;
			}
			if(one % 3 == 0 && one != 0) {
			clap++;
			}
			
			if(clap == 0) {
				System.out.println(a);
			}
			else if (clap == 1) {
				System.out.println("¦");
			}
			else if(clap ==2) {
				System.out.println("¦¦");
			}
			a++;
		}

	}

}
