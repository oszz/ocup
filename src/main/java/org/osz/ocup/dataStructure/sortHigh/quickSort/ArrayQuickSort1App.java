package org.osz.ocup.dataStructure.sortHigh.quickSort;

public class ArrayQuickSort1App {

	public static void main(String[] args) {
		
		int maxSize = 10;
		ArrayQuickSort1 aqs = new ArrayQuickSort1(maxSize);
		
		for(int i=0;i<maxSize;i++){
			aqs.insert((long)(Math.random()*maxSize*10));
		}
		
		aqs.display();
		
		aqs.quickSort();
		
		aqs.display();
	}
}
