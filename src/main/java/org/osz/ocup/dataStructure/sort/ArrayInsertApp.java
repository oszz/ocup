package org.osz.ocup.dataStructure.sort;

public class ArrayInsertApp {

	public static void main(String[] args) {
		int maxSize = 100000;
		ArrayInsert ai = new ArrayInsert(maxSize);
		
		/*
		ai.insert(55);
		ai.insert(22);
		ai.insert(99);
		ai.insert(77);
		ai.insert(44);
		ai.insert(88);
		ai.insert(66);
		ai.insert(11);
		ai.insert(33);
		
		ai.display();
		
		ai.insertionSort();
		
		ai.display();
		*/
		
		for(int i=0;i<maxSize;i++){
			//long value = (long)(Math.random()*(maxSize -1));
			long value = maxSize-i;
			ai.insert(value);
		}
		
		long st = System.currentTimeMillis();
		ai.insertionSort();// 一万数据耗时:109,125ms | 十万数据:11390ms
		long et = System.currentTimeMillis();
		System.out.println(st + " : " + et);
		System.out.println(et - st);
		//ai.display();
	}

}
