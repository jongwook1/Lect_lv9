package lv5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "사과", "바나나", "딸기" };
		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		String fileName = "jang.txt";
		int cnt = 0;
		int log = -1;
		while (true) {
			System.out.println("[SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				if (log == -1) {
					System.out.println("아이디를 입력하세요");
					String inId = sc.next();
					System.out.println("비번을 입력하세요");
					String inPw = sc.next();
					for (int i = 0; i < ids.length; i++) {
						if (inId.equals(ids[i]) && inPw.equals(pws[i])) {
							log = i;
							System.out.println(inId + " 님 로그인되셨습니다");
						}
					}
				} else {
					System.out.println("로그아웃을 먼저해주세요");
				}

			} else if (sel == 2) {
				if (log != -1) {
					log = -1;
					System.out.println("로그아웃되셨습니다");
				} else {
					System.out.println("로그인 상태가아닙니다");
				}

			} else if (sel == 3) {
				if (log != -1) {
					boolean run = true;
					while (run) {
						for (int i = 0; i < items.length; i++) {
							System.out.printf("%d) %s\n", i + 1, items[i]);
						}
						System.out.println("0)뒤로가기");
						System.out.println("메뉴를 선택해주세요");
						int pick = sc.nextInt() - 1;
						if (pick == -1) {
							break;
						}
						if (pick >= 0 && pick < items.length) {
							jang[cnt][0] = log;
							jang[cnt][1] = pick;
							cnt++;
						}

					}
				} else {
					System.out.println("로그인을 먼저해주세요");
				}
			} else if (sel == 4) {
				int myItem[] = new int[items.length];

				if (log != -1) {
					for (int i = 0; i < cnt; i++) {
						if (jang[i][0] == log) {
							myItem[jang[i][1]]++;
						}
					}
					for (int i = 0; i < myItem.length; i++) {
						if (myItem[i] > 0) {
							System.out.print(items[i] + ": ");
							System.out.println(myItem[i] + "개");
						}
					}

				} else {
					System.out.println("로그인을 먼저해주세요");
				}

			} else if (sel == 5) {
				String data = "";

				if (cnt > 0) {
					for (int i = 0; i < cnt; i++) {
						data += jang[i][0];
						data += "/";
						data += jang[i][1];
						data += "\n";
					}
					data = data.substring(0, data.length() - 1);

					FileWriter fw = null;
					try {
						fw = new FileWriter(fileName);
						fw.write(data);
						System.out.println("저장완료");
						fw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("저장할 정보가 없습니다");
				}
			} else if (sel == 6) {
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
//					System.out.println(temp.length);
					cnt = temp.length;
//					jang=new int[cnt][2];			//초기화를 할필요가없음

					for (int i = 0; i < cnt; i++) {
						String temp2[] = temp[i].split("/");
						jang[i][0] = Integer.parseInt(temp2[0]);
						jang[i][1] = Integer.parseInt(temp2[1]);
					}
					for (int i = 0; i < cnt; i++) {
						System.out.print("로그정보 " + jang[i][0]);
						System.out.println("산물건: " + jang[i][1]);
					}
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
