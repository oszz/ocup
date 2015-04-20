package org.osz.ocup.dataStructure.sortHigh.partition;

public class ArrayPartitionApp {

	public static void main(String[] args) {
		int maxSize = 20;
		ArrayPartition ap = new ArrayPartition(maxSize);
		
		
		for(int i=0;i<maxSize;i++){
			ap.insert((long)(Math.random()*maxSize));
		}
		
		/*
		ap.insert(1);
		ap.insert(2);
		ap.insert(3);
		ap.insert(4);
		ap.insert(5);
		ap.insert(1);
		*/
		
		
		ap.display();
		
		long privot = 6;
		
		int point = ap.partitionIt(0, ap.size()-1, privot);
		System.out.println("关键点:" + privot  + " 分隔位置：" + point);
		
		ap.display();
	}
}
