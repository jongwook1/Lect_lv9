package lv6;
/*
 * # OMRī�� : Ŭ���� + �޼���
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

import java.util.Random;
import java.util.Scanner;

class Omr99{
	Scanner sc=new Scanner(System.in);
	Random rn=new Random();
	
	private int[] answer;
	private int[] hgd;
	
	int a=0;
	
	public Omr99(int answer[]) {
		this.answer=answer;		
	}
	
	public void randomMark() {
		this.hgd=new int[this.answer.length];
		for(int i=0;i<this.hgd.length;i++) {
			int rNum=rn.nextInt(5)+1;
			this.hgd[i]=rNum;
		}
	}

	public char[] check(int arr[]) {
		char[] result=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==this.answer[i]) {
				result[i]='O';
			}else {
				result[i]='X';
			}
		}
		return result;
	}
	
	public void printCard(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(this.hgd[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int resultScore() {
		int score=0;
		for(int i=0;i<this.hgd.length;i++) {
			if(this.hgd[i]==this.answer[i])
				score+=20;
		}
		return score;
	}
	
	public void run() {
		randomMark();
		printCard(check(this.hgd));
		System.out.println(resultScore());
	}
	
	
	
}

public class Ex24_OMR_Review {

	public static void main(String[] args) {
		int answer[]= {3,3,2,1,4};
		
		Omr99 omr=new Omr99(answer);
		omr.run();
	}

}
