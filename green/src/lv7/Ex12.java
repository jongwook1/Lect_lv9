package lv7;

class Test9999 {
	int num;
	int size;
	char[] data;

	void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

//	void setInfo(int num,int size,char data) {
//		this.num=num;
//		this.size=size;
//		
//	}

}

public class Ex12 {

	public static void main(String[] args) {
		String data = "6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);
		System.out.println("--------------------");
		Test9999[] t;
		// data의 정보를 클래스배열에 저장.

		String temp1[] = data.split("\n");
//		"0/2/a/b\n";
//		"1/3/a/b/c\n";
//		 "2/5/a/b/c/d/e\n";
//		 "3/4/a/b/c/d\n";
//		 "4/3/a/b/c\n";
//		 "5/1/a";
		int cnt = Integer.parseInt(temp1[0]);
		System.out.println("cnt: " + cnt);
		t = new Test9999[cnt];

		for (int i = 0; i < cnt; i++) {
			t[i] = new Test9999();
			String[] temp2 = temp1[i + 1].split("/");
			
			t[i].num = Integer.parseInt(temp2[0]);
			t[i].size = Integer.parseInt(temp2[1]);
			t[i].data = new char[t[i].size];
			for (int j = 2; j < temp2.length; j++) {
				t[i].data[j - 2] = temp2[j].charAt(0);
			}
			t[i].print();
		}

	}

}
