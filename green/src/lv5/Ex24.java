package lv5;

import java.util.Random;
//�����̵������� �������� ���ÿ�ó���Ǵ°�- ���� lv3 Ex19
public class Ex24 {

	public static void main(String[] args) {
		// # �渶 ����
		// 5������ ���� �������� �ѹ��� �����Ÿ� �̵������ϴ�
		// �̵��ѰŸ��� ���� 20�̻��̸� ����
		// ��� ���
		// ����) ��! ���õ��� ����ó��

		Random ran = new Random();

		int horse[][] = new int[5][20];
		int max = 20;
		int mal = 7;

		int rank[] = new int[5];
		int total[] = new int[5];
		System.out.println(horse.length);

		int cnt = 1;
		int z = 0;
		while (true) {
			System.out.println("\ncnt: " + cnt);
			System.out.println("z: " + z);
			boolean record = true;

			for (int i = 0; i < horse.length; i++) {
				for (int j = 0; j < horse[i].length; j++) {
					if (horse[i][j] == mal) {
						System.out.print("�� ");
					} else {
						System.out.print("_ ");
					}

				}
				System.out.println();
			}
			if (cnt == 6) {
				break;
			}

			for (int i = 0; i < horse.length; i++) {
				int move = ran.nextInt(4);
				if (total[i] + move < max) {
					if (total[i] != 0) {
						horse[i][total[i] - 1] = 0;		//total[i]�� �ε����� ���Ƿ� -1ó��
					}
					total[i] += move; // total[i]���� //�������� �̵��Ÿ� ��,horse[i][���ڸ�]
					if (total[i] != 0) {
						horse[i][total[i] - 1] = mal;	//total[i]�� �ε����� ���Ƿ� -1ó��
					}
				}

				else if (total[i] + move >= max && rank[i] == 0) {
					if (record == true) { // ���õ��� ����ó��
						horse[i][total[i] - 1] = 0;		//total[i]�� �ε����� ���Ƿ� -1ó��
						total[i] = 20;
						rank[i] = cnt++;
						horse[i][total[i] - 1] = mal;	//total[i]�� �ε����� ���Ƿ� -1ó��
						record = false;
					} else {
						i--;
					}

				}
				
			}
			System.out.println();

			z++;
			for (int i = 0; i < rank.length; i++) {
				System.out.print(rank[i] + " ");
			}
			System.out.println();
			try{Thread.sleep(300);}catch(Exception e){}
		}

	}

}
