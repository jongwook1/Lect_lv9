package lv2;
//��
public class Test14_lv2f {

	public static void main(String[] args) {
		//���� : 19:00
		//���� :
		//�ҿ�ð� :
		
		
		// # ����1 )  ����� 3�� ���Ͽ����� 6.12 ���Ǿ����ϴ�. �̼��� 4�� ������ ��?
		
		double cnt = 1;
		double x = 6.12/3;
		
		while(x%1<1) {
			x=x*10;
			cnt=cnt/10;
			if(x%1==0) {
				System.out.println("����: "+(x/4)*cnt);
				break;
			}
		}
		

	}

}
