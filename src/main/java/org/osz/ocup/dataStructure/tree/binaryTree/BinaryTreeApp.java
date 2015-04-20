package org.osz.ocup.dataStructure.tree.binaryTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryTreeApp {

	public static void main(String[] args) throws Exception {
		
		int value;
		BinaryTree bt = new BinaryTree();
		
		bt.insert(66, 6.2);
		bt.insert(99, 9.2);
		bt.insert(22, 2.2);
		bt.insert(00, 0.2);
		bt.insert(33, 3.2);
		bt.insert(44, 4.2);
		
		bt.insert(11, 1.1);
		bt.insert(77, 7.2);
		bt.insert(55, 5.2);
		bt.insert(88, 8.2);
		
		
		
		while(true){
			System.out.print("Enter first letter of show, ");
			System.out.print("insert,find,delete,or traverse: ");
			int choice = getChar();
			
			switch(choice){
				case 's':
					bt.displayTree();
					break;
				case 'i':
					System.out.print("Enter value to insert: ");
					value = getInt();
					bt.insert(value, value + 0.9);
					break;
				case 'f':
					System.out.print("Enter value to find: ");
					value = getInt();
					Node found = bt.find(value);
					if(found != null){
						System.out.print("Found： ");
						found.dispalyNode();
						System.out.println();
					}else{
						System.out.println("Could not find " + value );
					}
					break;
				case 'd':
					System.out.print("Enter value to delete: ");
					value = getInt();
					boolean didDelete = bt.delete(value);
					if(didDelete){
						System.out.println("Deleted " + value);
					}else{
						System.out.println("Could not delete " + value);
					}
					break;
				case 't':
					System.out.println("Enter type 1,2 or 3: ");
					value = getInt();
					bt.traverse(value);
					break;
				default:
					System.out.println("Invalid entyr");
					
					
			}
		}
		
	}
	private static String getString() throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	private static int getChar() throws Exception{
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws Exception{
		String s = getString();
		return Integer.parseInt(s);
	}
}
