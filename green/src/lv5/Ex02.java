package lv5;

public class Ex02 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// ���� 1) ���� ���
		// ���� 1) 30��
		String age = jumin.substring(0, 2);
		int n = Integer.parseInt(age);
		n = 119 - n; // 119->���� 2019���̶�� ����
		System.out.println(n + " ��");

		// ���� 2) ���� ���
		// ���� 2) ����
		//ver.1
		char gender = jumin.charAt(7);
		if (gender == 1) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}

		//ver.2
		String gender1 = jumin.substring(7,8);
//		System.out.println(gender1);
		if (gender1.equals(2+"")) {			//("2") ����
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}		
	}

}
