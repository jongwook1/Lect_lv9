package lv7;
class Member777{
	int no;
	int point;
	String name;
	boolean best;
	
	void setInfo(int no, String name) {
		this.no=no;
		this.name=name;
	}
	
	void printInfo() {
		System.out.printf("%d %s : point %d",this.no,this.name,this.point);
		if(this.best) 
			System.out.print("<-BEST");		
		System.out.println();
	}
	
}
public class Ex13_�����ȣ���ǸŽ���4�̻��λ��true_�� {

	public static void main(String[] args) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";		//->
		String data2 = "1001/�̸���,1002/��ö��,1003/�Źξ�,1004/�ڻ��";		//->
		
		// data1 �� �����ȣ�� �ǸŽ����̴�.
		// data2 �� �����ȣ�� �̸��̴�.
		// �ǸŽ����� 4�̻��λ���� best�� true�� �����ϼ���.
		
		String temp[]=data2.split(",");
		
		
		// �������͸� �Ľ� �ؼ� Member Ŭ���� �迭�� �ϼ��� ����غ�����.
		Member777[] memberList = null;
		memberList=new Member777[temp.length];
		
		for(int i=0;i<memberList.length;i++) {
			String info[]=temp[i].split("/");
			
			memberList[i]=new Member777();
			memberList[i].setInfo(Integer.parseInt(info[0]),info[1] );
			
		}
		//���� Ȯ��
		temp=data1.split(",");
		for(int i=0;i<temp.length;i++) {
			String info[]=temp[i].split("/");
			int no=Integer.parseInt(info[0]);
			int point=Integer.parseInt(info[1]);
			
			for(int j=0;j<memberList.length;j++) {
				if(memberList[j].no==no) {
					memberList[j].point+=point;
				}
			}
		}
		//best
		int max=0;
		int idx=0;
		for(int i=0;i<memberList.length;i++) {
			if(memberList[i].point>max) {
				max=memberList[i].point;
				idx=i;
			}
		}
		memberList[idx].best=true;
		
		//print
		for(int i=0;i<memberList.length;i++) {
			memberList[i].printInfo();
		}
	}

}
