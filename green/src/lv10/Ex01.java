package lv10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

class UserManager{
	
//디자인 패턴 중, Singleton : 프로그램 안에서 단 하나의(유일한) instance 를 허용하게끔 처리하는 것
	//1. 생성한 객체를 instance 변수에 담아 private 처리 하고 
	private static UserManager instance=new UserManager();
	//2. 기본 생성자를 private 처리 (타 클래스에서 1개를 초과하는 생성을 못하게막음)
	private UserManager() {}
	//3. 유일한 instance를 -> getter를 통해 참조할 수 있도록 제공
	public static UserManager getInstance() {
		return instance;
	}
}

class MainControl{
//	UserManager um=UserManager.instance;
	//um=null 을 방지하기위해 public 처리한걸 private 처리해줌
//	UserManage instance=new UserManager();	//이것도 private UserManager() {}처리로 인해 사용못하게됌
	
	UserManager um=UserManager.getInstance();
	
}


public class Ex01 {
//인터넷에 jdk 11 doc->JDK 11 Documentation - Home - Oracle Help Center->API Documentation
//->java.base->java.text->SimpleDateFormat
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();//new Calendar();  싱글톤이라 이게안됌
		long time = calendar.getTimeInMillis();	//현재 시간을 반환 : 1970년 1월 1일 00시 00분 00초 를 기준으로~흘러간 ms초를 반환
		
		System.out.println(time);		//
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일(E요일) hh시  mm분 ss초 SS밀리초");		//년 월 일(요일) 시 분 초 밀리초
		System.out.println(sdf.format(time));
		
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy년 MM월 dd일(E요일) hh시 mm분 ss초 S밀리초");  //위에꺼의 정답
		System.out.println(sdf2.format(time));
		
		System.out.println(calendar.get(Calendar.YEAR));			// 년
		System.out.println(calendar.get(Calendar.MONTH)+1);			// 월: 0부터시작하므로 +1해줘야함
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));	// 일 
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));		// 요일 (일~토) 일요일이 1번
		System.out.println(calendar.get(Calendar.HOUR));			// 시
		System.out.println(calendar.get(Calendar.MINUTE));			// 분
		System.out.println(calendar.get(Calendar.SECOND));			// 초
		System.out.println(calendar.get(Calendar.MILLISECOND));		// ms
		
		//<<타이머 만들기>>
		//ㄴ 입력값을 받고 (제한 시간)
		//ㄴ	Thread.sleep() 메소드 활용
		//ㄴ 초 단위로 콘솔에 흘러가는 현재시간(남은시간)을 출력
		//ㄴ 제한시간이 끝나면 -> 프로그램 종료
		
		Scanner sc= new Scanner(System.in);
		System.out.println("<타이머 제한시간 설정 >");
		
		int min = 0;
		int sec = 0;
		
		try {
			System.out.println("분 : ");
			String input = sc.next();
			//분
			min =Integer.parseInt(input);
			//초
			System.out.println("초 : ");
			input = sc.next();
			sec=Integer.parseInt(input);
			
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		
		sdf=new SimpleDateFormat("hh시 mm분 ss초");
		
		int n=min*60+sec;
		while(n>0) {
			Calendar cd= Calendar.getInstance();
			time =cd.getTimeInMillis();
			System.out.println(sdf.format(time));	//흘러가고 있는 1초 갱신된 현재시간
//			System.out.println(cd.get(Calendar.SECOND));	//바로위의 초만 뽑아낸거랑 같음
			System.out.printf(" (%d초 남음)\n", n);
			n--;
			
			
			try {
				Thread.sleep(1000);	//1초 딜레이
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("타임아웃");
		
	}

}



