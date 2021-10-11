package lv6;
//���� 14:30
//���� 15:45
//�ҿ� 01:00
import java.util.Scanner;

class Tetris{
	Scanner sc=new Scanner(System.in);
	
//	String data="";
//	String block="";
	int x=0;
	int y=0;
	
	String[][] info;
	int blockYx[][];
	
	void printInfo() {
		for(int i=0;i<this.info.length;i++) {
			for(int j=0;j<this.info[i].length;j++) {
				System.out.print(this.info[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void init(String str) {
		String[] temp=str.split("\n");
		String[] temptemp=null;
		temptemp=temp[0].split(",");
		this.info=new String[temp.length][temptemp.length];
		for(int i=0;i<temp.length;i++) {
			temptemp=temp[i].split(",");
			for(int j=0;j<temptemp.length;j++) {
				this.info[i][j]=temptemp[j];
			}
		}
		printInfo();
	}
	
	
	void blockInit(String blk) {
		System.out.print("��� :");
		String[] bk=blk.split(",");
		for(int i=0;i<bk.length;i++) {
			System.out.print(bk[i]+" ");
		}
		blockYx=new int[bk.length][2];
	}
	
	void idxEnter() {
		System.out.println();
		System.out.println("y�ε��� �Է�");
		y=sc.nextInt();
		System.out.println("x�ε��� �Է�");
		x=sc.nextInt();
		
		boolean check=true;
		
		int idx=0;
		for(int i=x;i<x+blockYx.length;i++) {
			if(info[y][i].equals("1")) {
				check=false;
			}
			blockYx[idx][0]=y;
			blockYx[idx][1]=i;
			idx++;
		}		
		if (check == true) {
			for (int i = 0; i < blockYx.length; i++) {
				info[blockYx[i][0]][blockYx[i][1]] = "2";
			}
		} else {
			System.out.println("�����Ҽ����� �ڸ��Դϴ�");
		}
	}
}
public class Test_ex01 {

	public static void main(String[] args) {
		String data ="";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,1,1,1,1,1,1,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";	

		
		String block = "";
		block += "2,2,2,2";

		
		// ��ǥ y , x �� �Է¹ް� block �� �մ� ������ data �� ���� 
		// ��) 1, 1
		/*
		    "0,0,0,0,0,1,0,0,0,0\n";
			"0,2,2,2,2,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,1,1,1,1,1,1,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
		 */
		// ����) �� ! ���࿡ 2222�� 1�� ������ "�����Ҽ������ڸ��Դϴ�" ��� 
		// ��) 2, 3 ==> ���ڸ���2222 ��  3��° �ڸ��� 1�̱⶧���� �����Ҽ� ����.
		/*
	    "0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,2,2,2,2,0,0,0\n";  // 1�� ����Ƿ� �ȵǴ�. 
		"0,0,1,1,1,1,1,1,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,0,0,0,0,0\n";
	 */
		Tetris tr=new Tetris();
		
		tr.init(data);
		tr.blockInit(block);
		tr.idxEnter();
		tr.printInfo();
	}

}
