//while���� �ۼ��ϱ�
package lv2;

public class Ex03 {

	public static void main(String[] args) {
		//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		
		boolean run = true;
		int a = 0;
		while(run) {
			if(a % 9 == 0 && a % 10 ==6) {
				System.out.println(a);
				run = false;
			}			
			a++;
		}		
		
		for(int i=0; i<100; i+=9) {
			int ten = i / 10;
			int one = i % 10;
			if(one == 6) {
				System.out.println(i);
				i = 100;				//one ==6 �� if�� ������ϱ����� ��
			}
		}
		
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		
		for(int i=1; i<100; i++) {
			if(i % 9 == 0 && i/10 ==6) {
				System.out.println(i);
				i=100;
			}			
		}
		//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144		//max���ᵵ �ǰ� �Ųٷ� ����������
		int max =0; //for�ȿ� �����ϸ� ��� �ʱ�ȭ�ϹǷ�  for�� �ۿ��� ����
		for(int i =0; i<150; i++ ) {
			if(i % 8 ==0 && max < i) {
				max =i;
			} 			
		}System.out.println(max);
	}
}
