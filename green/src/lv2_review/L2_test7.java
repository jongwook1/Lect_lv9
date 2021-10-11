package lv2_review;

public class L2_test7 {

	public static void main(String[] args) {
//test 7		
//	# 문제1)
//	#   운주네 반 학생은 31명입니다.
//	#   이중에서 남학생은 12명 , 여학생은 14명이 봉사할동을 하였습니다.
//	#   은주네 반에서 봉사활동을 하지않은 학생은
//	#   몇명인지 출력 
		
	int total=31;
	int m=12;
	int f=14;
	int temp=0;
	while(m+f>0) {
		if(m>0) {
			m--;
		}else if(f>0) {
			f--;
		}
		
		total--;
	}
	
	while(total>0) {
		total--;
		temp++;
	}
	System.out.println("봉사활동안한 학생: "+temp+"명");
	

//
//	# 문제2)
//	# 연필 7타를 여학생 2명과 남학생 4명에게 남김없이 똑같이 나누어 주었을때
//	# 한사람은 연필을 몇 자루 가지게 되는 지 출력 (연필 1타는 12자루)
//	# 힌트 ) 7 * 12 / 6 
	int p=7*12;
	int g=2;
	int b=4;
	int cnt=0;
	while(p>0) {
		while(g+b>0) {
			if(g>0) {
				g--;
			}else if(b>0) {
				b--;
			}
			p--;
		}
		cnt++;
		g=2;
		b=4;
	}
	System.out.println("가지게될 연필의수: "+cnt+"개");
	
	
//	# 문제3)
//	# 어느 공장에서 한사람이 1시간에 컴퓨터를 4대를 조립할수 있다고한다.
//	# 3명이 컴퓨터 96대를 조립혀면 몇시간이 걸리는가
	int make=4;
	int h=0;
	int com=96;
	int people=3;
	while(com>0) {
		com-=make;
		h++;
		
	}
	System.out.println("걸리는시간: "+h/people+"시간");
	
		
		

//	# 문제4)
//	# 귤 6개의 무개는 840g, 사과 3개의 무게는 750g 입니다.
//	# 귤5개와 사과 4개의 무게는 몇g인지 출력 (단 각각의 귤끼리 무게는 같고  각각의 사과끼리는 무게가같다)

int gull=5;
int gg=840/6;
int apple=4;
int ag=750/3;
int totalG=0;
		
while(gull>=0&&apple>=0) {
	if(gull==0) {
		totalG+=ag;
	}else if(apple==0) {
		totalG+=gg;
	}else {
		totalG+=ag+gg;
	}
	gull--;
	apple--;
	
}
		System.out.println("귤5사과4의 무게는: "+totalG+"g");	
		
	}

}
