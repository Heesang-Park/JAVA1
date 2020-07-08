package pk30;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		//Integer 반환하는 sum()이므로 int 형으로 받는다.
		int sumVal=Arrays.stream(arr).sum();// 딱 한번의 연산만 가능
		System.out.println(sumVal);
		//재사용이 안된다
		//int cnt=(int)stream.count();

		//객체화 하여 사용할 수 있음
		IntStream stream=Arrays.stream(arr);
		int s=stream.sum();
		System.out.println(s);
		
			
	}

}
