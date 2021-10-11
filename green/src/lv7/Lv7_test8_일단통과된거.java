package lv7;

//시작 09:25
//종료 
//소요

class Library2 {
	String name;
	int bookno;
	int no;
	int date;
	int stYear;
	int stMonth;
	int stDay;

	void print() {
		System.out.println("빌려간연도: " + this.stYear + " 달: " + this.stMonth + " 일 " + this.stDay);
	}
}

public class Lv7_test8_일단통과된거 {

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

		String temp2[] = rentalData.split("\n");

		int size = temp2.length - 1;

		Library2 lib[] = new Library2[size];

		for (int i = 0; i < size; i++) {
			lib[i] = new Library2();
			String[] info = temp2[i + 1].split("/");
			lib[i].bookno = Integer.parseInt(info[0]);
//			System.out.println(lib[i].bookno);
			lib[i].name = info[1];
			String[] data2 = info[2].split("-");
//			lib[i].data=Integer.parseInt(data2[2]);
			lib[i].stYear = Integer.parseInt(data2[0]);
			lib[i].stMonth = Integer.parseInt(data2[1]);
			lib[i].stDay = Integer.parseInt(data2[2]);
		}
		String temp[] = userData.split("\n");
		
		System.out.println("연체자의 정보");
		for (int i = 0; i < size; i++) {
			String[] info = temp[i + 1].split("/");

			lib[i].no = Integer.parseInt(info[0]);
			lib[i].bookno = Integer.parseInt(info[1]);
			lib[i].date = Integer.parseInt(info[2]);
//			System.out.println(lib[i].data);
			if (lib[i].date >= 8) {
				lib[i].no = Integer.parseInt(info[0]);
				System.out.printf("회원번호: %d  책번호: %d 책이름: %s ", lib[i].no, lib[i].bookno, lib[i].name);
				lib[i].print();
			}
		}

	}

}
