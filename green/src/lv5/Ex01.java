package lv5;

public class Ex01 {

	public static void main(String[] args) {
		//���ڿ� : ������ ����(�迭)
		// �� String Ŭ���� - char �迭�� ó������
		
		//����ȯ
		// ����->����
		char a= 'a';
		int num =(int)a;
		System.out.println(num);	// 97 ascii
		
//		char h='h';
//		int num1 = h;
//		System.out.println(num1);
		
		//���� ->����
		char b=(char)(num+1);
		System.out.println(b);
		
		//���ڿ� ->����
		String str="123";		//���ڰ����θ� �̷��������
		num=Integer.parseInt(str);		//Integer.parseInt()�ϱ�
		System.out.println(num+1);
		
		//���� -> ���ڿ�
		//1.
		str =String.valueOf(num);		//String.valueOf()�ϱ�
		System.out.println(str+1);
		// 2.
		str=num+"";
		System.out.println(str+1);
//		String str1=num1+"";
//		System.out.println(str1+1);
		
		
		//���ڿ� �޼���
		str ="Do not go gentle into that good night";
		
		//substring()		: �κ� ���ڿ� ����
		//���ڿ�.substring(index) -> index~������ ���ڱ��� ����		
		System.out.println(str.substring(0));		//0�ε������� ���������ڱ�������
		//���ڿ�.substring(a,b) -> a~(b-1) ���ڱ��� 
		System.out.println(str.substring(10,16));		
		
		//split()			: ���ڿ� �߶�
		//���ڿ�.split("������")
		//-> String �迭�� ��ȯ
		String result[]=str.split(" ");
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]);
		}
//		System.out.println(result.length);
		//charAt()			: ���� �Ѱ��� ����
		// ���ڿ�.charAt(index)
		//->char ��ȯ
		
		char c= str.charAt(0);
		System.out.println(c);
		
	
		
		
	}

}
