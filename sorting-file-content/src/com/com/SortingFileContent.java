package com.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class SortingFileContent {

	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader (new FileReader("../sorting-file-content/files/input.txt"));
			PrintWriter pw = new PrintWriter("../sorting-file-content/files/output.txt");
		
			String line = br.readLine();
			ArrayList<String> content = new ArrayList<String>();
			
			while(line!=null){
				content.add(line);
				line = br.readLine();
			}
			
			Collections.sort(content);
			
			for(String str : content){
				System.out.println(str);
				pw.write(str+"\n");
			}
			pw.close();
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}		
	}

}
