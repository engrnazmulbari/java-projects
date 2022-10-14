package com.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * *
 * @author bari
 * This Class will remove duplicate line from input file and write in output file.
 */


public class RemoveDuplicate {

	public static void main(String[] args) {
	
		PrintWriter pw = null;
		BufferedReader br = null;
		try{
		// Reading input file
		br = new BufferedReader(new FileReader("./src/file/input.txt"));
		
		// Writing in output file
		pw = new PrintWriter("./src/file/output.txt");
		
		String line = br.readLine();
		Set<String> hs = new HashSet<String>(); // Use TreeSet<String> if output need in sorted order.
		
		while(line != null){
			hs.add(line);
			line = br.readLine();
		}
		
		Iterator<String> i = hs.iterator();
		
		
		while(i.hasNext()){
			pw.write(i.next()+"\n"); //Writing with new line
		}
		
		
		System.out.print("Successfully removed all duplicate from file.");
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			pw.flush();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
			
		}

	}

}
