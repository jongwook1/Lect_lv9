package lv7;
//Ŭ���� �迭


// Ŭ���� ���
//	1. �������
//	2. �޼���
//��ü�� Ŭ������ ���̴� �����ϸ� ��ü null���¸� Ŭ����
class Product{
	String name;
	int price;
	
	void setData(String name, int price) {
		this.name=name;					//���� ���Ӱ� ���ǳ����� �ٸ�
		this.price=price;
	}
	void printData() {
		System.out.printf("%s : %d��\n",this.name, this.price);
	}
	
}

public class Ex000 {

	public static void main(String[] args) {
		
		
		// ���ڿ� �迭 : Ŭ���� �迭
		String users[]=new String[100];		//{null,null,null,null...}
		
		for(int i=0;i<10;i++) {
			System.out.println(users[i]);
		}
		
		//Ŭ���� �迭�� ����� �ʱ�ȭ
		// Ŭ������ �迭��[] =new Ŭ������[����];
		
		Product cart[]=new Product[100];	//{null,null,null,null...}
		for(int i=0;i<10;i++) {
			cart[i]=new Product();				//new!!!!
//			cart[i].name						//�ٷ������� new�� �ؾ� . ��ɾ� ����
			cart[i].setData("product"+(i+1), (i+1)*1000);
//			System.out.println(cart[i]);
			cart[i].printData();
			
		}
		
	}

}
