package lv2_review;

public class L2_Ex01 {

	public static void main(String[] args) {
		// ����1) 1~5������ �� ���
		// ���� 1) 15
		int i=1;
		int sum=0;
		while(i<=5) {
			sum+=i;
			i++;
		}
		System.out.println("1~5������ ��: "+sum);
		
		
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		i=1;
		sum=0;
		int cnt=0;
		while(i<=10) {
			if(i<3||i>=7) {
				System.out.print(i+" ");
				sum+=i;
				cnt++;
			}
			i++;
		}
		
System.out.println();
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
System.out.println(" ����2�� ���ǿ� �´� ������ ��:  "+sum);

		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
System.out.println("����2�� ���ǿ� �´� ������ ����:  "+cnt);

	}

}
