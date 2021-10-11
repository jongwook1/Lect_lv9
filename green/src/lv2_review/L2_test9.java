package lv2_review;

public class L2_test9 {

	public static void main(String[] args) {
//		# 문제1) 36의 약수 를 전부 출력
//	# 약수는  36과 나눠서 나머지가 0인수를 말한다.
//	# 1,2,4,6.....
		System.out.println("36의약수");
		int i=1;
		while(i<=36) {
			if(36%i==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
		
System.out.println("\n24의약수");
//	# 문제2) 24의 약수중에서 2의 배수만출력
		i=1;
		while(i<=24) {
			if(24%i==0&&i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
System.out.println();
//	# 문제3) 18의 약수의 갯수 더하기  21의 약수의 갯수를 출력
		i=1;
		int cnt1=0;
		int cnt2=0;
		while(i<=24) {
			if(18%i==0) {
				cnt1++;
			}
			if(21%i==0) {
				cnt2++;
			}
			i++;
		}
		System.out.println("18의 약수개수더하기 21의약수개수"+cnt1+cnt2);
//
//	# 문제4) 50 부터 100 까지의 자연수중에서 9의 배수는 모두 몇개?
		 i=50;
		 int cnt4=0;
		while(i<=100) {
			if(i%9==0) {
				cnt4++;
			}
			i++;
		}
		System.out.println("9의 배수의개수: "+cnt4);
		

	}

}
