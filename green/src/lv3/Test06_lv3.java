package lv3;

public class Test06_lv3 {

	public static void main(String[] args) {
		// ���� 09:26
		// ���� 10:00
		// �ҿ� 35��				
		
		// for�� ����ؼ� Ǯ�����
		// ����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ��� # �� : 6 (54,63,72,81,90,99)
		int cnt=0;
		for(int i=50;i<=100;i++) {
			if(i%9==0) {
				cnt++;
			}
		}
		System.out.println("9�ǹ���ǰ���: " +cnt);
		
		
		// ����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980
		int max=0;
		for(int i=0;i<1000;i+=28) {
			if(max<i) {
				max=i;
			}
		}System.out.println("28�� ����� ����ū ���ڸ�"+max);
		
		
		// ����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32		
		System.out.println("8�� ����� ����������5��: ");
		int cnt1 = 0;
		for (int i = 0; i < 100; i += 8) {
			cnt1++;
			if (cnt1 <= 5) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
	}

}
