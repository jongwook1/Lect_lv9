package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Ex26_socoban_test11111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		final int SIZE = 9;
		final int PLAYER = 2;
		final int WALL = 3;
		final int BALL = 4;
		final int GOAL = 5;
		int wallCount=0;
		int pY = 0;
		int pX = 0;

		int[][] map = new int[SIZE][SIZE];
		int[][] maker = new int[SIZE][SIZE];
		int ballY=0;
		int ballX=0;
		int goalY=0;
		int goalX=0;
		
		String fileName = "maker.txt1";

		
		
		
//		maker[pY][pX] = PLAYER;
		while (true) {
			System.out.println("[1]소코반 메이커");
			System.out.println("[2]게임 시작하기"); // 저장된 맵이 있으면 -> 불러와서 게임시작
			System.out.println("[0]종료하기");

			int choice = sc.nextInt();

			if (choice == 1) {
				
				
				
				boolean goal=false;

				while (true) {
					for (int i = 0; i < SIZE; i++) {
						for (int j = 0; j < SIZE; j++) {
							 if (map[i][j] == PLAYER) {
								System.out.print("옷\t");
							} else if (map[i][j] == WALL) {
								System.out.print("◼︎\t");
							} else if (map[i][j] == BALL) {
								System.out.print("공\t");
							} else if (map[i][j] == GOAL) {
								System.out.print("골\t");
							} else {
								System.out.print(map[i][j] + "\t");
							}
						}
						System.out.println("\n");
					}
					System.out.println();
					

					System.out.println("[이동] ▶ 상(1)하(2)좌(3)우(4)");
					System.out.println("[설치] ▶ 벽(5)공(6)골(7) 플레이어배치(8)");
					System.out.println("[종료] ▶ 0");
					
					if(goal) {
						System.out.println("goal!!!");
						break;
					}
					

					int move = sc.nextInt();

					if(move ==1 || move==2||move==3||move==4) {
						int yy=pY;
						int xx=pX;
						int byy=ballY;
						int bxx=ballX;
						if(move==1) {
							yy--;
							byy--;							
						}
						else if(move==2) {
							yy++;
							byy++;
						}
						else if(move==3) {
							xx--;
							bxx--;							
						}
						else if(move==4) {
							xx++;
							bxx++;
						}
						
						if(SIZE<=yy||yy<0) {
							continue;
						}
						if(yy<0||yy>SIZE-1||xx<0||xx>SIZE-1||map[yy][xx]==WALL||map[yy][xx]==GOAL) continue;
						if(map[yy][xx] == BALL) {
							if(byy < 0 || byy > SIZE-1 || bxx < 0 || bxx > SIZE-1 || 
									map[byy][bxx] == WALL) continue;
							else if(map[byy][bxx] == GOAL) goal = true;

							ballY = byy;
							ballX = bxx;
							map[ballY][ballX] = BALL;
						}
						map[pY][pX]=0;
						pY=yy;
						pX=xx;
						map[pY][pX]=PLAYER;
					}
					else if(move==5) {
						// Wall 설치
						System.out.println("벽 개수 입력");
						wallCount=sc.nextInt();
						for(int i=0;i<wallCount+1;i++) {
							int y=rn.nextInt(SIZE);
							int x=rn.nextInt(SIZE);
							if(map[y][x]==0) {								
									map[y][x]=WALL;								
							}else {
								i--;
							}
						}
			
					}else if(move==6) {
						while(true) {
							int y=rn.nextInt(SIZE-2)+1;
							int x=rn.nextInt(SIZE-2)+1;
							if(map[y][x]==0) {
								int check=0;
								for(int i=-1;i<=1;i++) {
									if(y+i>=0 &&y+i<SIZE&&map[y+i][x]!=0)	check++;
									if(x+i>=0 &&x+i<SIZE&&map[x+i][x]!=0)	check++;
									
								}
								if(check<=1) {
									ballY=y;
									ballX=x;
									map[ballY][ballX]=BALL;
									break;
								}
							}
						}
						
					}else if(move==7) {
						for(int i=0;i<wallCount+1;i++) {
							int y=rn.nextInt(SIZE);
							int x=rn.nextInt(SIZE);
							if(map[y][x]==0) {
								if(i==wallCount) {
									map[y][x]=GOAL;
									}								
							}else {
								i--;
							}
						}
					}else if(move==8) {
						
						while(true) {
							int y = rn.nextInt(SIZE);
							int x = rn.nextInt(SIZE);
							if(map[y][x] == 0) {
								pY = y;
								pX = x;
								map[pY][pX] = PLAYER;
								break;
							}
						}
						
					}
					
					else if(move==0) {
						break;
					}
		

				}
				

			}else if(choice==2) {
				System.out.println("1.저장 2.로드");
				int sel = sc.nextInt();
				if (sel == 1) {
					
					//파일 저장하기
					String data="";
					
					for(int i=0;i<SIZE;i++) {
						for(int j=0;j<SIZE;j++) {
							if(maker[i][j] == PLAYER) {
								data+= PLAYER+" ";
							}else {
								data+=map[i][j]+" ";
							}
						}
						if(i!=SIZE-1) {
							data+="\n";
						}
					}
					FileWriter fw=null;
					
					try {
						fw=new FileWriter(fileName);
						fw.write(data);
						fw.close();
						System.out.println("저장완료");
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					
					
					
					
					
					
					
					
					
					
					

				} else if (sel == 2) {
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
						fr.close();
						br.close();
					} catch (Exception e) {
					}

					if (data.equals(" ")) {
						continue;
					}

					String[] info = data.split("\n");
					for (int i = 0; i < info.length; i++) {
						String[] temp = info[i].split(" ");
						for (int j = 0; j < temp.length; j++) {
							map[i][j] = Integer.parseInt(temp[j]);
						}
					}

//				for(int i = 0; i < SIZE; i++) {
//					for(int j = 0; j < SIZE; j++) {
//						System.out.print(map[i][j] + "\t");
//					}
//					System.out.println("\n");
//				}
//				System.out.println();
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

				}
			}
			else if(choice==0) {
				break;
			}
		}

	}

}
