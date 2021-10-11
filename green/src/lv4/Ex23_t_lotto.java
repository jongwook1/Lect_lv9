package lv4;

import java.util.Random;

public class Ex23_t_lotto {

	public static void main(String[] args) {
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.		---------	//������(0 1) 2���ο� ->1�� ���ö� 3���� ��ü
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
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
					// ��÷ �߰�!
					if (win == false) {// ù ��÷
						win = true;
					} else {// �ߺ� ��÷ -> �ٽû̱�
						i--;
						break;	// i��° ��÷����  �� �ο�����
					}
				}
					
			}
			if(win == false && i == lottoSet.length-1) {	//��÷�� �ϳ��� ���� ���
				i--;
			}
		}
		//���
		for(int i=0;i<lottoSet.length;i++) {
			for(int j=0;j<lottoSet[i].length;j++) {
				System.out.print(lottoSet[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
