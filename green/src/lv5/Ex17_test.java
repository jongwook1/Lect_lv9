package lv5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex17_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vector = null;
		int cnt = 0;
		String fileName = "vector.txt";
		String data2[]=null;
		while (true) {
			
//			if (vector != null) {
//				for (int i = 0; i < vector.length; i++) {
//					System.out.print(vector[i] + " ");
//				}
//				System.out.println();
//			}			

			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("�߰��ҳ����Է��ϼ���");
				int inputD = sc.nextInt();
				if (cnt > 0) {
					int temp[] = vector;
					vector = new int[cnt + 1];

					for (int i = 0; i < temp.length; i++) {
						vector[i] = temp[i];
					}
				} else {
					vector = new int[1];
				}
				vector[cnt] = inputD;
				cnt++;
			} else if (sel == 2) {
				System.out.println("������ ��ġ�Է����ּ���(0���ͽ���)");
				int dIdx = sc.nextInt();

				if (vector != null && dIdx >= 0 && dIdx < cnt) {
					if (cnt == 1) {
						vector = null;
					} else {
						int temp[] = vector;
						vector = new int[cnt - 1];

						int idx = 0;
						for (int i = 0; i < temp.length; i++) {
							if (dIdx != i) {
								vector[idx] = temp[i];
								idx++;
							}
						}
					}
					cnt--;
				}

			} else if (sel == 3) {
					String data="";

				for (int i = 0; i < cnt; i++) {
					data += vector[i];
				}
				try {
					FileWriter fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
					System.out.println("����Ϸ�");

				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("�������");
				}
			} else if (sel == 4) {
				FileReader fr = null;
				BufferedReader br = null;

				String loadData = "";

				try {
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);

					while (true) {
						String loadD = br.readLine();

						if (loadD == null) {
							break;
						}
						loadData += loadD;
						loadData += "\n";
					}
					loadData = loadData.substring(0, loadData.length() - 1);
					String temp[] = loadData.split("\n");
					int size = temp.length;

					data2 = new String[size];
					for (int i = 0; i < size; i++) {
						data2[i] += temp[i];
					}

					for (int i = 0; i < data2.length; i++) {
						System.out.println(data2[i]);
					}
					fr.close();
					br.close();
				
					
//				String data="";
//				for (int i = 0; i < cnt; i++) {
//					data += vector[i];
//				}
//				
//				String temp[]=new String[cnt];
//				int check=0;
//				for(int i=0;i<cnt;i++) {
//					temp[i]=data;
//					check++;
//				}

//					if(check==check) {
//					
//						System.out.println(temp[0]);
//					
//					}else {
//						for(int i=0;i<check;i++) {
//						System.out.println(temp[i]);}
//					}
//					System.out.println("�ε��ѳ���\n" + br.readLine());
				
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
