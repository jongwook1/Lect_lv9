package lv5;

public class Ex04 {

	public static void main(String[] args) {
		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		String str = "��ö��/87,�̸���/42,�̿���/95";
		String[] name = new String[3];
		int[] score = new int[3];

		String n1[] = str.split(",");		
		
		for(int i=0;i<n1.length;i++) {
			String n2[]=n1[i].split("/");
//			System.out.println(n2[0]);
//			System.out.println(n2[1]);
			name[i]=n2[0];
			score[i]=Integer.parseInt(n2[1]);
			}
		
		for(int i=0;i<name.length;i++) {
		System.out.printf("%s �� %d�� �Դϴ�\n",name[i],score[i]);
		}
		
	}
}
