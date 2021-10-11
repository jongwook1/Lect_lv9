package lv1;

import java.util.Random;
import java.util.Scanner;

public class M6d10_0 {

	public static void main(String[] args) {

	boolean run = true;
	int a = 0;
	int cnt = 0;
	while(run) {
		if(a % 8 == 0 ) {
			cnt++;
			System.out.println("8ÀÇ¹è¼ö" + a);
		}		
		a++;
		if(cnt >= 5) {
			run = false;
		}
	}
	}

}
