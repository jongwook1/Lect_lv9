package lv5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex27_e {

	public static void main(String[] args) {
		/*
		 * # �ܼ� �Խ���
		 * 1. [����] �Ǵ� [����] ��ư�� ������ ������ ��ȣ�� ����ȴ�.
		 * 2. ���� ������ ��ȣ�� �ش�Ǵ� �Խñ۸� �� �� �ִ�.
		 * 3. 2���� �迭 board�� 0������ ������ 1������ �Խñ��� ������ �����Ѵ�.
		 * 4. �Խñ��� �߰��ϰ� ������ ������ ����������� ���� �����Ͱ� �ٷιٷ� ����ȴ�.
		 * 5. ����� ����Ǿ� �ִ� ������ �����Ѵٸ�, �ٷ� ������ �ҷ������� �����Ѵ�.
		 */
		Scanner scan = new Scanner(System.in);

		String fileName = "board.txt";

		String[][] board = null;
		int count = 0; // ��ü �Խñ� ��
		int pageSize = 5; // �� �������� ������ �Խñ� ��
		int curPageNum = 1; // ���� ������ ��ȣ
		int pageCount = 0; // ��ü ������ ����
		int startRow = 0; // ���� �������� �Խñ� ���� ��ȣ
		int endRow = 0; // ���� �������� �Խñ� ������ ��ȣ

		while (true) {
			// �ε�

			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);

				count = 0;
				while (true) {
					String check = br.readLine();
					if (check == null) {
						break;
					}
					count += 1;
				}

				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);

				if (count > 0) {
					board = new String[count][2];

					for (int i = 0; i < count; i++) {
						String[] temp = br.readLine().split("/");
						board[i][0] = temp[0];
						board[i][1] = temp[1];
					}
				}
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// ���� ������ ��ȣ
			pageCount = count / pageSize;
			if (count % pageSize > 0) {
				pageCount += 1;
			}

			startRow = (curPageNum - 1) * pageSize;
			endRow = startRow + pageSize;
			if (endRow > count) {
				endRow = count;
			}

			
			System.out.println("��ü ������ ��  : " + pageCount);

			System.out.println("======�Խ���======");
			System.out.println("��ü ���ñ� �� : " + count + "��");
			for (int i = startRow; i < endRow; i++) {
				System.out.println((i + 1) + "." + "���� : " + board[i][0]);
			}

			System.out.println("���� ������ : " + curPageNum);

			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");
			System.out.println("[0]����");

			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();

			// ���� ������
			if (choice == 1) {
				if (curPageNum == 1) {
					continue;
				} else {
					curPageNum -= 1;
				}
			}
			// ���� ������
			else if (choice == 2) {
				if (curPageNum > pageCount) {
					continue;
				} else {
					curPageNum += 1;
				}
			}
			// ���� �߰�
			else if (choice == 3) {
				if (count == 0) {
					board = new String[1][2];
				} else {
					String[][] temp = new String[count + 1][2];
					for (int i = 0; i < count; i++) {
						temp[i] = board[i];
					}
					board = temp;
					temp = null;
				}

				System.out.print("���� �Է� : ");
				String Headline = scan.next();

				System.out.print("���� �Է� : ");
				String text = scan.next();

				board[count][0] = Headline;
				board[count][1] = text;
				count++;

			}
			// idx�� �Է¹޾� ����.
			else if (choice == 4) {
				System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
				int delIdx = scan.nextInt();
				delIdx -= 1;

				if (count == 1) {
					board = null;
				} else if (count > 1) {
					String[][] temp = new String[count - 1][2];

					int tempIdx = 0;
					for (int i = 0; i < count; i++) {
						if (i != delIdx) {
							temp[tempIdx] = board[i];
							tempIdx += 1;
						}
					}

					board = temp;
					temp = null;
					count -= 1;
				}
			}
			// ����Ȯ�� �ϱ�.
			else if (choice == 5) {
				System.out.print("Ȯ���� ���� ��ȣ�� �Է��ϼ��� : ");
				int checkNum = scan.nextInt();
				checkNum -= 1;

				if (checkNum >= startRow && checkNum <= endRow) {
					System.out.println("����: " + board[checkNum][0]);
					System.out.println("���� : " + board[checkNum][1]);
				}
			} else if (choice == 0) {
				System.out.println("���� �Ǿ����ϴ�.");
				break;
			}

			// ����
			FileWriter fw = null;
			String data = "";
			for (int i = 0; i < count; i++) {
				data += board[i][0] + "/" + board[i][1];
				if (i != board.length - 1) {
					data += "\n";
				}
			}

			try {
				fw = new FileWriter(fileName);
				fw.write(data);
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
