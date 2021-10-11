package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex18_test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int size = 5;
		int count = 0;
		int log = -1;

		String[] accs = null;
		String[] pws = null;
		int[] money = null;

		String fileName = "atmtest.txt";
		File file = new File(fileName);

		while (true) {
			// print accs, pws, moeny.
			System.out.print("accs[i] : " + "[");
			for (int i = 0; i < count; i++) {
				System.out.print(accs[i] + " ");
			}
			System.out.print("]");
			System.out.println();

			// pws
			System.out.print("pws[i] : " + "[");
			for (int i = 0; i < count; i++) {
				System.out.print(pws[i] + " ");
			}
			System.out.print("]");
			System.out.println();

			// money
			System.out.print("money[i] : " + "[");
			for (int i = 0; i < count; i++) {
				System.out.print(money[i] + " ");
			}
			System.out.print("]");
			System.out.println();

			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					if (count == 0) {
						accs = new String[1];
						pws = new String[1];
						money = new int[1];
//						System.out.println("더이상 가입하실 수 없습니다.");
//						continue;
					}
					else {
						String[] temp = new String[count + 1];
						String[] temp2 = new String[count + 1];
						int[] temp3 = new int[count + 1];
						
						for(int i = 0; i < count; i++) {
							temp[i] = accs[i];
							temp2[i] = pws[i];
							temp3[i] = money[i];
						}
						
						accs = temp;
						pws = temp2;
						money = temp3;
					}
					System.out.print("가입할 Id를 입력하세요 : ");
					String newId = scan.next();

					log = -1;
					for (int i = 0; i < count; i++) {
						if (newId.equals(accs[i])) {
							log = i;
						}
					}

					if (log != -1) {
						System.out.println("이미 가입된 ID입니다.");
					} else {
						System.out.print("비밀번호를 입력하세요 : ");
						String newPw = scan.next();

						accs[count] = newId;
						pws[count] = newPw;
						count++;
						System.out.println("가입이 완료되었습니다.");
					}
				}
			} else if (sel == 2) {
				if (log != -1) {
					System.out.print("탈퇴할 ID를 입력하세요 : ");
					String outId = scan.next();
					
					System.out.print("탈퇴할 PW를 입력하세요 : ");
					String outPw = scan.next();
					if(count == 1) {
						accs = null;
						pws = null;
						money = null;
					}
					else {

						int delIdx = -1;
						for (int i = 0; i < count; i++) {
							if (outId.equals(accs[i]) && outPw.equals(pws[i])) {
								delIdx = i;
							}
						}

						if (delIdx != -1) {
							int tempIdx = 0;
							int tempIdx2 = 0;
							int tempIdx3 = 0;
							String[] temp = new String[count -1];
							String[] temp2 = new String[count -1];
							int[] temp3 = new int[count -1];
							for (int i = delIdx; i < count; i++) {
								if (i != count - 1) {
									temp[tempIdx] = accs[i];
									temp2[tempIdx2] = pws[i];
									temp3[tempIdx3] = money[i];
									tempIdx++;
									tempIdx2++;
									tempIdx3++;
								}
							}
							count--;
							accs = temp;
							pws = temp2;
							money = temp3;
							
							temp = null;
							temp2 = null;
							temp3 = null;
						}

//						accs[count - 1] ="";
//						pws[count - 1] = "";
//						money[count - 1] = 0;
//						count--;
						log = -1;
						
					}
				}
				else {
					System.out.println("로그인 상태에서 이용가능");
				}
			} 
			else if (sel == 3) {
				if(log == -1) {
					System.out.print("ID를 입력하세요 : ");
					String myId = scan.next();
					
					System.out.print("PW를 입력하세요 : ");
					String myPw = scan.next();
					
					int check = -1;
					for(int i = 0; i < count; i++) {
						if(myId.equals(accs[i]) && myPw.equals(pws[i])) {
							check = 1;
							log = i;
						}
					}
					
					if(check != -1) {
						System.out.println(accs[log] + "님 로그인 하셨습니다.");
					}
					else {
						System.out.println("Id와 Pw를 확인하세요.");
					}
				}
				else {
					System.out.println("로그아웃 상태에서만 이용가능.");
				}
			} 
			else if (sel == 4) {
				if(log != -1) {
					System.out.println(accs[log] +"님 로그아웃 되었습니다.");
					log = -1;
				}
				else {
					System.out.println("로그인 상태에서만 이용가능.");
				}
			} 

			else if (sel == 5) {
				if(log != -1) {
					System.out.print("입금할 금액을 입력하세요 : ");
					int addMoney = scan.nextInt();
					
					for(int i = 0; i < count; i++) {
						if(accs[log].equals(accs[i])) {
							money[i] += addMoney;
						}
					}
				}
				else {
					System.out.println("로그인 상태에서만 이용가능.");
				}
			} 
			else if (sel == 6) {
				if(log != -1) {
					System.out.print("출금할 금액을 입력하세요 : ");
					int outMoney = scan.nextInt();
					
					for(int i = 0; i < count; i++) {
						if(accs[log].equals(accs[i])) {
							if(money[i] >= outMoney) {
								money[i] -= outMoney;
								System.out.println("출금하였습니다.");
							}
							else {
								System.out.println("잔액이 부족합니다.");
							}
						}
					}
				}
			} 
			else if (sel == 7) {
				if(log != -1) {
					System.out.print("이체할 계좌번호를 입력하세요 : ");
					String sendAcc = scan.next();
					
					int check = -1;
					int idx = 0;
					for(int i = 0; i < count; i++) {
						if(sendAcc.equals(accs[i])) {
							check = 1;
							idx = i;
						}
					}
					
					if(check != -1) {
						System.out.print("입금할 금액을 입력하세요 : ");
						int sendMoney = scan.nextInt();
						
						int check2 = -1;
						for(int i = 0; i < count; i++) {
							if(money[i] >= sendMoney) {
								money[i] -= sendMoney;
								money[idx] += sendMoney;
								check2 = 1;
							}
						}
						
						if(check2 != -1) {
							System.out.println("이체완료");
						}
						else {
							System.out.println("잔액이 부족합니다.");
						}
					}
				}
				else {
					System.out.println("로그인 상태에서만 이용가능.");
				}
			} 
			else if (sel == 8) {
				if(log != -1) {
					System.out.println(accs[log] + "님" + "현재잔액 : " + money[log] + "원");
				}
				else {
					System.out.println("로그인 상태에서만 이용가능.");
				}
			} 
			else if (sel == 9) {
				FileWriter fw = null;
				
				String data = "";
				for(int i = 0; i <count; i++) {
					data += accs[i];
					data += "/";					
					data += pws[i];
					data += "/";
					data += money[i];
					data += "\n";
				}
				
				data = data.substring(0,data.length()-1);
//				data2 = data2.substring(0,data.length()-1);
//				data3 = data3.substring(0,data.length()-1);
				
				try {
					fw = new FileWriter(file);
					fw.write(data);
					fw.close();
					System.out.println("저장완료");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			} 
			else if (sel == 10) {
			FileReader fr = null;
			BufferedReader br = null;
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					while(true) {
						String check = br.readLine();
						if(check == null) {
							break;
						}	
						count++;
					}
					fr.close();
					br.close();
				} catch (Exception e) {
				}
				
				String[] temp = new String[count];				
			
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					for(int i = 0; i < count; i++) {
						temp[i] = br.readLine();
					}
					
					fr.close();
					br.close();
				} catch (Exception e) {
				}
				
				// temp data를 split해서 -> accs, pws, money
				if(count != 0) {
					accs = new String[count];
					pws = new String[count];
					money = new int[count];
				}
				for(int i = 0; i < count; i++) {
					// temp[0] : "a/1/3000"
					// info : {"a","1","3000"} 
					String[] info = temp[i].split("/");
					
					accs[i] = info[0];
					pws[i] = info[1];
					money[i] = Integer.parseInt(info[2]);
				}
				
				
			} 
			else if (sel == 0) {
				System.out.println("종료되었습니다.");
				break;
			}
		}





	}

}
