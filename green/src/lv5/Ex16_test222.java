package lv5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex16_test222 {
public static void main(String[] args) {
	String[] ids = null;
	String[] pws = null;
	int[] moneys = null;

	String fileName = "fileTest02.txt";

	String data="";
	
	FileReader fr=null;
	BufferedReader br=null;
	
	try {
		fr=new FileReader(fileName);
		br=new BufferedReader(fr);	
		
		
		while(true) {
			String line=br.readLine();
			
			if(line==null) {
				break;
			}
			data+=line;
			data+="\n";
		}
		data=data.substring(0,data.length()-1);
//		System.out.println(data.length());
//		System.out.println(data);
		
		String temp[]=data.split("\n");
		
		 ids=new String[temp.length];
		 pws=new String[temp.length];
		 moneys=new int[temp.length];
		
		for(int i=0;i<temp.length;i++) {
			String temp2[]=temp[i].split("/");
			ids[i]=temp2[0];
			pws[i]=temp2[1];
			moneys[i]+=Integer.parseInt(temp2[2]);
		}
		
		for(int i=0;i<temp.length;i++) {
			System.out.printf("아이디: %s 비번: %s 돈: %d\n",ids[i],pws[i],moneys[i]);
		}
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}

	

		

		



}
}
