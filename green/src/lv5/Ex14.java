package lv5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;



public class Ex14 {

	public static void main(String[] args) {
		// 김철수/20,이만수/30,이영희/40
		String[] names = { "김철수", "이만수", "이영희" };
		int[] ages = { 20, 30, 40 };
		String fileName = "fileTest01.txt";
		String data = "";

		for (int i = 0; i < names.length; i++) {
			data += names[i];
			data += "/";
			data += ages[i];
			if (i != 2) {
				data += ",";
			}
		}

		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("저장실패");
		}
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String data1 = br.readLine();
			System.out.println(data1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
