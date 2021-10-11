package lv3;

public class Ex11 {

	public static void main(String[] args) {
		// 문제1)  a의 값과 b의 값을 번갈아가면서 c에 저장
		// 예) c = {10,40,20,50,30,60}
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		
			
		for(int i=0;i<3;i++) {	//i: 0(0,1) 1(2,3) 2(4,5)
			c[i*2]=a[i];
			c[i*2+1]=b[i];
		}
		for(int i=0;i<6;i++) {
			System.out.println(c[i]+" ");
		} 		
		
/*		int addIdx=-1;
		for(int i=0;i<3;i++) {
			if(i % 2 ==0) {
				addIdx = i;
				
			}
			else {
				addIdx = i-1;
			}
		}
		int cIdx=0;
		for(int i=0;i<6;i++) {
			if(i != addIdx) {
				c[cIdx] =a[i]+b[i];
				c[cIdx-1]=a[i-1]+b[i-1];
				cIdx++;
			}
		}for(int i=0;i<6;i++) {
			System.out.println(c[i]);
		}		
*/	
		
		// 문제 2) aa 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 bb의  값을 저장 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// 예) aa = {20,30,40,50,90};
		
		
		for(int i=0;i<5;i++) {		//i : 0~[4]
			if(i+1 <5) {
			aa[i] = aa[i+1];		//   aa[i] = aa[i+1]; 이거만쓰면 out bounds....그래서 위if문으로 예외처리해줌
			}
		}
		aa[4] = 90;
		
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(aa[i]+ " ");
		}		
		
		
		// 문제 3) cc 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 dd의 값을 저장 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		// 예) cc[] = {60,10,20,30,40};
		
//		for(int i=0;i<5;i++) {		//이렇게하면 틀리다는거예시라 주석처리
//			cc[i] = cc[i-1];
//		}
	
		
		for(int i=4;i>0;i--) {		//i : 4~1
			cc[i] = cc[i-1];
		}
		cc[0]=dd;
		
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.println(cc[i] + " ");
		}
		
		


	}

}
