package lv5;

public class Ex12_try_catch_1 {

	public static void main(String[] args) {
		int num = 10;
//		System.out.println(num/0); //����ڸ� 0���� ������ �����߻�

		
		//try catch
		//�ڹٴ� �Ϲ������� ������ �߻��ϸ� ���α׷��� ��� �����Ѵ�.
		//try catch�� ������ �߻��ص� ���α׷��� ������� �ʰ�
		//������ �κи� ���������ʰ� ���α׷��� ��� ����ǵ��� ������ش�.(��������)
		
		//1) try{} ==> �߰�ȣ �ȿ� �ڵ带 �ۼ��ϸ� �����߻��ص� �����Ѵ�.
		//2) catch(Exception e) {}==>������ �߻��ϸ� �ѹ��۵��ȴ�.
		
		try {
			System.out.println(num/0);
		}
		catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");//���� ����ص��ǰ� �Ʒ�ó�� �ص��ȴ�.
			e.printStackTrace();//�ڹٿ��� �����ϴ� ��¹�(��������� �˷��ش�)
		}
		System.out.println("try catch�� ������������� ������ ���α׷��� ���߹Ƿ� �� ������ �ȳ����ԉ�! ���α׷� ����");
	}

}