package lv2;
//못
public class Test14_lv2f {

	public static void main(String[] args) {
		//시작 : 19:00
		//종료 :
		//소요시간 :
		
		
		// # 문제1 )  어떤수에 3을 곱하였더니 6.12 가되었습니다. 이수를 4로 나누면 얼마?
		
		double cnt = 1;
		double x = 6.12/3;
		
		while(x%1<1) {
			x=x*10;
			cnt=cnt/10;
			if(x%1==0) {
				System.out.println("답은: "+(x/4)*cnt);
				break;
			}
		}
		

	}

}
