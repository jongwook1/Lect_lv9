package lv5;

public class Ex12_try_catch_2 {

	public static void main(String[] args) {

		//������ ���� (��������Ʈ)
		//https://butter-shower.tistory.com/87
		
		
		//�ּ�ó�� �غ��鼭 �ϳ��� �����غ���
		int arr[]= new int[3];
		try {
			arr[100]=100;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//-----------------------------------------------
		
		int a =10;
		try {
			int b=a/0;
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		String str="aaa";
		try {
			int num =Integer.parseInt(str);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		
	}

}