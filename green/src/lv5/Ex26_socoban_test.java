package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Ex26_socoban_test {

	public static void main(String[] args) {
		// #���ڹݸ���Ŀ

				Scanner scan = new Scanner(System.in);
				Random ran = new Random();

				final int SIZE = 9;
				final int PLAYER = 2;
				final int WALL = 3;
				final int BALL = 4;
				final int GOAL = 5;

				int pY = 0;
				int pX = 0;

				int[][] map = new int[SIZE][SIZE];
				int[][] maker = new int[SIZE][SIZE];

				String fileName = "maker.txt";

				maker[pY][pX] = PLAYER;

				while (true) {
					System.out.println("[1]���ڹ� ����Ŀ");
					System.out.println("[2]���� �����ϱ�");
					System.out.println("[0]�����ϱ�");

					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();

					if (choice == 1) {

						while (true) {
							for (int i = 0; i < SIZE; i++) {
								for (int j = 0; j < SIZE; j++) {
									if (map[i][j] != 0 && maker[i][j] == PLAYER) {
										System.out.print("*\t");
									} else if (maker[i][j] == PLAYER) {
										System.out.print("��\t");
									} else if (map[i][j] == WALL) {
										System.out.print("��\t");
									} else if (map[i][j] == BALL) {
										System.out.print("��\t");
									} else if (map[i][j] == GOAL) {
										System.out.print("��\t");
									} else {
										System.out.print(map[i][j] + "\t");
									}
								}
								System.out.println("\n");
							}
							System.out.println();

							System.out.println("[�̵�] �� ��(1) ��(2) ��(3) ��(4)");
							System.out.println("[��ġ] �� ��(5) ��(6) ��(7)");
							System.out.println("[����] �� 0");

							int move = scan.nextInt();

							if (move == 1 || move == 2 || move == 3 || move == 4) {
								int yy = pY;
								int xx = pX;

								if (move == 1) {
									yy -= 1;
								} else if (move == 2) {
									yy += 1;
								} else if (move == 3) {
									xx -= 1;
								} else if (move == 4) {
									xx += 1;
								}

								if (SIZE <= yy || yy < 0) {
									continue;
								}
								if (SIZE <= xx || xx < 0) {
									continue;
								}

								maker[pY][pX] = 0;
								pY = yy;
								pX = xx;
								maker[pY][pX] = PLAYER;
							} else if (move == 5) {
								map[pY][pX] = WALL;
							} else if (move == 6) {
								map[pY][pX] = BALL;
							} else if (move == 7) {
								map[pY][pX] = GOAL;
							}
							else if(move == 0) {
								break;
							}

							// ---------------------------------------------------------------
							// ���� �����ϱ�

							String data = "";
							for (int i = 0; i < SIZE; i++) {
								for (int j = 0; j < SIZE; j++) {
									if (maker[i][j] == PLAYER) {
										data += PLAYER + " ";
									} else {
										data += map[i][j] + " ";
									}
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
							} 
							catch (Exception e) {
							}
						}
					//---------------------------------------------------------
					}
					else if(choice == 2) {
						//---------------------------------------------------------
						//���� �ҷ�����
						String data = "";
						
						File file = new File(fileName);
						FileReader fr = null;
						BufferedReader br = null;
						
						if(file.exists()) {
							try {
								fr = new FileReader(file);
								br = new BufferedReader(fr);
								
								while(true) {
									String line = br.readLine();
									if(line == null) {
										break;
									}
									
									data += line;
									data += "\n";
								}
								fr.close();
								br.close();
							} 
							catch (Exception e) {
							}
						}
						if(data.equals("")) {
							continue;
						}
						
						String[] info = data.split("\n");
						for(int i = 0; i < info.length; i++) {
							String[] temp = info[i].split(" ");
							for(int j = 0; j < temp.length; j++) {
								map[i][j] = Integer.parseInt(temp[j]);
							}
						}
						
						for(int i = 0; i < SIZE; i++) {
							for(int j = 0; j < SIZE; j++) {
								System.out.print(map[i][j] + "\t");
							}
							System.out.println("\n");
						}
						System.out.println();
					}
					else if(choice == 0) {
						break;
					}
				}
		



	}

}
