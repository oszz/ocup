package org.osz.ocup.dataStructure.array;

public class HighArrayApp {

	public static void main(String[] args) {
		HighArray highArray = new HighArray(100);
		
		System.out.println("maxKey :　" + highArray.getMaxKey());
		
		highArray.insert(12);
		highArray.insert(24);
		highArray.insert(52);
		highArray.insert(13);
		highArray.insert(75);
		highArray.insert(16);
		highArray.insert(66);
		highArray.insert(78);
		highArray.insert(99);
		highArray.insert(82);
		
		highArray.display();
		System.out.println("maxKey :　" + highArray.getMaxKey());
		highArray.removeMaxKey();
		highArray.display();
		
		

		
		int searchKey = 75;
		if(highArray.find(searchKey)){
			System.out.println("Found " + searchKey);
		}else{
			System.out.println("Can't Found " + searchKey);
		}
		
		int delKey1 = 24;
		int delKey2 = 75;
		int delKey3 = 99;
		highArray.delete(delKey1);
		highArray.delete(delKey2);
		highArray.delete(delKey3);
		
		
		highArray.display();
		System.out.println("maxKey :　" + highArray.getMaxKey());

	}

}
