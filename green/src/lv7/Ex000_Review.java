package lv7;

class Client99 {
	String name;
	int score;

	void set_data(String n, int s) { // n과 s는 인자를 저장하는 변수 "매개변수"
		this.name = n;
		this.score = s;
	}

	void print_data() {
		System.out.println(this.name + " : " + this.score);
	}
}

public class Ex000_Review {

	public static void main(String[] args) {
		Client99 st[] = new Client99[3];
		for (int i = 0; i < st.length; i++) {
			st[i] = new Client99();
		}
		st[0].set_data("김철수", 100);
		st[1].set_data("이만수", 20);
		st[2].set_data("박영희", 70);

		for (int i = 0; i < st.length; i++) {
			st[i].print_data();
		}

	}

}
