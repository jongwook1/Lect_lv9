package models;

import controller.ItemManager;
import controller.UserManager;

public class Shop {
	private UserManager um=UserManager.instance;
	private ItemManager im=ItemManager.instance;
	

	public void mainMenu() {
		boolean isRun=true;
		while(isRun) {
			printMenu();
			printAllData();
			String input=um.sc.next();
			int sel=Integer.parseInt(input);
			if(sel==0) {
				isRun=end();
			}
			else if(sel==1) {
				um.joinUser();
			}
			else if(sel==2) {
				um.outUser();
			}
			else if(sel==3) {
				if(um.logIn()) {
					loginMenu();
				}
			}
			else if(sel==4) {
				um.logOut();
			}
			else if(sel==100) {
				managerMenu();
			}
			
		}
	}
	
	private void managerMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.아이템관리] [2.카테고리관리] [3.유저관리] [4.판매현황] [0.뒤로가기] ");
			int sel = UserManager.sc.nextInt();
			if (sel == 1) {
				itemMenu();
			} else if (sel == 2) {
				categoryMenu();
			} else if (sel == 3) {
				userMenu();
			} else if (sel == 4) {
				salesStatus();
			} else if (sel == 0) {
				run = false;
			}
		}

	}

	private void salesStatus() {
		if(um.getUsers().size()>0) {
		for(int i=0;i<um.getUsers().size();i++) {
			im.printJang(um.getUsers().get(i));
			
		}
		}else {
			System.out.println("가입한 유저가없습니다");
		}
	}

	private void userMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.전체유저] [2.유저추가] [3.유저삭제] [0.뒤로가기]");
			int sel = UserManager.sc.nextInt();
			if (sel == 1) {
				this.printAllData();
			}else if(sel==2) {
				um.joinUser();
			} 
			else if(sel==3) {
				um.outUser();
			}
			else if (sel == 0) {
				run = false;
			}
		}
		
	}

	private void categoryMenu() {		
		boolean run = true;
		while (run) {
			System.out.println("[1.전체카테고리] [2.카테고리추가] [3.카테고리삭제] [0.뒤로가기]");
			int sel = UserManager.sc.nextInt();
			if (sel == 1) {
				im.printCategory();
			} else if (sel == 2) {
				im.addCategory();
			}else if(sel==3) {
				im.removeCategory();
			} 
			else if (sel == 0) {
				run = false;
			}
		}
	}

	private void itemMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.전체아이템] [2.아이템추가] [3.아이템삭제] [0.뒤로가기]");
			int sel = UserManager.sc.nextInt();
			if (sel == 1) {
				im.printItemList();
			} else if (sel == 2) {
				im.addItem();
			} else if (sel == 3) {
				im.removeItem();
			} else if(sel==0) {
				run = false;
				
			}
		}
		
	}

	private boolean end() {		
		return false;
	}

	private void loginMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.쇼핑] [2.장바구니목록] [0.뒤로가기]");
			int sel = UserManager.sc.nextInt();
			if (sel == 1) {
				shopMenu();
			} else if (sel == 2) {
				cartMenu();
			} else if (sel == 0) {
				break;
			}
		}
		
	}

	private void cartMenu() {
		while(true) {
			System.out.println("[1.내 장바구니] [2.삭제] [3.구입] [0.뒤로가기]");
			int sel=UserManager.sc.nextInt();
			if(sel==1) {
				im.printJang(um.getUsers().get(um.log));
			}
			////////////////////////////////////////////////////////////
			else if(sel==2) {
				im.removeCart(um.getUsers().get(um.log));
			}
			else if(sel==3) {
				im.buyItem(um.getUsers().get(um.log));
			}
			
			else if(sel==0) {}
			break;
		}
		
	}

	private void shopMenu() {
		while(true) {			
			im.printCategory();
			System.out.println("[카테] 번호를 입력하세요 [종료.-1]");
			int caId=UserManager.sc.nextInt();
			if(caId==-1) {
				break;
			}
			System.out.println("[아이템] 번호입력하세요");
			im.printItemList(caId);
			int itId=UserManager.sc.nextInt();
			im.addCart(um.getUsers().get(um.log).id,caId,itId);
		}
		
	}

	private void printAllData() {
		for(int i=0;i<um.getUsers().size();i++) {
			System.out.println(um.getUsers().get(i));
		}
		
	}

	public void printMenu(){
		System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]");
		System.out.println("[100.관리자] [0.종료]");
		System.out.println("메뉴선택");
	}
}
