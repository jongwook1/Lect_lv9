package lv5;

public class Test_lv5_5 {

	public static void main(String[] args) {
		String data = "123+46";		

		// 위 수의 합을 구하시오
		// split() 메서드의 원리 직접 만들어보기
		
		String a ="+";		

		String temp2[]=null;
		
		int cnt=0;
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==a.charAt(0)) {		//구분자 개수구하기
				cnt++;
			}
		}
		
		temp2=new String[cnt+1];	//구분자만큼 배열만들기
		
		if(temp2!=null) {
		for(int i=0;i<cnt+1;i++) {		//null값을 
			temp2[i]="";
			System.out.println(temp2[i]);
		}
		
		int idx=0;
		for(int i=0;i<data.length();i++) {	//구분자가 나오게되면 다음인덱스로
			if(data.charAt(i)==a.charAt(0)) {
				idx++;
				
			}else {
				temp2[idx]+=data.charAt(i);
			}
		}
//		for(int i=0;i<cnt+1;i++) {
//			System.out.println(temp2[i]);
//		}
		
		int result=0;
		
		for(int i=0;i<cnt+1;i++) {	
			result+=Integer.parseInt(temp2[i]);			
		}
		System.out.println(result);
		
		}
	}

}
