package lv5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex27_e {

	public static void main(String[] args) {
		/*
		 * # 콘솔 게시판
		 * 1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다.
		 * 2. 현재 페이지 번호에 해당되는 게시글만 볼 수 있다.
		 * 3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다.
		 * 4. 게시글을 추가하고 삭제할 때마다 파일입출력을 통해 데이터가 바로바로 저장된다.
		 * 5. 실행시 저장되어 있는 파일이 존재한다면, 바로 파일을 불러오도록 설계한다.
		 */
		Scanner scan = new Scanner(System.in);

		String fileName = "board.txt";

		String[][] board = null;
		int count = 0; // 전체 게시글 수
		int pageSize = 5; // 한 페이지에 보여줄 게시글 수
		int curPageNum = 1; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지 개수
		int startRow = 0; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호

		while (true) {
			// 로드

			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);

				count = 0;
				while (true) {
					String check = br.readLine();
					if (check == null) {
						break;
					}
					count += 1;
				}

				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);

				if (count > 0) {
					board = new String[count][2];

					for (int i = 0; i < count; i++) {
						String[] temp = br.readLine().split("/");
						board[i][0] = temp[0];
						board[i][1] = temp[1];
					}
				}
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 현재 페이지 번호
			pageCount = count / pageSize;
			if (count % pageSize > 0) {
				pageCount += 1;
			}

			startRow = (curPageNum - 1) * pageSize;
			endRow = startRow + pageSize;
			if (endRow > count) {
				endRow = count;
			}

			
			System.out.println("전체 페이지 수  : " + pageCount);

			System.out.println("======게시판======");
			System.out.println("전체 개시글 수 : " + count + "개");
			for (int i = startRow; i < endRow; i++) {
				System.out.println((i + 1) + "." + "제목 : " + board[i][0]);
			}

			System.out.println("현재 페이지 : " + curPageNum);

			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();

			// 이전 페이지
			if (choice == 1) {
				if (curPageNum == 1) {
					continue;
				} else {
					curPageNum -= 1;
				}
			}
			// 이후 페이지
			else if (choice == 2) {
				if (curPageNum > pageCount) {
					continue;
				} else {
					curPageNum += 1;
				}
			}
			// 내용 추가
			else if (choice == 3) {
				if (count == 0) {
					board = new String[1][2];
				} else {
					String[][] temp = new String[count + 1][2];
					for (int i = 0; i < count; i++) {
						temp[i] = board[i];
					}
					board = temp;
					temp = null;
				}

				System.out.print("제목 입력 : ");
				String Headline = scan.next();

				System.out.print("내용 입력 : ");
				String text = scan.next();

				board[count][0] = Headline;
				board[count][1] = text;
				count++;

			}
			// idx를 입력받아 삭제.
			else if (choice == 4) {
				System.out.print("삭제할 번호를 입력하세요 : ");
				int delIdx = scan.nextInt();
				delIdx -= 1;

				if (count == 1) {
					board = null;
				} else if (count > 1) {
					String[][] temp = new String[count - 1][2];

					int tempIdx = 0;
					for (int i = 0; i < count; i++) {
						if (i != delIdx) {
							temp[tempIdx] = board[i];
							tempIdx += 1;
						}
					}

					board = temp;
					temp = null;
					count -= 1;
				}
			}
			// 내용확인 하기.
			else if (choice == 5) {
				System.out.print("확인할 제목 번호를 입력하세요 : ");
				int checkNum = scan.nextInt();
				checkNum -= 1;

				if (checkNum >= startRow && checkNum <= endRow) {
					System.out.println("제목: " + board[checkNum][0]);
					System.out.println("내용 : " + board[checkNum][1]);
				}
			} else if (choice == 0) {
				System.out.println("종료 되었습니다.");
				break;
			}

			// 저장
			FileWriter fw = null;
			String data = "";
			for (int i = 0; i < count; i++) {
				data += board[i][0] + "/" + board[i][1];
				if (i != board.length - 1) {
					data += "\n";
				}
			}

			try {
				fw = new FileWriter(fileName);
				fw.write(data);
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
