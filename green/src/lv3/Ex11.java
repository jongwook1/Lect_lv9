package lv3;

public class Ex11 {

	public static void main(String[] args) {
		// ����1)  a�� ���� b�� ���� �����ư��鼭 c�� ����
		// ��) c = {10,40,20,50,30,60}
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		
			
		for(int i=0;i<3;i++) {	//i: 0(0,1) 1(2,3) 2(4,5)
			c[i*2]=a[i];
			c[i*2+1]=b[i];
		}
		for(int i=0;i<6;i++) {
			System.out.println(c[i]+" ");
		} 		
		
/*		int addIdx=-1;
		for(int i=0;i<3;i++) {
			if(i % 2 ==0) {
				addIdx = i;
				
			}
			else {
				addIdx = i-1;
			}
		}
		int cIdx=0;
		for(int i=0;i<6;i++) {
			if(i != addIdx) {
				c[cIdx] =a[i]+b[i];
				c[cIdx-1]=a[i-1]+b[i-1];
				cIdx++;
			}
		}for(int i=0;i<6;i++) {
			System.out.println(c[i]);
		}		
*/	
		
		// ���� 2) aa �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� bb��  ���� ���� 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// ��) aa = {20,30,40,50,90};
		
		
		for(int i=0;i<5;i++) {		//i : 0~[4]
			if(i+1 <5) {
			aa[i] = aa[i+1];		//   aa[i] = aa[i+1]; �̰Ÿ����� out bounds....�׷��� ��if������ ����ó������
			}
		}
		aa[4] = 90;
		
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(aa[i]+ " ");
		}		
		
		
		// ���� 3) cc �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� dd�� ���� ���� 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		// ��) cc[] = {60,10,20,30,40};
		
//		for(int i=0;i<5;i++) {		//�̷����ϸ� Ʋ���ٴ°ſ��ö� �ּ�ó��
//			cc[i] = cc[i-1];
//		}
	
		
		for(int i=4;i>0;i--) {		//i : 4~1
			cc[i] = cc[i-1];
		}
		cc[0]=dd;
		
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.println(cc[i] + " ");
		}
		
		


	}

}
