package lv2_review;

public class L2_test7 {

	public static void main(String[] args) {
//test 7		
//	# ����1)
//	#   ���ֳ� �� �л��� 31���Դϴ�.
//	#   ���߿��� ���л��� 12�� , ���л��� 14���� �����ҵ��� �Ͽ����ϴ�.
//	#   ���ֳ� �ݿ��� ����Ȱ���� �������� �л���
//	#   ������� ��� 
		
	int total=31;
	int m=12;
	int f=14;
	int temp=0;
	while(m+f>0) {
		if(m>0) {
			m--;
		}else if(f>0) {
			f--;
		}
		
		total--;
	}
	
	while(total>0) {
		total--;
		temp++;
	}
	System.out.println("����Ȱ������ �л�: "+temp+"��");
	

//
//	# ����2)
//	# ���� 7Ÿ�� ���л� 2��� ���л� 4���� ������� �Ȱ��� ������ �־�����
//	# �ѻ���� ������ �� �ڷ� ������ �Ǵ� �� ��� (���� 1Ÿ�� 12�ڷ�)
//	# ��Ʈ ) 7 * 12 / 6 
	int p=7*12;
	int g=2;
	int b=4;
	int cnt=0;
	while(p>0) {
		while(g+b>0) {
			if(g>0) {
				g--;
			}else if(b>0) {
				b--;
			}
			p--;
		}
		cnt++;
		g=2;
		b=4;
	}
	System.out.println("�����Ե� �����Ǽ�: "+cnt+"��");
	
	
//	# ����3)
//	# ��� ���忡�� �ѻ���� 1�ð��� ��ǻ�͸� 4�븦 �����Ҽ� �ִٰ��Ѵ�.
//	# 3���� ��ǻ�� 96�븦 �������� ��ð��� �ɸ��°�
	int make=4;
	int h=0;
	int com=96;
	int people=3;
	while(com>0) {
		com-=make;
		h++;
		
	}
	System.out.println("�ɸ��½ð�: "+h/people+"�ð�");
	
		
		

//	# ����4)
//	# �� 6���� ������ 840g, ��� 3���� ���Դ� 750g �Դϴ�.
//	# ��5���� ��� 4���� ���Դ� ��g���� ��� (�� ������ �ֳ��� ���Դ� ����  ������ ��������� ���԰�����)

int gull=5;
int gg=840/6;
int apple=4;
int ag=750/3;
int totalG=0;
		
while(gull>=0&&apple>=0) {
	if(gull==0) {
		totalG+=ag;
	}else if(apple==0) {
		totalG+=gg;
	}else {
		totalG+=ag+gg;
	}
	gull--;
	apple--;
	
}
		System.out.println("��5���4�� ���Դ�: "+totalG+"g");	
		
	}

}
