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
			System.out.println("[1.�����۰���] [2.ī�װ�����] [3.��������] [0.�ڷΰ���] ");
			int sel = UserManager.sc.nextInt();
			if (sel == 1) {
				itemMenu();
			} else if (sel == 2) {
				categoryMenu();
			} else if (sel == 3) {
				userMenu();				
			}  else if (sel == 0) {
				run = false;
			}
		}
		
	}

	private void userMenu() {
		boolean run = true;
		while (run) {
			System.out.println("[1.��ü����] [2.�����߰�] [3.��������] [0.�ڷΰ���]");
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
			System.out.println("[1.��üī�װ�] [2.ī�װ��߰�] [3.ī�װ�����] [0.�ڷΰ���]");
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
			System.out.println("[1.��ü������] [2.�������߰�] [3.�����ۻ���] [0.�ڷΰ���]");
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
			System.out.println("[1.����] [2.��ٱ��ϸ��] [0.�ڷΰ���]");
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
			System.out.println("[1.�� ��ٱ���] [2.����] [3.����] [0.�ڷΰ���]");
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
			System.out.println("[ī��] ��ȣ�� �Է��ϼ��� [����.-1]");
			int caId=UserManager.sc.nextInt();
			if(caId==-1) {
				break;
			}
			System.out.println("[������] ��ȣ�Է��ϼ���");
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
		System.out.println("[1.����] [2.Ż��] [3.�α���] [4.�α׾ƿ�]");
		System.out.println("[100.������] [0.����]");
		System.out.println("�޴�����");
	}
}
