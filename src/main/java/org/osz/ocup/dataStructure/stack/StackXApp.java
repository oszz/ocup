package org.osz.ocup.dataStructure.stack;

public class StackXApp {

	public static void main(String[] args) {
		StackX sx = new StackX(10);
		
		sx.push(11);
		sx.push(22);
		sx.push(99);
		sx.push(99);
		sx.push(11);
		
		while(!sx.isEmpty()){
			long value = sx.pop();
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
