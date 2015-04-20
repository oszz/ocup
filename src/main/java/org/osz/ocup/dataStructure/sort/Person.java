package org.osz.ocup.dataStructure.sort;

/**
 * 人员对象（用于对象排序）
 * @author zz
 *
 */
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String first, String last, int age){
		this.firstName = first;
		this.lastName = last;
		this.age = age;
	}
	
	public String getLast(){
		return this.lastName;
	}
	
	public int getAge(){
		return this.age;
	}
	
	@Override
	public String toString() {
		String pStr = "Last : " + lastName + "  first : " + firstName + "  age : " + age;
		return pStr;
	}
}

