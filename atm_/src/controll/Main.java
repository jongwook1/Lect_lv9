package controll;

import models.Bank;

public class Main {

	public static void main(String[] args) {
		// ���� �귣�带 �����ϰ�,
		Bank.instance.setBrand("Green");
		// ���� �ý����� run() �ϵ��� ȣ��
		BankManager.instance.run();

	}

}
