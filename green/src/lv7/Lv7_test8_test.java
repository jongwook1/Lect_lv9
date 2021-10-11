package lv7;

class Library {
	String name;
	int bookno;
	int no;
	int date;
	boolean good;

	int func(int month, int day) {

		int monthList[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// month = ���ۿ�, day = ���۳�¥
		// 12�� 4���� �������� ��´�.
		// ��¥���� 12�� 4���� ����.
		int days = 0;
		for (int i = 10; i < month - 1; i++) {
			days += monthList[i];
		}

		return days += day;
	}

	int solution(int stMonth, int stDay) {

		int startTotal = func(stMonth, stDay);
//		System.out.println(startTotal);

		// int endTotal = func(endMonth, endDay);
		return startTotal;
	}
}

public class Lv7_test8_test {

	public static void main(String[] args) {
		String rentalData = "";
		rentalData += "å��ȣ/å����/�뿩��¥/ȸ����ȣ\n";
		rentalData += "20122/���ʷξ���/2020-11-25/1001\n";
		rentalData += "40143/�ܱ��� ������ ����/2020-11-27/1003\n";
		rentalData += "54321/��ǻ��Ȱ��ɷ�/2020-11-27/1041\n";
		rentalData += "26543/�ƹ�ư,�ܱ���/2020-12-01/1034";

		String userData = "";
		userData += "ȸ����ȣ/å��ȣ/�뿩�ϼ�(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";

		// �� �����ʹ� ������ å �뿩 �������̴�.
		// ������ 12��4�� �̶�������� ��ü�� �̸� ��� 

		Library[] lib;

		String[] temp = userData.split("\n");
		int size = temp.length;

		lib = new Library[size];
		for (int i = 0; i < size; i++) {
			lib[i] = new Library();
		}

		for (int i = 0; i < size - 1; i++) {
			String[] info = temp[i + 1].split("/");

			lib[i].no = Integer.parseInt(info[0]);
			lib[i].bookno = Integer.parseInt(info[1]);
			lib[i].date = Integer.parseInt(info[2]);

//			System.out.println(lib[i].no);
//			System.out.println(lib[i].date);
//			System.out.println(lib[i].bookno);
		}

		// ��Ʈ�� ��� ���� Ȯ��.
		// 12�� 4���� �������� �뿩��¥�� ���Ͽ�, lib[i].date ���� ũ�� ��ü.

//		for(int i = 0; i < cont.length; i++) {
//			System.out.println(cont[i]);
//		}

		String[] temp2 = rentalData.split("\n");

		for (int i = 0; i < temp2.length - 1; i++) {

			int sdMonth = 12;
			int sdDay = 4;
			lib[i].func(sdMonth, sdDay);

			int ret = lib[i].func(sdMonth, sdDay);

			String[] info = temp2[i + 1].split("/");
			String[] date2 = info[2].split("-");

			int bookno = Integer.parseInt(info[0]);
			String bookname = info[1];
			int no = Integer.parseInt(info[3]);

			int stMonth = Integer.parseInt(date2[1]);
			int stDay = Integer.parseInt(date2[2]);
			lib[i].solution(stMonth, stDay);

			int ret2 = lib[i].solution(stMonth, stDay);

//			System.out.println(month);
//			System.out.println(day);
			// ��,��,���� �������� 12�� 4�Ͽ��� ���ش�.

			for (int j = 0; j < size; j++) {
				if (no == lib[j].no) {
					if (ret - ret2 > lib[j].date) {
						System.out.println(no + " " + bookno + " " + bookname + " ");
					}
				}
			}
		}

	}

}
