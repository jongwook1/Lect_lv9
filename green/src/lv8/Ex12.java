package lv8;

import java.util.Vector;

class Aa{
	int a;
	Aa(int a){
		this.a = a;
	}
}
class AaManager{
	Vector<Aa> Aalist = new Vector<Aa>();
}
public class Ex12 {

	public static void main(String[] args) {
	AaManager am = new AaManager();
	System.out.println(am.Aalist.isEmpty());	//true
	
		for(int i = 0; i < 10; i++) {
			am.Aalist.add(new Aa(i));
		}
		
		Vector<Aa> test = new Vector<Aa>();	// �Ǵٸ� ��ü�迭�� ����
		
		for(int i = 0; i < 4; i++) {
			test.add(am.Aalist.get(i)); 	// ������� ��ü �迭���� get()�޼ҵ带 ���� Aa ��ü�� '�ּ�'�� ������
		}
		System.out.println(am.Aalist.get(0));
		test.get(0).a  = 100;		//������ test �迭���� ��
		test.add(new Aa(99));
		// print am.Aalist
		for(int i = 0; i < 10; i++) {
			System.out.print(am.Aalist.get(i)+" ");	//am.Aalist�� ���
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(am.Aalist.get(i).a);	//am.Aalist�� ���
		}
		//print test
		for(int i=0;i<test.size();i++) {
			System.out.print(test.get(i)+" ");
		}
		System.out.println();
		for(int i=0;i<test.size();i++) {
			System.out.print(test.get(i).a+" ");
		}

	}

}
