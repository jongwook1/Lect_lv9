package lv5;

public class Test_lv5_6_test {

	public static void main(String[] args) {
		String data1 = "123456789123456";
        String data2 = "88888888888888";
        // 위 수의 합을 구하시요 .
        
        // 힌트 : 배열에 넣으세요~
        // 답 : 212345678012344

        String temp1[] = data1.split("");
        String temp2[] = data2.split("");
        
        
        int size1 = temp1.length;
        int size2 = temp2.length;
        int gap = size1 - size2; 
        
        int nums[] = new int[data1.length()];
        
        //max == 15;
        
        
        for(int i = 0; i < size1; i++) {
        	int a = Integer.parseInt(temp1[i]);				//123..
//        	System.out.print(a+" ");
        	int b = 0;
        	if(i-gap >= 0) {
        		b = Integer.parseInt(temp2[i-gap]);			//8888..
        		
        	}
        	nums[i] = a+b;
//        	System.out.println(nums[i]);
        }
        
        for(int i = nums.length-1; i >= 0; i--) {			//일의자리부터서 십의자리..백의자리...넣기 
        	if(i != 0) {
        		nums[i-1] += nums[i] / 10;
        		System.out.println(nums[i-1]);
        	}
       		nums[i] %= 10;									//십으로나눈 나머지자리만 남기기 
        }
		
        String result = "";
        for(int i = 0; i < nums.length; i++) {
//        	System.out.println(nums[i]);
        	result += nums[i];
        }        
        System.out.println(result);


        int b=32;
        int c= b%10;
        System.out.println(c);

	}

}
