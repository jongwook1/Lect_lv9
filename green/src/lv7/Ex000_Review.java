package lv7;

class Client99 {
	String name;
	int score;

	void set_data(String n, int s) { // n�� s�� ���ڸ� �����ϴ� ���� "�Ű�����"
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
		st[0].set_data("��ö��", 100);
		st[1].set_data("�̸���", 20);
		st[2].set_data("�ڿ���", 70);

		for (int i = 0; i < st.length; i++) {
			st[i].print_data();
		}

	}

}
