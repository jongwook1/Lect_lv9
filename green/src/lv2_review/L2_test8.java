package lv2_review;

public class L2_test8 {

	public static void main(String[] args) {
//		#문제 1) 마트에서 오이를 3개씩 묶어서 1500원에 판다고 한다
//	# 오이가 14개 필요하다. 돈이 얼마필요한가(오이는 묶음으로만 판다)
//	/*
//	   힌트 : 3의배수가 아니면 될때까지 증가시킨다. 
//	    while(오이 % 3  != 0){
//	       오이 += 1;
//	   }
//
//	*/
		int o2=14;
		int bundle=3;
		int price=1500;
		int bcnt=0;
		while(o2>0) {
			o2-=bundle;
			bcnt++;
			
		}
		System.out.println("필요한 돈은"+bcnt*price+"원");
		

//	# 문제 2) 민수네 반 학생은 26명입니다
//	# 민수네반 학생들에게 도화지를 2 장씩 나누어 주려고합니다.
//	# 도화지는 10장씪 묶음으로만 판매하고 10장에 1200원입니다.
//	# 총얼마가 필요한가요?
int total=26;
int divide=2;
int bun=10;
int td=1;
int cash2=0;
int price2=1200;
while(total>0) {
	
	if(bun==0) {
		bun=10;
		td++;
	}
	
	bun-=divide;
	total--;
}
cash2=td*price2;
System.out.println("필요한돈: " +cash2+"원");
		
//	#문제3) 가게에서 24600원 짜리 옷을샀습니다.
//	# 1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?
int total2=24600;
int bun3=1000;
int cnt3=0;
while(total2>0) {
	total2-=bun3;
	cnt3++;
}
System.out.println(cnt3);

		
		
//	# 문제1 )  어떤수에 3을 곱하였더니 6.12 가되었습니다. 이수를 4로 나누면 얼마? (반복문을 활용한 정수화 -> 연산 후 되돌려 놓기)
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


//	# 문제2) 지웅이가 1시간 20분동안 일정한 빠르기로 주은 밤의 무게가 9 키로이다
//	# 3분동안 주은밤은 몇키로인가 ?

int min=80;
int workbam=9000;
double bam=0;
while(bam<=0) {		
	bam=workbam/min;			
	System.out.println("답은: "+(bam*3)/1000+"kg");
}		
		
//	# 문제3) 가게에 우유가 250개가 있다 그중에 오전에 84퍼센트가 팔렸고 나머지는 오후에 다팔렸다
//	# 오전에 팔린갯수 - 오후에 팔린갯수는 얼마인가

int milk=250;
double mor =0;
double aft=0;	

while(mor / milk < 0.84) {
	mor++;
}
aft = milk - mor;
System.out.println("오전에팔린갯수-오후에팔린갯수: "+(mor-aft));	
		
//lv2 test17		
//	# 문제4) 어느도시에 전체 인구가 400000 명인데 나이가 19세 이하 인구는 35퍼센트
//	#  40세 이상인구는 25퍼센트일때
//	# 19세이하인구 - 40세이상인구 수를 구하시요
double people = 400000;
double a = 0;
double b = 0;

while (a / people < 0.35) {
	a++;
}
while (b / people < 0.25) {
	b++;
}
System.out.println("19세이하인구수-40세이상인구수: " + (a - b));

	}

}
