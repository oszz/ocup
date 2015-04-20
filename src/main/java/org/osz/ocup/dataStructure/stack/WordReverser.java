package org.osz.ocup.dataStructure.stack;

/**
 * 单词逆序
 * @author zz
 *
 */
public class WordReverser {

	private String in;
	private String out;
	
	public WordReverser(String in){
		this.in = in;
		out = "";
	}
	
	/**
	 * 逆序
	 * @return String
	 */
	public String doRev(){
		int inLen = in.length();
		StackX stackX = new StackX(inLen);
		
		for(int i=0;i<inLen;i++){
			char c = in.charAt(i);
			stackX.push(c);
		}
		
		while(!stackX.isEmpty()){
			long cc = stackX.pop();
			out += (char)cc;
		}
		return out;
	}
}
