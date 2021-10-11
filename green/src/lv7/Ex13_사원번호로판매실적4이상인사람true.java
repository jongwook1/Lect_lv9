package lv7;

class Member9999 {
	int no;
	int point;
	String name;
	boolean best;

	void setInfo1(int no, String name) {
		this.no = no;
		this.name = name;
	}

	void print() {
		System.out.printf("사번: %d  점수: %d 이름: %s 베스트: %b ", this.no, this.point, this.name, this.best);
		System.out.println();
	}

}

public class Ex13_사원번호로판매실적4이상인사람true {

	public static void main(String[] args) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";

		// data1 은 사원번호와 판매실적이다.
		// data2 는 사원번호와 이름이다.
		// 판매실적이 4이상인사원은 best를 true로 저장하세요.

		// 위데이터를 파싱 해서 Member 클래스 배열을 완성후 출력해보세요.
		Member9999[] memberList = null;

		String temp1[] = data2.split(",");
		int cnt = temp1.length;
		System.out.println("cnt: " + cnt);
		memberList = new Member9999[cnt];

		for (int i = 0; i < cnt; i++) {
			memberList[i] = new Member9999();
			String temp2[] = temp1[i].split("/");
//			memberList[i].no=Integer.parseInt(temp2[0]);
//			memberList[i].name=temp2[1];
			memberList[i].setInfo1(Integer.parseInt(temp2[0]), temp2[1]);
//			System.out.println(memberList[i].no);
		}
		String temp3[] = data1.split(",");
		int cnt2 = temp3.length;

		for (int i = 0; i < cnt2; i++) {
			String temp4[] = temp3[i].split("/");
			for (int j = 0; j < cnt; j++) {
				if (Integer.parseInt(temp4[0]) == memberList[j].no) {
					memberList[j].point += Integer.parseInt(temp4[1]);
				}
			}
		}

		for (int i = 0; i < cnt; i++) {
			if (memberList[i].point >= 4) {
				memberList[i].best = true;
				memberList[i].print();
			} else {
				memberList[i].print();
			}
		}

	}

}
