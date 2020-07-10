package pk26.arraylist;

import java.util.ArrayList;

class MyStack{ // ArrayList�� Stackȭ �Ѱ�
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data); // ArrayList�̱⿡ add�� �ִ´�
	}
	public String pop() {
		int len=arrayStack.size();
		if(len==0) {// arratStack�� ArrayList�� ��ü�̱⿡ empty�� ������
			System.out.println("������ ����ֽ��ϴ�.");
			return null;
		}
		return(arrayStack.remove(len-1)); // ���� �� FILO�̱⿡ -1  
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
		
		System.out.println("ù��° ��� "+stack.pop());
		System.out.println("�ι�° ��� "+stack.pop());
		System.out.println("����° ��� "+stack.pop());
		System.out.println("�׹�° ��� "+stack.pop());
		System.out.println("�ټ���° ��� "+stack.pop());
		
	}
	
}
