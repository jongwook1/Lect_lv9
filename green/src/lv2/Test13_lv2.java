package lv2;

public class Test13_lv2 {

	public static void main(String[] args) {
		//���� 18:50
		//���� 18:57
		//�ҿ�ð� 7��
		
		// #����3) ���Կ��� 24600�� ¥�� ��������ϴ�.
		//# 1000��¥�� ����θ� �ʰ��� ���ٸ� ������ �ʿ��Ѱ���?

	int	total=24600;
	int bun= 1000;
	int cnt=0;
	
	while(total>0) {
		total-=bun;
		cnt++;
	}System.out.println("�ʿ��� 1000��¥���� ���� : "+ cnt);
		
		
	}

}
