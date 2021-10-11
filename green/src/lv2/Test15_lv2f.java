package lv2;
//못
public class Test15_lv2f {

	public static void main(String[] args) {
		// # 문제2) 지웅이가 1시간 20분동안 일정한 빠르기로 주은 밤의 무게가 9 키로이다
		//# 3분동안 주은밤은 몇키로인가 ?
		
		int min=80;
		int workbam=9000;
		double bam=0;
		while(bam<=0) {		
			bam=workbam/min;			
			System.out.println("답은: "+(bam*3)/1000+"kg");
		}
	}

}
