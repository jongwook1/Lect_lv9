package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileData {
	private File file=null;
	private FileWriter fw=null;
	private FileReader fr=null;
	private BufferedReader br=null;
	
	private String fileName="RPG.txt";
	
	public void save() {
		file=new File(fileName);
		
	}

}
