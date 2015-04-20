package org.osz.ocup.dataStructure.sortHigh.shell;

public class ArrayShellApp {

	public static void main(String[] args) {
		int maxSize = 1000000;
		ArrayShell as = new ArrayShell(maxSize);
		
		for(int i=0;i<maxSize;i++){
			as.insert((int)(Math.random()*maxSize));
		}
		
		as.display();
		as.shellSort();
		as.display();
	}
}
