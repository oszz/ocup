package org.osz.ocup.dataStructure.sort;

public class ArraySortApp {

	public static void main(String[] args) {
		int maxSize = 100000;
		ArrayBubble ab = new ArrayBubble(maxSize);
		ArraySelect as = new ArraySelect(maxSize);
		ArrayInsert ai = new ArrayInsert(maxSize);
		

		for(int i=0;i<maxSize;i++){
			//long value = (long)(Math.random()*(maxSize -1));
			long value = maxSize-i;
			
			ab.insert(value);
			as.insert(value);
			ai.insert(value);
		}
		
		System.out.println("Bubble sort:");
		long stb = System.currentTimeMillis();
		//随机顺序数据： 一万数据耗时:328ms | 十万数据:30703ms
		//倒序数据： 一万数据耗时:234ms | 十万数据:24531ms
		ab.bubbleSort();
		long etb = System.currentTimeMillis();
		System.out.println("\t"+ stb + " : " + etb);
		System.out.println("\t" + (etb - stb));
		
		System.out.println("Select sort:");
		long sts = System.currentTimeMillis();
		//随机顺序数据： 一万数据耗时:125ms | 十万数据:13063ms
		//倒序数据： 一万数据耗时:141ms | 十万数据:13360ms
		as.selectionSort();
		long ets = System.currentTimeMillis();
		System.out.println("\t"+ sts + " : " + ets);
		System.out.println("\t" + (ets - sts));
		
		System.out.println("Insert sort:");
		long sti = System.currentTimeMillis();
		//随机顺序数据： 一万数据耗时:109,125ms | 十万数据:11406ms
		//倒序数据： 一万数据耗时:234ms | 十万数据:22828ms
		ai.insertionSort();
		long eti = System.currentTimeMillis();
		System.out.println("\t"+ sti + " : " + eti);
		System.out.println("\t" + (eti - sti));
		
	}
}
