package pk30.reduce;

import java.util.Arrays;

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings= {"안녕하세요~~~","Hello","Good morning","반갑습니다^^"};
		// 사용자 구현실습
		// reduce의 문법(초기값,매개변수,실행부)
//		reduce("",(s1,s2)->
//		{if(s1.getBytes().length >=s2.getBytes().length) 
//			return s1;
//		else return s2;}));
		
		// Stream에 적용
//		Arrays.stream(greetings).reduce("",(s1,s2)->
//		{if(s1.getBytes().length >=s2.getBytes().length) 
//			return s1;
//		else return s2;});
		
		//결과 출력
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
		{if(s1.getBytes().length >= s2.getBytes().length) 
			return s1;
		else return s2;}));
		
//------------------------------------------------------		
		// BinaryOperator를 구현한 클래스 이용 실습
		// 클래스를 이용할 때는 초기값1은 생략된다
		String str=Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
		
		
		
	}

}
