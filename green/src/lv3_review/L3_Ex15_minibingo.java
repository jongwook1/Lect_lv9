package lv3_review;

public class L3_Ex15_minibingo {

	public static void main(String[] args) {
		int arr[] = {
				0,0,0,
				0,0,0,
				3,3,3
		};

		//����1) �迭�� ���� ����3�پ� ���

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i%3==2) {
			System.out.println();
			}
		}
		
	}

}
