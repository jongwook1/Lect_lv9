package lv2;
//��
public class Test15_lv2f {

	public static void main(String[] args) {
		// # ����2) �����̰� 1�ð� 20�е��� ������ ������� ���� ���� ���԰� 9 Ű���̴�
		//# 3�е��� �������� ��Ű���ΰ� ?
		
		int min=80;
		int workbam=9000;
		double bam=0;
		while(bam<=0) {		
			bam=workbam/min;			
			System.out.println("����: "+(bam*3)/1000+"kg");
		}
	}

}
