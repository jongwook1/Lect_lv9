package lv5;

//시작 19:00
//종료 19:25
//소요 00:25
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
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			System.out.print("메뉴 선택 : ");
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
				System.out.println("추가할 데이터입력하세요");
				int data = sc.nextInt();
				vector[cnt] = data;
				cnt++;
			} else if (sel == 2) {
				System.out.println("삭제할 인덱스 입력");
				int delIdx = sc.nextInt();
				if (cnt - 1 < delIdx || delIdx < 0) {
					System.out.println("해당위치는 삭제불가");
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
						System.out.println("저장완료");
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
					System.out.println("불러오기완료");
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
