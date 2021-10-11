package lv7;

import java.util.Random;

class RanNum99{
	int num;
	boolean check;		//중복 여부 체크
}
public class Ex01_중복숫자_answer {

	public static void main(String[] args) {
	Random rn = new Random();
	
	
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
	
	RanNum99 nums[]=new RanNum99[5];		//{null,null,null,null,null}
	for(int i=0;i<nums.length;i++) {
		nums[i]=new RanNum99();
		
		int r=rn.nextInt(5)+1;
		
		int check=1;
		for(int j=0;j<i;j++) {		//j<i 도 댐
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
	//프린트
	for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i].num);
	}
	
	
	
	}

}
