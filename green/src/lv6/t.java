package lv6;
class Day{
	
	int func(int month, int day) {
		
		int monthList[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//month = 시작월, day = 시작날짜 
		//1월 1일을 기준으로 잡는다.
		//시작날짜에서 1월 1일을 뺀다.
		//끝 날짜에서 1월 1일을 뺀다.
		int monthCnt = 0;
		for(int i = 0; i < month-1; i++) {
			monthCnt += monthList[i];
		}
		int result=monthCnt+day;
		
		return result;
		
//		for(int i = 0; i < monthList.length; i++) {
//			if(month - 1 == i) {
//				if(i != 0) {
//					for(int j = 0; j < monthList.length; j++) {
//						day = monthList[j] + 1;
//					}
//				}
//				else {
//					day = day - 1;
//				}
//			}
//		}
		
	}
	
	
	int solution(int stMonth, int stDay, int endMonth, int endDay) {
		
		int startTotal = func(stMonth, stDay); 
		int endTotal = func(endMonth, endDay);
		return endTotal - startTotal;
	}
}



public class t {

	public static void main(String[] args) {
		Day dy = new Day();
//		int mh = 1;
//		int day = 1;
//		dy.func(mh, day);
		int startMonth = 1;
	    int startDay = 2;
	    int endMonth = 1;
	    int endDay = 18;
	    
        int ret = dy.solution(startMonth, startDay, endMonth, endDay);
        
        System.out.println("1월2일과 2월 ㅁ일의 차이 = " + ret + "일.");




	}

}
