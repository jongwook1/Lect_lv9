package lv2;
/**/
public class Ex02 {
public static void main(String[] args) {
	// ���� 1) 1���� 5���� ���
			// ���� 1) 1, 2, 3, 4, 5
	
 //  int a = 1;
//	while(a <= 5) {
//		System.out.println(a);
//		a++;		
//	}
	
//	for(int aa = 1 ; aa <= 5; aa++) {
//		System.out.println(aa);
//	}
	
	
			// ���� 2) 1���� 10���� �ݺ���, 5~9���� ���         <---for ��ǰ(ǰ)
			// ���� 2) 5, 6, 7, 8, 9
	
//	int b = 1;
//	while(b <= 10) {
//		if(b>=5 && b<=9) {
//			System.out.println(b);
//			}
//		b++;
//	}
	
	
//	for(int bb = 1; bb<=10 ; bb++) {
//		if(bb<=9 && bb>=5) {											------��κ��� ����������
//		System.out.println(bb);}
//	}
	
	
			// ���� 3) 1���� 10���� �ݺ��� 6~3���� ���	        <-----�̰� while�� ��ǰ
			// ���� 3) 6, 5, 4, 3
	
	int c = 10;
	
	while(c >= 10) {
		if(c <=6 && c >=3) {
			System.out.println(c);
		}
		
		c--;
	}
	
	
	for(int cc =10; 10>=1; cc--) {
		if(cc <= 6 && cc >= 3)
			System.out.println(cc);
	}
	
	
	
			// ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���         <-------for��
			// ���� 4) 1, 2, 7, 8, 9, 10

	
	 
	
	
}
}
