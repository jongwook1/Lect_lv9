package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// # ������Ʈ�ѷ� 1����
		
		Scanner scan = new Scanner(System.in);

		String[] vector = null;
		int count = 0;

		String fileName = "vector2.txt";
		File file = new File(fileName);
		
		while (true) {
			
			//print vector.
			System.out.print("vector[i] : " + "[");
			for(int i = 0; i < count; i++) {
				System.out.print(vector[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if(count == 0) {
					vector = new String[1];
				}
				else {
					String temp[] = new String[count + 1];
					for(int i = 0; i < count; i++) {
						temp[i] = vector[i];
					}
					
					vector = temp;
				}
				System.out.print("�߰��� �ܾ �Է��ϼ��� : ");
				String addWord = scan.next();
				
				vector[count] = addWord;
				count ++;
				
			} 
			else if (sel == 2) {
				System.out.print("������ �ܾ �Է��ϼ��� : ");
				String delWord = scan.next();
				if(count == 1) {
					vector = null;
				}
				else {
					int delIdx = -1;
					for(int i = 0; i < count; i++) {
						if(vector[i].equals(delWord)) {
							delIdx = i;
						}
					}
				
					if(delIdx != -1) {
						int tempIdx = 0;
						String[] temp = new String[count -1];
						for(int i = 0; i < count; i++) {
							if(i != delIdx) {
								temp[tempIdx] = vector[i];
								tempIdx++;
							}
						}
						count --;
						vector = temp;
						temp = null;
					}
						
				}
				
			} 
			else if (sel == 3) {
				FileWriter fw = null;
				
				String data = "";
				for(int i = 0; i < count; i++) {
					data += vector[i];
					data += "\n";
				}
				
				data = data.substring(0,data.length()-1);
				
				try {
					fw = new FileWriter(file);
					fw.write(data);
					fw.close();
					System.out.println("����Ϸ�.");
				} catch (Exception e) {
					e.printStackTrace();
				}	
			} 
			else if (sel == 4) {
				if(file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						while(true) {
							String check = br.readLine();
							if(check == null) {
								break;
							}
							count++;
						}
						
						fr.close();
						br.close();
					} 
					catch (Exception e) {
					}
					
					vector = new String[count];
					
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						for(int i = 0; i < count; i++) {
							vector[i] = br.readLine();
						}
						fr.close();
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} 
			else if (sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}

		}



	}

}
