package lv4;

public class Ex11 {

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
		 
		 int temp[]= a;
		 int cnt=0;
		 int max=cnt;
		 if(max<cnt) {
			 max=cnt;
		 }
		 for(int i=0;i<a.length;i++) {
			
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					cnt++;
				}
			}
		 }
		 System.out.println(max);
		 
	}

}
