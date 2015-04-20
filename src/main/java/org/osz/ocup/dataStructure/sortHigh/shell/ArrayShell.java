package org.osz.ocup.dataStructure.sortHigh.shell;

/**
 * 高级排序之希尔排序<br>
 * 希尔排序通过加大插入排序中元素之间的间隔，并在这些有间隔的元素中进行插入排序，
 * 从而使数据项能大跨度的移动。<br>
 * Me:高效率的插入排序
 * @author zz
 *
 */
public class ArrayShell {
	
	private long[] arr;
	private int nElems;
	
	public ArrayShell(int maxSize){
		arr = new long[maxSize];
		nElems = 0;
	}
	
	/**
	 * 插入一个值
	 * @param value
	 */
	public void insert(long value){
		arr[nElems++] = value;
	}
	
	/**
	 * 显示数组内容
	 */
	public void display(){
		System.out.println("arr :");
		for(int i=0;i<nElems;i++){
			System.out.print(arr[i]+" ");
			if(i%1000 == 0 && i!=0){
				System.out.println();
			}
		}
		System.out.println();
	}
	
	/**
	 * 希尔排序
	 */
	public void shellSort(){
		int out = 0;//外循环索引
		int in = 0;//内循环索引
		
		int h = 1;//间隔序列，初始为1
		
		while(h <= nElems){
			h = 3*h + 1;//计算得到最大的间隔（这个间隔序列由Knuth提出）
		}
		
		while(h > 0){ //h是按间隔序列递减的，直到h==1
			
			for(out=h;out<nElems;out++){//其实就是对间隔为h的值进行循环排序
				long temp = arr[out];
				in = out;
				
				while(in > (h-1) && arr[in-h] >= temp){//比较间隔h的几个值，循环结束后的in的位置就是temp值应插入的位置
					arr[in] = arr[in-h];
					
					in -= h;//获得间隔h前的索引
				}
				arr[in] = temp;
			}
			
			h = (h -1)/3;//h(间隔)递减
		}
	}

}
