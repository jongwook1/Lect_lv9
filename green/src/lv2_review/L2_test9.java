package lv2_review;

public class L2_test9 {

	public static void main(String[] args) {
//		# ����1) 36�� ��� �� ���� ���
//	# �����  36�� ������ �������� 0�μ��� ���Ѵ�.
//	# 1,2,4,6.....
		System.out.println("36�Ǿ��");
		int i=1;
		while(i<=36) {
			if(36%i==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
		
System.out.println("\n24�Ǿ��");
//	# ����2) 24�� ����߿��� 2�� ��������
		i=1;
		while(i<=24) {
			if(24%i==0&&i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
System.out.println();
//	# ����3) 18�� ����� ���� ���ϱ�  21�� ����� ������ ���
		i=1;
		int cnt1=0;
		int cnt2=0;
		while(i<=24) {
			if(18%i==0) {
				cnt1++;
			}
			if(21%i==0) {
				cnt2++;
			}
			i++;
		}
		System.out.println("18�� ����������ϱ� 21�Ǿ������"+cnt1+cnt2);
//
//	# ����4) 50 ���� 100 ������ �ڿ����߿��� 9�� ����� ��� �?
		 i=50;
		 int cnt4=0;
		while(i<=100) {
			if(i%9==0) {
				cnt4++;
			}
			i++;
		}
		System.out.println("9�� ����ǰ���: "+cnt4);
		

	}

}
