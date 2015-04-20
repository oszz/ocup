package org.osz.ocup.dataStructure.stack.bracketChecker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BracketCheckerApp {

	public static void main(String[] args) throws Exception{
		
		while(true){
			System.out.print("Enter strs: ");
			String in = getInputString();
			if(in != null && !"".equals(in)){
				if(!in.equals("quit")){
					BracketChecker bc = new BracketChecker(in);
					
					bc.check();
				}else{
					break;
				}
			}
		}
	}
	
	public static String getInputString() throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String in = br.readLine();
		
		return in;
	}
}
