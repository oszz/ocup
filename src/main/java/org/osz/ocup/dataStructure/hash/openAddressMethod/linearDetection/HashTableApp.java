package org.osz.ocup.dataStructure.hash.openAddressMethod.linearDetection;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HashTableApp {

	public static void main(String[] args) throws Exception {
		DataItem aDataItem;
		int aKey;
		int size;
		int n;
		int keysPerCell;
		
		System.out.print("Enter size of hash table: ");
		size = getInt();
		System.out.print("Enter initial number of items: ");
		n = getInt();
		keysPerCell = 10;
		
		HashTable theHashTable = new HashTable(size);
		
		for(int i=0;i<n;i++){
			aKey = (int)(Math.random()*keysPerCell*size);
			
			aDataItem = new DataItem(aKey);
			theHashTable.insert(aDataItem);
		}
		
		while(true){
			System.out.print("Enter first letter of ");
			System.out.print("show, inesrt, delete, or find: ");
			
			char choice = getChar();
			switch(choice){
				case 's':
					theHashTable.displayTable();
					break;
				case 'i':
					System.out.print("Enter key value to insert: ");
					aKey = getInt();
					aDataItem = new DataItem(aKey);
					theHashTable.insert(aDataItem);
					break;
				case 'd':
					System.out.print("Enter key value to delete: ");
					aKey = getInt();
					theHashTable.delete(aKey);
					break;
				case 'f':
					System.out.println("Enter key value to find: ");
					aKey = getInt();
					aDataItem = theHashTable.find(aKey);
					if(aDataItem != null){
						System.out.println("Found " + aKey);
					}else{
						System.out.println("Could not find " + aKey);
					}
					break;
				default:
					System.out.println("Invalid entry");
					
			}
			
			
		}
		
	}
	
	public static String getString() throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine();
		return s;
	}
	
	public static char getChar() throws Exception {
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws Exception {
		String s = getString();
		return Integer.parseInt(s);
	}
}
