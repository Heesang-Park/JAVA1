package pk26.arraylist;

import java.util.ArrayList;

class MyStack{ // ArrayList를 Stack화 한것
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data); // ArrayList이기에 add로 넣는다
	}
	public String pop() {
		int len=arrayStack.size();
		if(len==0) {// arratStack은 ArrayList의 객체이기에 empty를 사용못함
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return(arrayStack.remove(len-1)); // 빼낼 떄 FILO이기에 -1  
	}
}
public class StackTest2 {
	public static void main(String[] args) {
		MyStack stack= new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		System.out.println("첫번째 출력 "+stack.pop());
		System.out.println("두번째 출력 "+stack.pop());
		System.out.println("세번째 출력 "+stack.pop());
		System.out.println("네번째 출력 "+stack.pop());
		System.out.println("다섯번째 출력 "+stack.pop());
		
	}
	
}
