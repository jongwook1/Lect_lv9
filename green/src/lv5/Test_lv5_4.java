package lv5;

public class Test_lv5_4 {

	public static void main(String[] args) {
		
		String [][] student = {
				{"aaa","����","1001"}, 
				{"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} ,
				{"ddd" , "����","1004"}};
		String[][] score = {
				{"��ȣ" ,"����" , "����"},
				{"1001" ,"����","20"},
				{"1002" ,"����","50"},
				{"1003" ,"����","60"},
				{"1004" ,"����","17"},
				{"1001" ,"����","65"},
				{"1002" ,"����","15"},
				{"1003" ,"����","80"},
				{"1004" ,"����","70"},
				{"1001" ,"����","43"},
				{"1002" ,"����","90"},
				{"1003" ,"����","30"},
				{"1004" ,"����","70"}
		};
		
		// �л� ������ ������ ��� ������ �̴�
		// student ==> 1.id 2.�ּ� 3.��ȣ
		// score ==> 1.��ȣ 2.���� 3.���� 4.���� ���� �̴�
		// ����1) ��ü ������ 1���� �л� �̸� ���

		int tot[][] = new int[student.length][2];
//		System.out.println(score.length);
		for (int i = 0; i < tot.length; i++) {
			tot[i][0] = Integer.parseInt(student[i][2]);
//					System.out.println(tot[i][0]);
		}
		int maxNum = 0;
		int maxIdx = 0;

		for (int i = 1; i < score.length; i++) {
			int idx = -1;
			for (int j = 0; j < tot.length; j++) {
				if (Integer.parseInt(score[i][0]) == tot[j][0]) {
					idx = j;
				}
			}
			tot[idx][1] += Integer.parseInt(score[i][2]);

		}

		for (int i = 0; i < tot.length; i++) {
//			System.out.println(tot[i][1]);

		}

		for (int i = 0; i < tot.length; i++) {
			if (maxNum < tot[i][1]) {
				maxIdx = tot[i][0];
				maxNum = tot[i][1];
			}
		}
		System.out.println("1���л��� ��ȣ: " + maxIdx + "  1���л��� ����: " + maxNum);

		String name = "";

		for (int i = 0; i < student.length; i++) {
			if (Integer.parseInt(student[i][2]) == maxIdx) {
				name = student[i][0];
			}
		}
		System.out.println("��ü������ 1���� �л��̸�: " + name);

	}

}
