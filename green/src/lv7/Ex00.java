package lv7;
//Ŭ���� : ����� ���� �ڷ���()
//�� 1)�������
//�� 2)�޼���

//Ŭ��������
//class Ŭ������{}

class Bbang {
	String name;
	int price;
	
	// �޼��� : '���'������ �ڵ���� '��Ȱ��(����)' �� �� �ְ� ���� ��
	// �޼��� ����
	// �������ڷ��� �޼���� (�Ķ����){���๮;return;}
	
	void printInfo() {
		System.out.printf("%s : %d��\n",this.name,this.price);
//		return;
	}
	
	void setInfo(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	int  setPrice(int price) {
		this.price=price;
		return this.price;
	}
	
}

public class Ex00 {

	public static void main(String[] args) {
		// Ŭ���� �ʱ�ȭ(��ü�� ����)
		// Ŭ������ ������ =new Ŭ������();			//Ŭ������ �ڿ��ٴ� ()�� ��������
		
		
		//�޼��� ���(ȣ��)
		Bbang sick=new Bbang();		//�Ļ��ϳ��� ��ü����
		sick.setInfo("�Ļ�",3000);
		sick.printInfo();
		System.out.println(sick.setPrice(3500));
		sick.printInfo();

		//Ŭ���� �迭  (Ŭ�������������������ִ� �迭)
		// Ŭ������ �迭��[] =new Ŭ������[����];
		
		Bbang bongi[] =new Bbang[10];	//{null,null,null,null,null,null,null,null,null,null}
		bongi[0]=new Bbang();
		
		for(int i=0;i<bongi.length;i++) {
			System.out.println(bongi[i]);
		}
		
		
	}

}
