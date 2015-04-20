package org.osz.ocup.dataStructure.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordReverserApp {

	public static void main(String[] args)  throws Exception{
		
		while(true){
			System.out.print("Enter a Word : ");
			String in = getString();
			
			WordReverser wr = new WordReverser(in);
			String out = wr.doRev();
			System.out.println("After Reverser : " + out);
			
		}
		
		
		
	}
	
	public static String getString() throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String inStr = br.readLine();
		return inStr;
	}
}
