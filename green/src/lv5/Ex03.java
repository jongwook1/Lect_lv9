package lv5;

public class Ex03 {

	public static void main(String[] args) {
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		String result[] = str.split("/");
		int total = 0;
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(result[i]);
			total += arr[i];
		}
		System.out.println("arr�迭�� ����: " + total);

		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = { 11, 100, 89 };
		String text = "";

		for (int i = 0; i < scores.length; i++) {
			text += scores[i] + "";
			if (i != 2) {
				text += "/";
			}
		}
		System.out.println(text);
	}

}
