package lv5;

public class bb {

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
		
//		int[] arr = new int[score.length];
		int[][] tot = new int[student.length][2]; // {"�й�", "��������"}
//		String[][] name = new String[student.length][1];
		
//		for(int i = 0; i < name.length; i++) {
//			name[i][0] = student[i][0];
//			System.out.println(name[i][0]);
//		}
		
		for(int i = 0; i < tot.length; i++) {
			tot[i][0] = Integer.parseInt(student[i][2]);
			System.out.println(tot[i][0]);
		}
//			for(int j = 1; j < score.length; j++) {
//				if(score[i][0].equals(tot[i][0])) {
//					arr[i] += Integer.parseInt(score[i][2]);
//				}
//			}
		
		int maxNum = 0;
		int maxIdx = 0;
		// 1. score �迭�� ��ü �˻��ϸ鼭
		for(int i=1; i<score.length; i++) {
			//idx => �񱳸� ���� idx�� ���� �񱳸� �Ұǰ�?? (�й�)?
			int idx = -1;
			
			// score[i][0] �� tot[j][0] ��
			for(int j=0; j<tot.length; j++) {
				if(Integer.parseInt(score[i][0])==tot[j][0]) {
					idx = j;
				}
			}
			
			tot[idx][1] += Integer.parseInt(score[i][2]);
//			System.out.println(tot[idx][1]);
			
			if(maxNum < tot[idx][1]) {
				maxNum = tot[idx][1];
				maxIdx = tot[idx][0];
			}
			
		}
		System.out.println("�ִ밪 �й� : " + maxIdx);
		System.out.println("�ִ밪 : " + maxNum);
		
		// 2. �й� �������� ������ �� ���� ���� -> arr �迭�� 
		// 3. arr �迭���� �ְ��� ã�� 
		// 4. �ְ� ���� �й��� �������� -> student �迭�� �̸� �˻�
		String name = "";
		for(int i = 0; i < student.length; i++) {
			if(Integer.parseInt(student[i][2]) == maxIdx) {
				name = student[i][0];
			}
		}
		System.out.println("name = " + name);



	}

}
