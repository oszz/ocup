package org.osz.ocup.dataStructure.sort;

public class ArrayBubbleApp {

	public static void main(String[] args) {
		int maxSize = 100000;
		ArrayBubble ab = new ArrayBubble(maxSize);
		
		/*
		ab.insert(11);
		ab.insert(99);
		ab.insert(55);
		ab.insert(22);
		ab.insert(88);
		ab.insert(77);
		ab.insert(44);
		ab.insert(66);
		
		ab.display();
		
		ab.bubbleSort();
		
		ab.display();
		*/
		
		for(int i=0;i<maxSize;i++){
			//long value = (long)(Math.random()*(maxSize -1));
			long value = maxSize-i;
		//	System.out.println(value);
			ab.insert(value);
		}
		
		long st = System.currentTimeMillis();
		ab.bubbleSort();// 一万数据耗时:328ms | 十万数据:30735ms
		long et = System.currentTimeMillis();
		System.out.println(st + " : " + et);
		System.out.println(et - st);
		//ab.display();
	}
}
