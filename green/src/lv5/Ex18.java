package lv5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int cnt = 0;
		int log = -1; // -1 �α׾ƿ�����
		String[] accs = new String[size];
		String[] pws = new String[size];
		int[] moneys = new int[size];
		String fileName = "atm.txt";
		while (true) {
//System.out.println("cnt  "+cnt);
			System.out.print("acc:");
			for (int i = 0; i < cnt; i++) {
				System.out.print(accs[i] + " ");
			}
			System.out.println();
			System.out.print("pws:");
			for (int i = 0; i < cnt; i++) {
				System.out.print(pws[i] + " ");
			}
			System.out.println();
			System.out.print("moneys:");
			for (int i = 0; i < cnt; i++) {
				System.out.print(moneys[i] + " ");
			}
			System.out.println();

			System.out.println("[ATM]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա�");
			System.out.println("[6]���");
			System.out.println("[7]��ü");
			System.out.println("[8]�ܾ���ȸ");
			System.out.println("[9]����");
			System.out.println("[10]�ε�");
			System.out.println("[0]����");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (log == -1) {
					if (cnt == 0) {
						accs = new String[1];
						pws = new String[1];
						moneys = new int[1];
					} else {
						String temp[] = new String[cnt + 1];
						String temp2[] = new String[cnt + 1];
						int temp3[] = new int[cnt + 1];

						for (int i = 0; i < cnt; i++) {
							temp[i] = accs[i];
							temp2[i] = pws[i];
							temp3[i] = moneys[i];
						}
						accs = temp;
						pws = temp2;
						moneys = temp3;
					}
					System.out.println("������ ���̵��Է��ϼ���");
					String id = sc.next();

					for (int i = 0; i < cnt; i++) {
						if (id.equals(accs[i])) {
							log = i;
						}
					}
					if (log != -1) {
						System.out.println("���ԵȾ��̵��Դϴ�");
					} else {
						System.out.println("��й�ȣ�Է��ϼ���");
						String pw = sc.next();
						accs[cnt] = id;
						pws[cnt] = pw;
						cnt++;
						System.out.println("���ԿϷ�");
					}
				}

			} else if (sel == 2) {
				if (log != -1) {
					System.out.println("Ż���� ���̵��Է��ϼ���");
					String dId = sc.next();
					System.out.println("Ż���� ����Է��ϼ���");
					String dPw = sc.next();
					if (cnt == 1) {
						accs = null;
						pws = null;
						moneys = null;
					} else {
						int dIdx = -1;

						for (int i = 0; i < cnt; i++) {
							if (dId.equals(accs[i]) && dPw.equals(pws[i])) {
								dIdx = i;
							}
						}
						if (dIdx != -1) {
							String temp[] = accs;
							String temp2[] = pws;
							int temp3[] = moneys;
							accs = new String[cnt - 1];	//0 1 2 3
							pws = new String[cnt - 1];
							moneys = new int[cnt - 1];

							int idx = 0;
//							System.out.println("cnt: "+cnt);
//							System.out.println("temp.length "+temp.length);
							for (int i = 0; i <= cnt-1; i++) {
								if (dIdx != i) {
									accs[idx] = temp[i];
									pws[idx] = temp2[i];
									moneys[idx] = temp3[i];
									idx++;
								}
							}
						}
					}
					cnt--;
					log=-1;
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("�α����� ���̵��Է��ϼ���");
					String inId = sc.next();
					System.out.println("�α����� ����Է��ϼ���");
					String inPw = sc.next();

					int check = -1;
					for (int i = 0; i < cnt; i++) {
						if (inId.equals(accs[i]) && inPw.equals(pws[i])) {
							check = 1;
							log = i;

						}
					}
					if (check != -1) {
						System.out.println(inId + "�� �α��εǼ̽��ϴ�");
					} else {
						System.out.println("�Ƶ�� ���Ȯ�����ּ���");
					}
				} else {
					System.out.println("�α׾ƿ����������ּ���");
				}
			} else if (sel == 4) {
				if (log != -1) {
					System.out.println(accs[log] + "�� �α׾ƿ��Ǽ̽��ϴ�");
					log = -1;
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 5) {
				if (log != -1) {
					System.out.println("�Ա��� �ݾ� �Է��ϼ���");
					int inMoney = sc.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (accs[i].equals(accs[log])) {
							moneys[i] += inMoney;
						}
					}
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 6) {
				if (log != -1) {
					System.out.println("����� �ݾ� �Է��ϼ���");
					int outMoney = sc.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (accs[i].equals(accs[log])) {
							if (moneys[i] >= outMoney) {
								moneys[i] -= outMoney;
								System.out.println(outMoney + " ����߽��ϴ�");
							} else {
								System.out.println("�ܾ��̺����մϴ� ��");
							}
						}
					}
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 7) {
				if (log != -1) {
					System.out.println("��ü�� �����Է����ּ���");
					String inAcc = sc.next();

					int check = -1;
					int idx = -1;
					for (int i = 0; i < cnt; i++) {
						if (inAcc.equals(accs[i])) {
							idx = i;
							check = 1;
						}
					}

					if (check == 1) {
						System.out.println("�Ա��� �ݾ��Է����ּ���");
						int outMoney = sc.nextInt();
						int check2 = -1;
						for (int i = 0; i < cnt; i++) {
							if (inAcc.equals(accs[i])) {
								if (outMoney < moneys[log]) {
									moneys[log] -= outMoney;
									moneys[idx] += outMoney;
									check2 = 1;
								}
							}
						}
						if (check2 == 1) {
							System.out.println("��ü�Ϸ�");
						} else {
							System.out.println("�ܾ��̺����մϴ� ��");
						}

					}
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 8) {
				if (log != -1) {
					System.out.println(accs[log] + "��");
					System.out.println("�����ܾ�: " + moneys[log]);
				} else {
					System.out.println("�α����� �������ּ���");
				}
			} else if (sel == 9) {
				String data = "";

				if(cnt>0) {
					for (int i = 0; i < cnt; i++) {
						data += accs[i];
						data += "/";
						data += pws[i];
						data += "/";
						data += moneys[i];
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
				}else {
					System.out.println("������������ �����ϴ�");
				}
				

			} else if (sel == 10) {

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
					String temp[] = data.split("\n"); // acc:q w e r/pw1 2 3 4 ���Է������� temp[0]->q/1/0 temp[1]->w/2/0...
					cnt = temp.length; // 4���Է������� cnt-> 4

					accs = new String[cnt];
					pws = new String[cnt];
					moneys = new int[cnt];
					for (int i = 0; i < cnt; i++) {
						String temp2[] = temp[i].split("/"); // temp2[0]->q temp2[1]->1 temp2[2]->0
						accs[i] = temp2[0];
						pws[i] = temp2[1];
						moneys[i] = Integer.parseInt(temp2[2]);
					}
					fr.close();
					br.close();

				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (sel == 0) {
				break;
			}
		}

	}

}
