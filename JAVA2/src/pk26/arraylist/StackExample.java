package pk26.arraylist;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<Coin>();
		// 4번이상 push
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(300));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(700));
		coinBox.push(new Coin(800));
		// coin이 없을 떄까지 반복하여 pop하기
		
		//while문으로 출력
		while(!coinBox.isEmpty()) {// isEmpty 주의!
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " +coin.getValue()+"원");
			
		}
		
		
	}

}
