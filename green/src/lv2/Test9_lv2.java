package lv2;


public class Test9_lv2 {

	public static void main(String[] args) {
		//

		// # ����3)
		// # ��� ���忡�� �ѻ���� 1�ð��� ��ǻ�͸� 4�븦 �����Ҽ� �ִٰ��Ѵ�.
		// # 3���� ��ǻ�� 96�븦 �������� ��ð��� �ɸ��°�

		int com = 96;
		int p = 4;
		int h = 0;
		int people=3;
		while (com > 0) {
			com -= p;
			h++;
		}
		System.out.println("�ɸ��ð�" + h/people);
	}
}
