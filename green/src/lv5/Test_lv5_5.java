package lv5;

public class Test_lv5_5 {

	public static void main(String[] args) {
		String data = "123+46";		

		// �� ���� ���� ���Ͻÿ�
		// split() �޼����� ���� ���� ������
		
		String a ="+";		

		String temp2[]=null;
		
		int cnt=0;
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==a.charAt(0)) {		//������ �������ϱ�
				cnt++;
			}
		}
		
		temp2=new String[cnt+1];	//�����ڸ�ŭ �迭�����
		
		if(temp2!=null) {
		for(int i=0;i<cnt+1;i++) {		//null���� 
			temp2[i]="";
			System.out.println(temp2[i]);
		}
		
		int idx=0;
		for(int i=0;i<data.length();i++) {	//�����ڰ� �����ԵǸ� �����ε�����
			if(data.charAt(i)==a.charAt(0)) {
				idx++;
				
			}else {
				temp2[idx]+=data.charAt(i);
			}
		}
//		for(int i=0;i<cnt+1;i++) {
//			System.out.println(temp2[i]);
//		}
		
		int result=0;
		
		for(int i=0;i<cnt+1;i++) {	
			result+=Integer.parseInt(temp2[i]);			
		}
		System.out.println(result);
		
		}
	}

}
