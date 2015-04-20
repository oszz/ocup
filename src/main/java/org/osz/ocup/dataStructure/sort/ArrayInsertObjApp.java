package org.osz.ocup.dataStructure.sort;

public class ArrayInsertObjApp {

	public static void main(String[] args) {
		
		ArrayInsertObj aio = new ArrayInsertObj(100);
		aio.insert("cctong", "bbb", 26);
		aio.insert("mic", "ggg", 23);
		aio.insert("ditom", "bbb", 20);
		aio.insert("tom", "aaa", 20);
		aio.insert("jack", "eee", 32);
		aio.insert("liha", "ccc", 60);
		aio.insert("nhenkje", "ddd", 8);
		aio.insert("btom", "bbb", 45);
		
		
		
		aio.display();
		
		aio.insertionSort();
		System.out.println("after sort : ");
		aio.display();
	}
}
