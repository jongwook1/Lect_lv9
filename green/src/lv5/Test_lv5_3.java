package lv5;

//���� 19:00
//���� 19:25
//�ҿ� 00:25
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Test_lv5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vector = null;
		int cnt = 0;
		String fileName = "vector99.txt";
		while (true) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(vector[i] + " ");
			}
			System.out.println();
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				if (cnt == 0) {
					vector = new int[1];
				} else {
					int temp[] = vector;
					vector = new int[cnt + 1];

					for (int i = 0; i < cnt; i++) {
						vector[i] = temp[i];
					}
				}
				System.out.println("�߰��� �������Է��ϼ���");
				int data = sc.nextInt();
				vector[cnt] = data;
				cnt++;
			} else if (sel == 2) {
				System.out.println("������ �ε��� �Է�");
				int delIdx = sc.nextInt();
				if (cnt - 1 < delIdx || delIdx < 0) {
					System.out.println("�ش���ġ�� �����Ұ�");
					continue;
				}
				if (cnt == 1) {
					vector = null;
				} else {
					int temp[] = vector;
					vector = new int[cnt - 1];
					int idx = 0;
					for (int i = 0; i < cnt; i++) {
						if (i != delIdx) {
							vector[idx] = temp[i];
							idx++;
						}
					}
				}
				cnt--;
			} else if (sel == 3) {
				String data = "";
				if (cnt > 0) {
					for (int i = 0; i < cnt; i++) {
						data += vector[i];
						data += "\n";
					}
					data = data.substring(0, data.length() - 1);
					FileWriter fw = null;
					try {
						fw = new FileWriter(fileName);
						fw.write(data);
						System.out.println("����Ϸ�");
						fw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else if (sel == 4) {
				String data = "";
				FileReader fr = null;
				BufferedReader br = null;

				try {
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);
					while (true) {
						String line = br.readLine();
						if (line == null) {
							break;
						}
						data += line;
						data += "\n";
					}
					data = data.substring(0, data.length() - 1);
					String temp[] = data.split("\n");
					cnt = temp.length;
					vector = new int[cnt];
					for (int i = 0; i < cnt; i++) {
						vector[i] = Integer.parseInt(temp[i]);
					}
					System.out.println("�ҷ�����Ϸ�");
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

}
