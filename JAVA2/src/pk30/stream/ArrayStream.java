package pk30.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		int sumVal=Arrays.stream(arr).sum();
		System.out.println("arr의 합: "+sumVal);
		System.out.println("-----------------");
		
		//객체이름: list
		List<String> lamList=new ArrayList<String>();
		lamList.add("NewYouk");
		lamList.add("Vencuber");
		lamList.add("Seoul");
		Stream<String> streamLam=lamList.stream();
		streamLam.forEach(c->System.out.println(c+" "));
		System.out.println();
		lamList.stream().sorted().forEach(c->System.out.println(c+" "));
		System.out.println();
		lamList.stream().filter(c->c.length()>=6).forEach(c->System.out.println(c+" "));
		System.out.println();
		lamList.stream().map(c->c.length()).forEach(c->System.out.println(c+" "));
		
		// 객체이름: list
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int sum2=list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println("ArrayList의 합계: "+sum2);
	}

}
