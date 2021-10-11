package lv8;
//시작 09:25
//종료 00:00
//소요 00:00
import java.util.ArrayList;
import java.util.Scanner;

class Tetris{
	Scanner sc=new Scanner(System.in);
    private ArrayList<ArrayList<Integer>> map = null; // 래퍼클래스 사용
    private ArrayList<ArrayList<Integer>> block =null;    
    
    private int row;		//행 
    private int col;		//열
    
    private int bRow;
    private int bCol;
    
    private int x;
    private int y;
    
    
    
    public Tetris(String map, String block){    	
    	this.row=getRow(map);
    	this.col=getCol(map);
    	this.bRow=getRow(block);
    	this.bCol=getCol(block);
    	setMap(map);
    	setBlock(block);
    }
    
    private void setMap(String data) {
    	this.map=new ArrayList<ArrayList<Integer>>();
//    	for(int i=0;i<this.row;i++) {
//    		ArrayList<Integer> temp=new ArrayList<Integer>();
//    		for(int j=0;j<this.col;j++) {
//    			temp.add(0);
//    		}
//    		this.map.add(temp);
//    	}
//    	System.out.println("kjajyhjughgfhf    :    "+a);
//    	ArrayList<Integer> n=new ArrayList<Integer>();
//    	ArrayList<Integer> n=Integer.parseInt(iden[0]);
//    	n.add(0)=Integer.parseInt(iden[0]);
    	for(int i=0;i<this.row;i++) {
    		String temp[]=data.split("\n");
    		String[] iden =temp[i].split(",");
    		
    		ArrayList<Integer> temp2=new ArrayList<Integer>();
    		for(int j=0;j<this.col;j++) {
    			int a=Integer.parseInt(iden[j]);
    			temp2.add(a);
    		}
    		this.map.add(temp2);
    	}
    }
    //2와 0구분해서
	private void setBlock(String data) {
		this.block = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<this.bRow;i++) {
			String temp[]=data.split("\n");
			String[] iden =temp[i].split(",");
			ArrayList<Integer> temp2=new ArrayList<Integer>();
			for(int j=0;j<this.bCol;j++) {
				int a=Integer.parseInt(iden[j]);
				if(a==2) {
    			temp2.add(a);
    			}
//				if(this.map.get(i).get(j)==2) {
//					this.y=i;
//					this.x=j;
//				}
			}
			this.block.add(temp2);
		}	
	}
    
    private int getRow(String data) {
    	String temp[]=data.split("\n");
    	return temp.length;
    }
    
    private int getCol(String data) {
    	String temp[]=data.split("\n");
    	String info[]=temp[0].split(",");
    	
    	return info.length;
    }
    
    private void moveUp() {
    	for(int i=0;i<this.row;i++) {
    		for(int j=0;j<this.col;j++) {
    			if(this.map.get(i).get(j)==2) {
    				
    			}
    		}
    	}
    }
    
    private void moveDown() {}
    private void moveL() {}
    private void moveRight() {}
    
    public void run() {
    	printGame();
//    	while(true) {
//    		//상 하 좌 우
//        	System.out.println("1.상 2.하 3.좌 4.우");
//    		int sel=sc.nextInt();
//    		if(sel==1) {
//    			moveUp();
//    		}
//    		else if(sel==2) {}
//    		else if(sel==3) {}
//    		else if(sel==4) {}
//    	}
    }
   
    private void printGame() {
    	for(int i=0;i<map.size();i++) {
    		for(int j=0;j<map.get(i).size();j++) {
    			System.out.print(map.get(i).get(j));
    		}
    		System.out.println();
    	}
    }
   
    	
    	
    	
    	
    	
    	
//		String temp[]=data.split("\n");
//		String temp2[]=block.split("\n");
//		String[][] info;
//		String[][] info2;
//		
//		String[] iden =temp[0].split(",");
//		String[] iden2=temp2[0].split(",");
//		
//		info=new String[temp.length][iden.length];
//		info2=new String[temp2.length][iden2.length];
//		
//		for(int i=0;i<temp.length;i++) {
//			iden=temp[i].split(",");
//			for(int j=0;j<info.length;j++) {
//				info[i][j]=iden[j];
//				System.out.print(info[i][j]+" ");
//			}
//			System.out.println();
//		}
		
    
//    
//    
    



    
    
    
}
public class lv8_test_01 {

	public static void main(String[] args) {
		String data ="";
		data += "2,0,0,0,0,1,0,0,0,0\n";
		data += "2,0,0,0,0,1,0,0,0,0\n";
		data += "2,2,2,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		
//		System.out.println(data);
		
		String block = "";
		block += "2,0,0\n";
		block += "2,0,0\n";
		block += "2,2,2\n";

//		System.out.println(block);
		
		// 문제   ==> "1)상  2)하 3)좌 4)우" 를 입력할때마다 해당방향으로 블록전체이동 
		// 조건) ==> 1은 지나갈수없다. 
		
		/*
		    "2,0,0,0,0,1,0,0,0,0\n";
			"2,0,0,0,0,1,0,0,0,0\n";
			"2,2,2,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
		 */
		
//		String temp[]=data.split("\n");
//		String temp2[]=block.split("\n");
//		String[][] info;
//		String[][] info2;
//		
//		String[] iden =temp[0].split(",");
//		String[] iden2=temp2[0].split(",");
//		
//		info=new String[temp.length][iden.length];
//		info2=new String[temp2.length][iden2.length];
//		
//		for(int i=0;i<temp.length;i++) {
//			iden=temp[i].split(",");
//			for(int j=0;j<info.length;j++) {
//				info[i][j]=iden[j];
//				System.out.print(info[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		Tetris t=new Tetris(data,block);
		t.run();
		
	}

}
