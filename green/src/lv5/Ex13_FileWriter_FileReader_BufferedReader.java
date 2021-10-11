package lv5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex13_FileWriter_FileReader_BufferedReader {

	public static void main(String[] args) {
		// ���� 
				// �� File ���� ��ü�� ����� �� -> �ݵ�� '����ó��'�� �ؾ��� 
				// ���� ���� 
				// FileWriter 
				try {
					FileWriter fw = new FileWriter("test.txt");
					fw.write("ȫ�浿");
					fw.close();
					
					System.out.println("����Ϸ�");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("�������");
				}
				// ���� �б� 
				// FileReader 
				// BufferedReader 
				FileReader fr = null;
				BufferedReader br = null;
				try {
					fr = new FileReader("test.txt"); // grab
					br = new BufferedReader(fr);
					String data = br.readLine(); // ���ο� ���ڿ��� �� ���ٸ� ���� 
					System.out.println("data: " + data);
					fr.close();
					br.close();
				} catch (Exception e) {
					// TODO: handle exception
				}

		
	}

}
