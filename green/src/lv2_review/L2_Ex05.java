package lv2_review;

public class L2_Ex05 {

	public static void main(String[] args) {		
		
		//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		int i=0;
		while(i<100) {
			if(i%9==0&&i%10==6) {
				System.out.println(i);
				break;
			}
			i++;
		}
		
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		while(i<100) {
			if(i%9==0&&i/10==6) {
				System.out.println(i);
				break;
			}
			i++;
		}
	
		//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
//ver1		
		int temp = 0;
		i = 0;
		while (i < 1000) {
			if (i % 8 == 0 && i < 150) {
				temp = i;
			}
			i++;
		}
		System.out.println(temp);
		
//ver2
		i=999;
		while(i>0) {
			if(i%8==0&&i<150) {
				System.out.println(i);
				break;
			}
			i--;
		}
		

	}

}
