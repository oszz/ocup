package org.osz.ocup.dataStructure.sortHigh.quickSort;

public class ArrayQuickSort3App {

	public static void main(String[] args) {
		
		int maxSize = 1000000;
		ArrayQuickSort2 aqs = new ArrayQuickSort2(maxSize);
		
		for(int i=0;i<maxSize;i++){
			aqs.insert((long)(Math.random()*maxSize*10));
		}
		
		aqs.display();
		
		aqs.quickSort();
		
		aqs.display();
	}
}
