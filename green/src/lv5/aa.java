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

			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("추가할 내용을 적으시오");
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				data += s;
			} else if (sel == 2) {
				System.out.println("삭제할 부분을 적으시오");
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
					System.out.println("찾는 단어가 없습니다");
				else
					System.out.println("삭제완료");
			} else if (sel == 3) {
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("저장 완료");
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
				System.out.println("로드 완료");
			} else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}









	}

}
