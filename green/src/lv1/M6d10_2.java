package lv1;

public class M6d10_2 {

	public static void main(String[] args) {
		/*
		// * # 369����[2�ܰ�]
		//* 1. 1~50���� �ݺ��� �Ѵ�.
	//	 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
	//	 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...33 ¦¦ 36 ¦¦..
		 */
		
		int a = 1;
		int b = 0;
		while(a < 50) {
			if(a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				
				System.out.println("¦");
				if(a / 10 == 3) {
					System.out.println("¦¦");
				}	
				
			}else {
			System.out.println(a);
			}
			
			
			a++;
		}
		
		
	}

}
