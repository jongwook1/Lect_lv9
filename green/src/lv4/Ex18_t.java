package lv4;

import java.util.Scanner;

public class Ex18_t {

	public static void main(String[] args) {
		//���Ͱ��� �� ���� ũ�Ⱑ �ٸ� 2�����迭�� �ݺ������� ����� (new Ű���带 ���� heap�� !����! ����)    
		
        int [][] arr = {	//stack
				{10,20,30},					//3
				{10,20,30,40,50},			//5
				{10,20,30,40}				//4
		};

        int info[]=new int [arr.length];	//{0,0,0}
        
        for(int i=0;i<arr.length;i++) {
        	info[i]=arr[i].length;		
  //      	System.out.println("arr[i]��"+arr[i].length+" ");
        }
        
        int temp[][]=new int [arr.length][];	//{null,null,null}
        for(int i=0;i<temp.length;i++) {		//temp.length--->3
        	temp[i]=new int[info[i]];		//new int[arr[i].length];		// {null,null,null} ���¿��� for���� ���� �� temp[i]=new int [info[i]];// {{0,0,0},null,null} // {{0,0,0},{0,0,0,0,0},null} // {{0,0,0},{0,0,0,0,0},{0,0,0,0}}        												
        	for(int j=0;j<temp[i].length;j++) {
        		temp[i][j]= arr[i][j];        		
        	}
        }
        for(int i=0;i<temp.length;i++) {
        	for(int j=0;j<temp[i].length;j++) {
        		System.out.print(temp[i][j]+" ");
        	}
        }
        System.out.println();
        

	}

}
