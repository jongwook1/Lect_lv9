package lv2_review;

public class L2_Ex18 {

	public static void main(String[] args) {
				// for�� ����ؼ� Ǯ����� 
				//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		
				for(int i=0;i<1000;i++) {	
					int a=i%10;
					if(i%9==0&&a==6) {
						System.out.println(i);
						i=9999;
					}
				}
		
		
		
				//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
				for(int i=0;i<1000;i++) {
					if(i%9==0&&i/10==6) {
						System.out.println(i);
						i=9999;
					}
				}	
		
				//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
				int idx=0;
				for(int i=0;i<1000;i++) {
					if(i%8==0&&i<150) {
						idx=i;
					}
				}
				System.out.println(idx);
				
				

	}

}
