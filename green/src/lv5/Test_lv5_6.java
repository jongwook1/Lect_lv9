package lv5;

public class Test_lv5_6 {

	public static void main(String[] args) {
		// ���ֱ���� ������ �����Ҽ�����. int �� long �� �����ʰ� �Ʒ��ձ��ϱ�
		String data1 = "123456789123456";

		String data2 = "88888888888888";

		// �� ���� ���� ���Ͻÿ� .

//		String temp1[]=new String[data1.length()];
//		String temp2[]=new String[data2.length()];

//		for(int i=0;i<temp1.length;i++) {
//			String temp1[i]=data1.split("");
//		}

		// ��Ʈ : �迭�� ��������~

			int temp1[]=new int[data1.length()];
			int temp2[]=new int[data2.length()];
			
			for(int i=0;i<temp1.length;i++) {
				int num=Integer.parseInt(data1.charAt(i)+"");				
				temp1[i]=num;
				System.out.println(temp1[i]);
			}
			
		
	}

}
