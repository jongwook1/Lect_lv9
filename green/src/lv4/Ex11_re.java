package lv4;

public class Ex11_re {

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
		
		 int max=0;
		 int maxN=0;
		 
		 int min=a.length;
		 int minN=0;
		 
		 
		 for(int i=0;i<a.length;i++) {
			 int cnt=0;
			 for(int j=0;j<a.length;j++) {
				 if(a[i]==a[j]) {
					 cnt++;
				 }
			 }
			 if(cnt>max) {
				 max=cnt;
				 maxN=a[i];
			 }
			 if(cnt<min) {
		 		 min=cnt;
		 		 minN=a[i];
		 	 }
		 }
		 	 
		 System.out.println("���帹����: "+maxN+"    "+max+"��");
		 System.out.println("����������: "+minN+"    "+min+"��");

	}

}
