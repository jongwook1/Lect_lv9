package lv4;

public class Ex11_t {

	public static void main(String[] args) {
		/*
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		�� �迭���� �Ȱ��� ������ ������ ���� ���� ���ڿ� ���� ���� ���� ��  ������  ��� 
		��) ������ ������������ ==> 100
		��) ������ ���帹������ ==> 3
		���� ���� ���� ��� : 3 ===> 5�� 
		���� ���� ���� ��� : 100 ===> 1��
	 */
		
		 int [] a = {1,1,3,3,3,100,2,2,3,1,3};

		 int max = 0;
		 int maxNum=0;
		 
		 int min = a.length;				//�߿�				//a������ �а� �����߾Ȱ�
		 int minNum=0;
		 
				 for(int i=0;i<a.length;i++) {
					 int cnt=0;
					 for(int j=0;j<a.length;j++) {
						 if(a[i]==a[j]) {
							 cnt++;
						 }
					 }
					 if(cnt>max) {
						 max=cnt;
						 maxNum= a[i];
					 }
					 if(cnt<min) {
						 min =cnt;
						 minNum=a[i];
					 }
				 }
			System.out.printf("�ִ밳��: %d, %d��\n",maxNum, max);	 
			System.out.printf("�ּҰ���: %d, %d��\n",minNum, min);	 
				 
//		 System.out.println(max);
//		 System.out.println(min);
	}

}
