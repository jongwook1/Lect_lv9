package lv8;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList�� Ȱ���� ��Ʈ�ѷ� ����
public class Ex01_�� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> arr	= new ArrayList<Integer>();
		
		while(true){
			System.out.println("size: "+ arr.size());
			for(Integer i : arr) {
				System.out.print(i+" ");
			}		
			
			System.out.println("\n1.�߰� 2.����  3. ����(�ε���)  4. ����(��) 5. ���� 0. ��������");
			System.out.println("�޴�����: ");
			int sel=sc.nextInt();
			
			if(sel==1) {
				System.out.println("�߰��� ��: ");
				Integer data =(Integer) sc.nextInt();
				
				if(arr.add(data)) {
					System.out.println("�߰��Ϸ�");
				}else {
					System.out.println("����");
				}
			}
			else if(sel==2) {
				System.out.println("������ �ε���: ");
				int idx=sc.nextInt();
				System.out.println("������ �� : ");
				Integer data =(Integer) sc.nextInt();
				arr.add(idx, data);				
			}
			else if(sel==3) {
				System.out.println("������ �ε���: ");
				int delIdx=sc.nextInt();
				arr.remove(delIdx);
			}
			else if(sel==4) {
				System.out.print("������ ��: ");
				Integer delData=(Integer)sc.nextInt();
				if(arr.remove(delData)) {
					System.out.println("�����Ϸ�");
				}else {
					System.out.println("������ ���� �ٽ� Ȯ���ϼ���");
				}				
			}
			else if(sel==5) {
				System.out.print("������ �ε��� �Է�: ");
				int setIdx=sc.nextInt();
				
				System.out.print("������ ��: ");
				Integer data=(Integer)sc.nextInt();
				arr.set(setIdx, data);
			}
			else if(sel==0) {
				int getIdx=sc.nextInt();				
				System.out.println(arr.get(getIdx));
				
			}
			
			
		}

	}

}
