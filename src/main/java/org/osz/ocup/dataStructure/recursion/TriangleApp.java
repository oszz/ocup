package org.osz.ocup.dataStructure.recursion;

/**
 * 三角数字（递归）
 * @author zz
 *
 */
public class TriangleApp {

	public static void main(String[] args) {
		int r = triangle(3);
		System.out.println(r);
	}
	
	/**
	 * 计算三角数字第N项的值（递归实现）
	 * @param n
	 * @return int
	 */
	public static int triangle(int n){
		System.out.println("n= " + n);
		if(n == 1){
			System.out.println("n == 1 : " + (n == 1));
			return 1;
		}else{
			int r = n + triangle(n-1);
			System.out.println("temp : " + r);
			return r;
		}
	}
}
