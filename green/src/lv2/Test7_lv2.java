package lv2;

public class Test7_lv2 {

	public static void main(String[] args) {
		// ���� 12:42
		// ���� 01:00
		// �ҿ� 18��

		// # ����1)
		// # ���ֳ� �� �л��� 31���Դϴ�.
		// # ���߿��� ���л��� 12�� , ���л��� 14���� �����ҵ��� �Ͽ����ϴ�. //5
		// # ���ֳ� �ݿ��� ����Ȱ���� �������� �л���
		// # ������� ���
int total = 31;
int boy = 12;
int girl = 14;

int none = 0;			//������̵� ����

while(boy + girl >0) {
	if(boy > 0) {
		boy--;
		
	}else if(girl > 0) {
		girl--;
	}
	total --;
}System.out.println(total);

while(total>0) {
	total --;
	none++;
}

		
		
		
		
		
		
		
/*
		int total = 31;
		int a = 0;
		int b = 0;
		int cnt = 0;

		while (total > 0) {
			if (a >= 12) {
				if (b >= 14) {
					System.out.println(total);
					cnt++;
				}
				b++;
			}
			total--;
			a++;
		}

		System.out.println("����Ȱ���� �������� �л��� ��: " + cnt);
*/
		
		
		
		
		
		
		
		
		
		
	}

}
