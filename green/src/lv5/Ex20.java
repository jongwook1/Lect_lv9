package lv5;

public class Ex20 {

	public static void main(String[] args) {
		//���ڿ���ȭ1����
		String [][] student = {
			//	 id     �ּ�   ��ȣ
				{"aaa","����","1001"}, 
				{"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} , 
				{"ddd" , "����","1004"}};
		String[][] score = {
			//    ��ȣ     ����    ��      ��
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		// �л� ������ ������ ��� ������ �̴�
		// student ==> 1.id 2.�ּ� 3.��ȣ
		// score ==> 1.��ȣ 2.���� 3.���� 4.���� ���� �̴�
		// ����1) ��ü ������ 1���� �л� �̸� ���

		int maxN = 0;
		int idx = -1;

		int arr[] = new int[score.length];
		System.out.println(score.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] += Integer.parseInt(score[i][1]); // i=0->100 i=1->10...
			arr[i] += Integer.parseInt(score[i][2]); // 	 20       60 ...
			arr[i] += Integer.parseInt(score[i][3]); // 	 30       60...
//			System.out.println(arr[i]);
			if (maxN < arr[i]) {
				maxN = arr[i];
				idx = i;
			}
		}
		System.out.println("1���� ��ü����: " + maxN + "  �̸�: " + student[idx][0]);
	}

}
