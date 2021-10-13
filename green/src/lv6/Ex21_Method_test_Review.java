package lv6;

class Test99999 {
	void printEvenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	}

	void sumBetweenValues(int x, int y) {
		int total = 0;
		for (int i = x; i < y; i++) {
			total += i;
		}
		System.out.println(total);
	}

	void printPrimeNums(int primeNumber) {
		for (int i = 2; i < primeNumber; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}

public class Ex21_Method_test_Review {

	public static void main(String[] args) {
		Test99999 test = new Test99999();
		// ���� 1) a �� Ȧ������ ¦������ ���
		int a = 19;
		test.printEvenOrOdd(a);

		// ���� 2) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		// ����3) ���� 1���� ���ڷ� ����ؼ� 2���� ���ڱ����� �Ҽ� ���� ��� //1�� �ڱ��ڽ����θ� ����������¼�
		int primeNumber = 20;
		test.printPrimeNums(primeNumber);

	}

}