package lv5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex13_FileWriter_FileReader_BufferedReader {

	public static void main(String[] args) {
		// 파일 
				// ㄴ File 관련 객체를 사용할 때 -> 반드시 '예외처리'를 해야함 
				// 파일 쓰기 
				// FileWriter 
				try {
					FileWriter fw = new FileWriter("test.txt");
					fw.write("홍길동");
					fw.close();
					
					System.out.println("저장완료");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("저장실패");
				}
				// 파일 읽기 
				// FileReader 
				// BufferedReader 
				FileReader fr = null;
				BufferedReader br = null;
				try {
					fr = new FileReader("test.txt"); // grab
					br = new BufferedReader(fr);
					String data = br.readLine(); // 새로운 문자열을 단 한줄만 읽음 
					System.out.println("data: " + data);
					fr.close();
					br.close();
				} catch (Exception e) {
					// TODO: handle exception
				}

		
	}

}
