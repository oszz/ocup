package org.osz.ocup.dataStructure.sortHigh.quickSort;

public class ArrayQuickSort2App {

	public static void main(String[] args) {
			
			int maxSize = 30;
			ArrayQuickSort2 aqs = new ArrayQuickSort2(maxSize);
			
			for(int i=0;i<maxSize;i++){
				aqs.insert((long)(Math.random()*maxSize*10));
			}
			
			aqs.display();
			
			aqs.quickSort();
			
			aqs.display();
	}
}
