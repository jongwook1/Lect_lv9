package lv7;

class Library {
	String name;
	int bookno;
	int no;
	int date;
	boolean good;

	int func(int month, int day) {

		int monthList[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// month = 시작월, day = 시작날짜
		// 12월 4일을 기준으로 잡는다.
		// 날짜에서 12월 4일을 뺀다.
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
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";

		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";

		// 위 데이터는 도서관 책 대여 데이터이다.
		// 오늘은 12월4일 이라고했을때 연체자 이름 출력 

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

		// 렌트한 사람 내역 확인.
		// 12월 4일을 기준으로 대여날짜를 비교하여, lib[i].date 보다 크면 연체.

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
			// 연,월,일을 기준으로 12월 4일에서 빼준다.

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
