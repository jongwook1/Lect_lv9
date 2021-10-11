package lv4;

public class A {

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		
		// 위 배열에서 중복안된숫자를 제거하시요 
		// 1) {1,2,2,1}
		// 2) {4,4}
		// 3) {1,1,1,1}
		
		//1. 중복이 안된(cnt가 1인) 값이 배열에 몇개 있나?
		//2. 새 배열의 크기를 알아냄-> 새 배열을 초기화 할수 있음
		//3. 중복된 숫자만 -> 새 배열에 차곡차곡 쌓음
		//4. 새 배열을 출력(크기만큼 length)
		
		int size=test2.length;
		
		for(int i=0;i<test2.length;i++) {
			int cnt=0;
			for(int j=0;j<test2.length;j++) {
				
				if(test2[i]==test2[j]) {
					cnt++;
				}
			}
			if(cnt==1) {
				size--;
			}
		}
		
		int temp[]=test2;
		test2=new int[size];
		
		int idx=0;
		for(int i=0;i<temp.length;i++) {
			int cnt=0;							
			for(int j=0;j<temp.length;j++) {
				if(temp[i]==temp[j]) {
					cnt++;
				}
			}
			if(cnt!=1) {			//여기서 cnt=1은 중복된애들이므로 그반대인 중복안된애들 쌓는거
				test2[idx]=temp[i];
				idx++;
			}			
		}
		for(int i=0;i<test2.length;i++) {
			System.out.print(test2[i]);
		}
		
		
		
		
	}

}
