package lv2_review;

public class L2_test8 {

	public static void main(String[] args) {
//		#���� 1) ��Ʈ���� ���̸� 3���� ��� 1500���� �Ǵٰ� �Ѵ�
//	# ���̰� 14�� �ʿ��ϴ�. ���� ���ʿ��Ѱ�(���̴� �������θ� �Ǵ�)
//	/*
//	   ��Ʈ : 3�ǹ���� �ƴϸ� �ɶ����� ������Ų��. 
//	    while(���� % 3  != 0){
//	       ���� += 1;
//	   }
//
//	*/
		int o2=14;
		int bundle=3;
		int price=1500;
		int bcnt=0;
		while(o2>0) {
			o2-=bundle;
			bcnt++;
			
		}
		System.out.println("�ʿ��� ����"+bcnt*price+"��");
		

//	# ���� 2) �μ��� �� �л��� 26���Դϴ�
//	# �μ��׹� �л��鿡�� ��ȭ���� 2 �徿 ������ �ַ����մϴ�.
//	# ��ȭ���� 10�坼 �������θ� �Ǹ��ϰ� 10�忡 1200���Դϴ�.
//	# �Ѿ󸶰� �ʿ��Ѱ���?
int total=26;
int divide=2;
int bun=10;
int td=1;
int cash2=0;
int price2=1200;
while(total>0) {
	
	if(bun==0) {
		bun=10;
		td++;
	}
	
	bun-=divide;
	total--;
}
cash2=td*price2;
System.out.println("�ʿ��ѵ�: " +cash2+"��");
		
//	#����3) ���Կ��� 24600�� ¥�� ��������ϴ�.
//	# 1000��¥�� ����θ� �ʰ��� ���ٸ� ������ �ʿ��Ѱ���?
int total2=24600;
int bun3=1000;
int cnt3=0;
while(total2>0) {
	total2-=bun3;
	cnt3++;
}
System.out.println(cnt3);

		
		
//	# ����1 )  ����� 3�� ���Ͽ����� 6.12 ���Ǿ����ϴ�. �̼��� 4�� ������ ��? (�ݺ����� Ȱ���� ����ȭ -> ���� �� �ǵ��� ����)
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


//	# ����2) �����̰� 1�ð� 20�е��� ������ ������� ���� ���� ���԰� 9 Ű���̴�
//	# 3�е��� �������� ��Ű���ΰ� ?

int min=80;
int workbam=9000;
double bam=0;
while(bam<=0) {		
	bam=workbam/min;			
	System.out.println("����: "+(bam*3)/1000+"kg");
}		
		
//	# ����3) ���Կ� ������ 250���� �ִ� ���߿� ������ 84�ۼ�Ʈ�� �ȷȰ� �������� ���Ŀ� ���ȷȴ�
//	# ������ �ȸ����� - ���Ŀ� �ȸ������� ���ΰ�

int milk=250;
double mor =0;
double aft=0;	

while(mor / milk < 0.84) {
	mor++;
}
aft = milk - mor;
System.out.println("�������ȸ�����-���Ŀ��ȸ�����: "+(mor-aft));	
		
//lv2 test17		
//	# ����4) ������ÿ� ��ü �α��� 400000 ���ε� ���̰� 19�� ���� �α��� 35�ۼ�Ʈ
//	#  40�� �̻��α��� 25�ۼ�Ʈ�϶�
//	# 19�������α� - 40���̻��α� ���� ���Ͻÿ�
double people = 400000;
double a = 0;
double b = 0;

while (a / people < 0.35) {
	a++;
}
while (b / people < 0.25) {
	b++;
}
System.out.println("19�������α���-40���̻��α���: " + (a - b));

	}

}
