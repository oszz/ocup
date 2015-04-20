package org.osz.ocup.dataStructure.linkList.sort;

public class ListInsertionSortApp {

	public static void main(String[] args) {
		int size = 10;
		Link[] listArr = new Link[size];
		
		for(int i=0;i<size;i++){
			listArr[i] = new Link((long)(Math.random()*99));
		}
		System.out.print("Unsort listArr : ");
		for(int i=0;i<size;i++){
			System.out.print(listArr[i].data + " ");
		}
		
		System.out.println();
		
		ListInsertionSort lis = new ListInsertionSort(listArr);
		for(int i=0;i<size;i++){
			listArr[i] = lis.remove();
		}
		System.out.print("Sorted listArr : ");
		for(int i=0;i<size;i++){
			System.out.print(listArr[i].data + " ");
		}
		System.out.println();
		
	}
}
