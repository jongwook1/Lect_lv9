package lv5;

import java.util.Scanner;

public class Ex20_test {

	public static void main(String[] args) {
		String [][] student = {
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , 
				{"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		
		int[] arr = new int[score.length];
		int maxNum = 0;
		int maxIdx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] += Integer.parseInt(score[i][1]);
			arr[i] += Integer.parseInt(score[i][2]);
			arr[i] += Integer.parseInt(score[i][3]);
			System.out.println(arr[i]);
			
			if(maxNum < arr[i]) {
				maxNum = arr[i];
				maxIdx = i;
			}
		}
		
		System.out.println("전체 성적이 1등인 학생 id: " + student[maxIdx][0]);




	}

}
