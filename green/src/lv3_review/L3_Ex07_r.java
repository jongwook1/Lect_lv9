package lv3_review;

public class L3_Ex07_r {

	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a �� b �� ���ؼ� ���� ���� ¦�� �϶��� c�� ���� 
		
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 13, 54, 17, 42, 1 };
		int c[] = { 0,0,0,0,0};

		// ��) c[] = {74,82,0,0,0}
		int idx=0;
		for(int i=0;i<5;i++) {
			if((a[i]+b[i])%2==0) {
				c[idx]=a[i]+b[i];
				idx++;
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(c[i]+" ");
		}
System.out.println();
		// ����2) �Ʒ��� ������ �̴�. ���迡 �հ��ѻ���� ��ȣ�� win �� ���� (60���̻��հ�)
		int num[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win[] = { 0,0,0 };
		// ��) win[]= {1002, 1003, 0};
		
		int widx=0;
		for(int i=0;i<3;i++) {
			if(score[i]>=60) {
				win[widx]=num[i];
				widx++;
			}
		}
		for(int i=0;i<3;i++) {
			System.out.print(win[i]+" ");
		}
		
		
		
System.out.println();
		// ����3) �Ʒ��� ������ �̴� ���迡 �հ��� ����� ��ȣ�� win2 �� ���� (60���̻� �հ�)
		int data[] = { 1001, 80 , 1002, 23, 1003 , 78 };
		int win2[] = { 0,0,0 };
		// ��) win2[] = {1001, 1003, 0};
		int w2idx=0;
		for(int i=1;i<6;i+=2) {
			if(data[i]>=60) {
				win2[w2idx]=data[i-1];
				w2idx++;
			}
		}
		for(int i=0;i<3;i++) {
			System.out.print(win2[i]+" ");
		}
		

		

	}

}
