package pk26.arraylist;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Object obj;
		//empty 스택생성
		Stack<Object> st=new Stack<Object>();
		if(st.empty()) {
			for(int i=0;i<3;i++) {
				st.push(new String("Hi!"+i));
				System.out.println("입력"+i+"번째: "+st.peek());
			}
		}// of
		st.pop();
		System.out.println("현재 Top의 위치 (peek): "+st.peek());
		st.pop();
		System.out.println("현재 Top의 위치 (peek): "+st.peek());
		st.push(new String("everybody!"));
		System.out.println(st.peek());
		st.push(new String("Nice Day"));
		System.out.println(st.peek());
		
		
		
		
	}
}
