package lv5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.annotation.processing.Filer;



public class aa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vector = null;
		int count = 0;

		String data = "";

		String fileName = "vector2.txt";

		while (true) {

			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("�߰��� ������ �����ÿ�");
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				data += s;
			} else if (sel == 2) {
				System.out.println("������ �κ��� �����ÿ�");
				Scanner sc = new Scanner(System.in);
				String s = sc.next();
				int i;
				for (i = 0; i < data.length() - s.length() + 1; i++) {
					if (data.valueOf(i).equals(s.valueOf(0))) {
						if (data.substring(i, s.length() + i).equals(s)) {
							String text = data.substring(0, i) + data.substring(i + s.length(), data.length());
							data = text;
							break;
						}
					}

				}
				if (i == data.length() - s.length() + 1)
					System.out.println("ã�� �ܾ �����ϴ�");
				else
					System.out.println("�����Ϸ�");
			} else if (sel == 3) {
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("���� �Ϸ�");
			} else if (sel == 4) {
				FileReader fr = null;
				BufferedReader br = null;
				try {
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);
					while (true) {
						String s = br.readLine();
						if (s == null)
							break;
						data += s;
					}
					fr.close();
					br.close();
					System.out.print(data+"\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("�ε� �Ϸ�");
			} else if (sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}









	}

}
