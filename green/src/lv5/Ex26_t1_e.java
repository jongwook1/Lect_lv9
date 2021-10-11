package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Ex26_t1_e {

	public static void main(String[] args) {
		// 플레이어가 돌아다니면서 폭탄 내려놓듯이 구조물을 설치 → 파일로 저장 후,
		// 콘솔종료 후 재실행 시에도 → 게임을 이어갈 수 있게 만들어보세요
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		final int SIZE = 9;
		final int PLAYER = 2;
		final int WALL = 3;
		final int BALL = 4;
		final int GOAL = 5;
		int wallCount = 0;
		int pY = 0;
		int pX = 0;

		int[][] map = new int[SIZE][SIZE];
		int[][] maker = new int[SIZE][SIZE];
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;

		String fileName = "maker.txt";
//플레이어배치
		while (true) {
			int y = rn.nextInt(SIZE);
			int x = rn.nextInt(SIZE);
			if (map[y][x] == 0) {
				pY = y;
				pX = x;
				map[y][x] = PLAYER;
				break;
			}
		}

//			maker[pY][pX] = PLAYER;
		while (true) {
			System.out.println("[1]소코반 메이커");
			System.out.println("[2]게임 시작하기(불러오기)"); // 저장된 맵이 있으면 -> 불러와서 게임시작
			System.out.println("[0]종료하기");

			int choice = sc.nextInt();

			if (choice == 1) {

//				boolean goal = false;

				while (true) {
					for (int i = 0; i < SIZE; i++) {
						for (int j = 0; j < SIZE; j++) {
							if (map[i][j] == PLAYER) {
								System.out.print("옷  ");
							} else if (map[i][j] == WALL) {
								System.out.print("◼︎  ");
							} else if (map[i][j] == BALL) {
								System.out.print("공  ");
							} else if (map[i][j] == GOAL) {
								System.out.print("골  ");
							} else {
								System.out.print(map[i][j] + "  ");
							}
						}
						System.out.println();
					}
					System.out.println();

					System.out.println("[이동] ▶ 상(5)하(2)좌(1)우(3)");
					System.out.println("[설치] ▶ 벽(7)공(8)골(9) ");
					System.out.println("[종료] ▶ 0");
					
					int move = sc.nextInt();

					if (move == 5 || move == 2 || move == 1 || move == 3) {
						int yy = pY;
						int xx = pX;
						int byy = ballY;
						int bxx = ballX;
						if (move == 5) {
							yy--;
							byy--;
						} else if (move == 2) {
							yy++;
							byy++;
						} else if (move == 1) {
							xx--;
							bxx--;
						} else if (move == 3) {
							xx++;
							bxx++;
						}

						if (SIZE <= yy || yy < 0) {
							continue;
						}
						if (yy < 0 || yy > SIZE - 1 || xx < 0 || xx > SIZE - 1 || map[yy][xx] == WALL
								|| map[yy][xx] == GOAL||map[yy][xx]==BALL)
							continue;
						
						if (map[pY][pX] != WALL && map[pY][pX] != BALL && map[pY][pX] != GOAL) {
							map[pY][pX] = 0;
						}
						pY = yy;
						pX = xx;
						map[pY][pX] = PLAYER;
					} else if (move == 7) {

						int yyW = pY;
						int xxW = pX;
						if (yyW >= 0 || yyW < SIZE || xxW >= 0 || xxW < SIZE) {
							if (map[yyW][xxW] == PLAYER)
								map[yyW][xxW] = WALL;
						}

					} else if (move == 8) {
						int yyB = pY;
						int xxB = pX;
						if (yyB >= 0 || yyB < SIZE || xxB >= 0 || xxB < SIZE) {
							if (map[yyB][xxB] == PLAYER)
								map[yyB][xxB] = BALL;
							ballY = yyB;
							ballX = xxB;
						}

					} else if (move == 9) {
						int yyG = pY;
						int xxG = pX;
						if (yyG >= 0 || yyG < SIZE || xxG >= 0 || xxG < SIZE) {
							if (map[yyG][xxG] == PLAYER)
								map[yyG][xxG] = GOAL;
						}
					}

					else if (move == 0) {	
						// 파일 저장하기
						String data = "";

						for (int i = 0; i < SIZE; i++) {
							for (int j = 0; j < SIZE; j++) {

								data += map[i][j] + " ";

							}
							if (i != SIZE - 1) {
								data += "\n";
							}
						}
						FileWriter fw = null;

						try {
							fw = new FileWriter(fileName);
							fw.write(data);
							fw.close();
							System.out.println("저장완료");

						} catch (Exception e) {
							e.printStackTrace();
						}
						
						break;
					}
			
				}

			} else if (choice == 2) {
				// 파일 불러오기
				String data = "";

				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;

				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);

					while (true) {
						String line = br.readLine();
						if (line == null) {
							break;
						}

						data += line;
						data += "\n";
					}
					String[] info = data.split("\n");
					for (int i = 0; i < info.length; i++) {
						String[] temp = info[i].split(" ");
						for (int j = 0; j < temp.length; j++) {
							map[i][j] = Integer.parseInt(temp[j]);
						}
					}
					for (int i = 0; i < SIZE; i++) {
						for (int j = 0; j < SIZE; j++) {
							if (map[i][j] == PLAYER) {
								pY = i;
								pX = j;
							} else if (map[i][j] == BALL) {
								ballY = i;
								ballX = j;
							}
						}
					}
					System.out.println("불러오기완료");
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				boolean goal = false;
				while(true) {
				
				
				for (int i = 0; i < SIZE; i++) {
					for (int j = 0; j < SIZE; j++) {
						if (map[i][j] == PLAYER) {
							System.out.print("옷  ");
						} else if (map[i][j] == WALL) {
							System.out.print("◼︎  ");
						} else if (map[i][j] == BALL) {
							System.out.print("공  ");
						} else if (map[i][j] == GOAL) {
							System.out.print("골  ");
						} else {
							System.out.print(map[i][j] + "  ");
						}
					}
					System.out.println();
				}
				System.out.println();
				
				System.out.println("[이동] ▶ 상(5)하(2)좌(1)우(3)");
				System.out.println("[종료] ▶ 0");
				
				if (goal) {
					System.out.println("goal!!!");
					break;
				}
				
				int move = sc.nextInt();
				
				if (move == 5 || move == 2 || move == 1 || move == 3) {
					int yy = pY;
					int xx = pX;
					int byy = ballY;
					int bxx = ballX;
					if (move == 5) {
						yy--;
						byy--;
					} else if (move == 2) {
						yy++;
						byy++;
					} else if (move == 1) {
						xx--;
						bxx--;
					} else if (move == 3) {
						xx++;
						bxx++;
					}

					if (SIZE <= yy || yy < 0) {
						continue;
					}
					if (yy < 0 || yy > SIZE - 1 || xx < 0 || xx > SIZE - 1 || map[yy][xx] == WALL
							|| map[yy][xx] == GOAL)
						continue;
					if (map[yy][xx] == BALL) {
						if (byy < 0 || byy > SIZE - 1 || bxx < 0 || bxx > SIZE - 1 || map[byy][bxx] == WALL)
							continue;
						else if (map[byy][bxx] == GOAL)
							goal = true;

						ballY = byy;
						ballX = bxx;
						map[ballY][ballX] = BALL;
					}
					if (map[pY][pX] != WALL && map[pY][pX] != BALL && map[pY][pX] != GOAL) {
						map[pY][pX] = 0;
					}
					pY = yy;
					pX = xx;
					map[pY][pX] = PLAYER;
				}else if(move==0) {
					break;
				}
				
				}
			} else if (choice == 0) {
				// 파일 저장하기
				String data = "";

				for (int i = 0; i < SIZE; i++) {
					for (int j = 0; j < SIZE; j++) {

						data += map[i][j] + " ";

					}
					if (i != SIZE - 1) {
						data += "\n";
					}
				}
				FileWriter fw = null;

				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
					System.out.println("저장완료");

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}

	}

}
