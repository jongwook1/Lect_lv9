package lv8;

import java.util.ArrayList;
import java.util.Scanner;



public class Ex06_tic_�� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//�÷��� ����, ���׸� Ÿ������ �Ϲ� �ڷ����� �迭�� ��üó�� ������ �� �ִ�.
		ArrayList<int []> arr=new ArrayList<>();
		int turn=1;
		
		
		for(int i=0;i<3;i++) {
//			arr.add(new int[i+1]);
//			System.out.println(arr.get(i));
//			for(int j=0;j<arr.get(i).length;j++) {
//				System.out.println(arr.get(i)[j]+" ");
//			}
		}
		
		System.out.println("check");
		
		//ƽ���� �����
		
		ArrayList<int []> tic= new ArrayList<int[]>();
		
		//set
		for(int i=0;i<3;i++) {
			tic.add(new int[3]);	//{0,0,0}
		}
		
		//run
		int win=0;
		while(true) {
			//print
			for(int i=0;i<tic.size();i++) {
				for(int j=0;j<tic.get(i).length;j++) {
					System.out.print(tic.get(i)[j]+" ");
				}
				System.out.println();
			}
			
			//end
			if(win!=0) {
				System.out.printf("p%d win!!",win);
			}
			
			//input
			System.out.printf("p%d Y:",turn);
			int y=sc.nextInt();
			System.out.printf("p%d X:",turn);
			int x=sc.nextInt();
			
			//check
			if(y<0||y>=tic.size()||x < 0 || x>=tic.get(0).length||tic.get(y)[x]!=0)
				continue;
			
			//mark ver1
//			tic.get(y)[x]=turn;
			
			//mark ver2
			int temp[]=tic.get(y);
			temp[x]=turn;
			tic.set(y, temp);
			
			//win check
			// -
			for(int i=0;i<tic.size();i++) {
				int cnt=0;
				for(int j=0;j<tic.get(i).length;j++) {
					if(tic.get(i)[j]==turn)
						cnt++;
				}
				if(cnt==3)
					win=turn;
			}
			
			// |
			for(int i=0;i<tic.size();i++) {
				int cnt=0;
				for(int j=0;j<tic.get(i).length;j++) {
					if(tic.get(j)[i]==turn)
						cnt++;
				}
				if(cnt==3)
					win=turn;
			}
			// \
			int cnt=0;
			for(int i=0;i<tic.size();i++) {
				if(tic.get(i)[i]==turn)
					cnt++;
			}
			if(cnt==3)
				win=turn;
			// /
			cnt=0;
			for(int i=0;i<tic.size();i++) {
				if(tic.get(i)[tic.get(i).length-i-1]==turn)
					cnt++;
			}
			if(cnt==3)
				win=turn;
			
			
			
			
			//turn
			turn = turn == 1 ? 2 : 1;
			
		}
		
		
	}

}
