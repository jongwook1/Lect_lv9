package lv5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex16 {

	public static void main(String[] args) {
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		String fileName = "fileTest02.txt";

		FileReader fr = null;
		BufferedReader br = null;

		String data = "";
		int size = 0;

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
			data = data.substring(0, data.length() - 1);			//data.length() - 1은 마지막데이터뒤 빈문자열(29번째줄data+="\n" 으로 빈문자열로 끝나므로) 예외처리하기위해
//			System.out.println(data);
			String temp[] = data.split("\n");
//			System.out.println(temp.length);
			size = temp.length;
			ids = new String[temp.length];
			pws = new String[temp.length];
			moneys = new int[temp.length];

			for (int i = 0; i < temp.length; i++) {
				String temp2[] = temp[i].split("/");
				ids[i] = temp2[0];
				pws[i] = temp2[1];
				moneys[i] = Integer.parseInt(temp2[2]);
			}

			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < size; i++) {
			System.out.printf("아이디:%s 비번:%s 돈:%d\n", ids[i], pws[i], moneys[i]);
		}

	}

}
