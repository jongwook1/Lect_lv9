package lv7;
class Product9999 {
	String name;
	int price;
}
public class Ex00_Review {

	public static void main(String[] args) {
		//3ĭ ¥�� �迭�� 2�� �ʿ��ϸ� 2�����迭�� ����Ѵ�/
		int []arr=new int[3];
		int [][]darr=new int [2][3];
		
		//------------------------------
		// ���������� Ŭ������ �迭�� �ʿ��ϸ� 2�����迭ó�� �������Ѵ�. 
		Product9999 pr=new Product9999();
		pr.name="���ڱ�";
		pr.price=1000;
		
		//---------------------------------------
		Product9999 prList[]=new Product9999[2];
		prList[0]=new Product9999();
		prList[1]=new Product9999();
		
		prList[0].price = 10;
		prList[1].price = 20;

		prList[0].name = "�����";
		prList[1].name = "����";	

	}

}
