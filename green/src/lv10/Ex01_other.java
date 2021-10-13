package lv10;

//<<타이머 만들기>>
//ㄴ 입력값을 받고 (제한 시간)
//ㄴ	Thread.sleep() 메소드 활용
//ㄴ 초 단위로 콘솔에 흘러가는 현재시간(남은시간)을 출력
//ㄴ 제한시간이 끝나면 -> 프로그램 종료
import java.util.Calendar;
import java.util.Scanner;

public class Ex01_other {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		long time = calendar.getTimeInMillis();

		Scanner sc = new Scanner(System.in);
		System.out.println("제한 시간을 입력하세요");
		int inputTime = sc.nextInt();
//		int nowTime=Integer.parseInt(calendar.get(Calendar.SECOND));
		while (0 < inputTime) {
			
//			System.out.println("현재시간"+ calendar.get(Calendar.SECOND)+"남은시간"+inputTime - calendar.get(Calendar.SECOND));
			
			System.out.println("현재시간: "+calendar.get(Calendar.SECOND-inputTime));
			
			System.out.println(inputTime);
			inputTime--;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}




