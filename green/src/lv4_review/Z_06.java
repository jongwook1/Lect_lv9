package lv4_review;

public class Z_06 {

	public static void main(String[] args) {
		//시작 22:00
		//종료 22:20
		//소요 00:20
		
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		// 위 배열에서 중복안된숫자를 제거하시요 
		// 1) {1,2,1,2}
		// 2) {4,4}
		// 3) {1,1,1,1}
		
		int size=test1.length;
		for(int i=0;i<test1.length;i++) {
			int cnt=0;
			for(int j=0;j<test1.length;j++) {
				if(test1[i]==test1[j]) {
					cnt++;
				}
			}
			if(cnt==1) {
				size--;
			}			
		}
		int temp[]=test1;
		test1=new int[size];
		int idx=0;
		for(int i=0;i<temp.length;i++) {
			int cnt=0;
			for(int j=0;j<temp.length;j++) {
				if(temp[i]==temp[j]) {
					cnt++;
				}
			}
			if(cnt!=1) {
				test1[idx]=temp[i];
				idx++;
			}
		}
		for(int i=0; i<test1.length;i++) {
			System.out.print(test1[i]+" ");
		}
	}

}
