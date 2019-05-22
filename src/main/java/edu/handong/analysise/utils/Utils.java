package edu.handong.analysise.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Utils {
	public static ArrayList<String> getLines(String file,boolean removeHeader){
		ArrayList<String> read = new ArrayList<String>();
		
		String line;
		boolean remove = removeHeader;
		
		try
		{
			File fileName = new File(file);
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufReader = new BufferedReader(fileReader);
			
			while ((line=bufReader.readLine()) != null) {
				if(remove) remove = false;
				else read.add(line);
			}

			bufReader.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return read;	
	}
	
	
	public static void writeAFile(ArrayList<String> lines, String targetFileName) {
		// TODO
	}
}
