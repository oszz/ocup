package org.osz.ocup.dataStructure.array;

public class OrderArrayApp {

	public static void main(String[] args) {
		OrderArray oa = new OrderArray(100);
		
		oa.insert(99);
		oa.insert(22);
		oa.insert(77);
		oa.insert(55);
		oa.insert(88);
		oa.insert(66);
		oa.insert(33);
		//TODO　Test  ASS
		
		oa.display();
		System.out.println(oa.size());
		
		long searchKey = 66;
		int searchKeyIn = oa.find(searchKey);
		System.out.println("searchKeyIn : " + searchKeyIn);
		if(searchKeyIn == oa.size()){
			System.out.println("Can't Found  " + searchKey);
		}else{
			System.out.println("Found  " + searchKey);
		}
		
		long delKey1 = 22;
		long delKey2 = 88;
		oa.delete(delKey1);
		oa.delete(delKey2);
		
		oa.display();
		System.out.println(oa.size());
	}
}
