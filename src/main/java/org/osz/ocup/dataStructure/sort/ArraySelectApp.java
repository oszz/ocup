package org.osz.ocup.dataStructure.sort;

public class ArraySelectApp {

	public static void main(String[] args) {
		int maxSize = 10000;
		ArraySelect as = new ArraySelect(maxSize);
		
		/*
		as.insert(11);
		as.insert(99);
		as.insert(55);
		as.insert(22);
		as.insert(88);
		as.insert(77);
		as.insert(44);
		as.insert(66);
		
		as.display();
		
		as.selectionSort();
		
		as.display();
		*/
		
		for(int i=0;i<maxSize;i++){
			//long value = (long)(Math.random()*(maxSize -1));
			long value = maxSize-i;
			as.insert(value);
		}
		
		long st = System.currentTimeMillis();
		as.selectionSort();// 一万数据耗时:125,141ms | 十万数据:13156ms
		long et = System.currentTimeMillis();
		System.out.println(st + " : " + et);
		System.out.println(et - st);
		//as.display();
	}
}
