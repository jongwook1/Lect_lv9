package lv7;
class Test77{
	int num;
	int size;
	char[] data;
	void print() {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
public class Ex12_������������Ŭ�����迭������_�� {

	public static void main(String[] args) {
		String data ="6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);	

		Test77[] t;	
        // data�� ������ Ŭ�����迭�� ����.
		
		String temp[]=data.split("\n");
		int cnt=Integer.parseInt(temp[0]);		//6
		
		t=new Test77[cnt];
		for(int i=0;i<cnt;i++) {
			String info[]=temp[i+1].split("/");
			t[i]=new Test77();
			t[i].num=Integer.parseInt(info[0]);
			t[i].size=Integer.parseInt(info[1]);
			t[i].data=new char[t[i].size];
			
			int idx=0;
			for(int j=2;j<info.length;j++) {
				t[i].data[idx]=info[j].charAt(0);
				idx++;
			}
			t[i].print();
			
		}
		
		
		
	}

}
