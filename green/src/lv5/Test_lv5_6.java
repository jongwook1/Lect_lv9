package lv5;

public class Test_lv5_6 {

	public static void main(String[] args) {
		// 아주긴수는 변수에 저장할수없다. int 나 long 에 넣지않고 아래합구하기
		String data1 = "123456789123456";

		String data2 = "88888888888888";

		// 위 수의 합을 구하시요 .

//		String temp1[]=new String[data1.length()];
//		String temp2[]=new String[data2.length()];

//		for(int i=0;i<temp1.length;i++) {
//			String temp1[i]=data1.split("");
//		}

		// 힌트 : 배열에 넣으세요~

			int temp1[]=new int[data1.length()];
			int temp2[]=new int[data2.length()];
			
			for(int i=0;i<temp1.length;i++) {
				int num=Integer.parseInt(data1.charAt(i)+"");				
				temp1[i]=num;
				System.out.println(temp1[i]);
			}
			
		
	}

}
