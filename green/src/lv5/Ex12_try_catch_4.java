package lv5;

public class Ex12_try_catch_4 {

	public static void main(String[] args) {
		// ������ ���� (�������Ʈ) 
		// https://butter-shower.tistory.com/87
		
		//try catch finally
		
		//finally �� ���� ���� ������� ������ ����ȴ�.
		//�ڵ尡 �� �۵��ߴ��� Ȯ�� �Ҷ� ����.(�ȳ�������)
		

		int num1=10;
		int num2=0;
		
		try {
		System.out.println(num1/num2);
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�");
		}
	finally {
			System.out.println("���ܹ߻��� ������� ������ ������ ������ ���´�");
		}
	}

}
