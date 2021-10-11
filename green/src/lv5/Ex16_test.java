package lv5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex16_test {

	public static void main(String[] args) {
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
		String fileName = "fileTest02.txt";
		
		int size = 0;
		String data = "";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				data += line;
				data += "\n";
			}
//			System.out.print(data);
			data = data.substring(0,data.length()-1);
//			System.out.println(data.length());
			String[] temp = data.split("\n");
//			for(int i=0;i<temp.length;i++) {
//				System.out.println(temp[i]);
//			}
			size = temp.length;
//			System.out.println(size);
			ids = new String[size];
			pws = new String[size];
			moneys = new int[size];
			
			for(int i = 0; i < size; i++) {
				String[] info = temp[i].split("/");
				ids[i] = info[0];
				pws[i] = info[1];
				moneys[i] = Integer.parseInt(info[2]);
			}
			
			for(int i = 0; i < size; i++) {
				System.out.println(ids[i] + "/" + pws[i] + "/" + moneys[i]);
			}
						
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}




	}

}
