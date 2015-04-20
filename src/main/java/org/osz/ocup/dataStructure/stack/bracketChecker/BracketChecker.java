package org.osz.ocup.dataStructure.stack.bracketChecker;

/**
 * 分隔符匹配：{} () []
 * @author zz
 *
 */
public class BracketChecker {

	public String input;//输入的字符串
	
	public BracketChecker(String in){
		this.input = in;
	}
	
	/**
	 * 检测分隔符是否匹配
	 * @return boolean
	 */
	public boolean check(){
		int inLen = input.length();
		StackX stack = new StackX(inLen);
		for(int i=0;i<inLen;i++){
			char c = input.charAt(i);
			
			switch(c){
				case '(':
				case '[':
				case '{':
					stack.push(c);
					break;
				
				case ')':
				case ']':
				case '}':
					if(!stack.isEmpty()){
						char cx = stack.pop();
						
						if((c == ')' && cx != '(') ||
							(c == ']' && cx != '[') ||
							(c == '}' && cx != '{')){
							System.out.println("Error : 不匹配  " + c +" at " + i);
						}
					}else{
						System.out.println("Error : 栈为空  " + c +" at " + i);
					}
					break;
				default: break;	
			}
		}
		if(!stack.isEmpty()){
			System.out.println("Error : 未匹配完全  ");
		}else{
			System.out.println("poro : 匹配成功  ");
			return true;
		}
		return false;
	}
}
