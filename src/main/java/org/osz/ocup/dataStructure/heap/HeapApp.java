package org.osz.ocup.dataStructure.heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 堆的测试类
 * @author zz
 *
 */
public class HeapApp {

	public static void main(String[] args) throws Exception {
		int value = 0;
		int value2 = 0;
		Heap theHeap = new Heap(31);
		boolean success = false;
		
		theHeap.insert(70);
		theHeap.insert(40);
		theHeap.insert(50);
		theHeap.insert(20);
		theHeap.insert(60);
		theHeap.insert(100);
		theHeap.insert(80);
		theHeap.insert(30);
		theHeap.insert(10);
		theHeap.insert(90);
		
		while(true){
			System.out.print("Enter first letter of ");
			System.out.print("show,insert,remove,change: ");
			int choice = getChar();
			
			switch(choice){
				case 's':
					theHeap.displayHeap();
					break;
				case 'i':
					System.out.print("Enter value to insert: ");
					value = getInt();
					success = theHeap.insert(value);
					if(!success){
						System.out.println("Can't insert; heap full");
					}
					break;
				case 'r':
					if(!theHeap.isEmpty()){
						theHeap.remove();
					}else
					{
						System.out.println("Can't remove; heap empty");
					}
					break;
				case 'c':
					System.out.print("Enter current index of item: ");
					value = getInt();
					System.out.print("Enter new key: ");
					value2 = getInt();
					success = theHeap.change(value, value2);
					if(!success){
						System.out.print("Invalid index");
					}
					break;
				default:
					System.out.println("Invalid entry ");
			}
		}
		
	}
	
	public static String getString() throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static char getChar() throws Exception{
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws Exception{
		String s = getString();
		return Integer.parseInt(s);
	}
}
