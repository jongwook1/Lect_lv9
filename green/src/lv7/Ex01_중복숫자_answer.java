package lv7;

import java.util.Random;

class RanNum99{
	int num;
	boolean check;		//�ߺ� ���� üũ
}
public class Ex01_�ߺ�����_answer {

	public static void main(String[] args) {
	Random rn = new Random();
	
	
		
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ��� 
		//      num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
	
	RanNum99 nums[]=new RanNum99[5];		//{null,null,null,null,null}
	for(int i=0;i<nums.length;i++) {
		nums[i]=new RanNum99();
		
		int r=rn.nextInt(5)+1;
		
		int check=1;
		for(int j=0;j<i;j++) {		//j<i �� ��
			if(r==nums[j].num) {
				check=-1;
			}
		}
		if(check==1) {
			nums[i].num=r;
			nums[i].check=true;
		}else {
			i--;
		}
		
	}
	//����Ʈ
	for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i].num);
	}
	
	
	
	}

}
