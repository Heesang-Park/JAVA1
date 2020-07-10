package pk30.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {

	public static void main(String[] args) {
		List<String> sList=new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		// 제네릭 타입의 stream생성
		Stream<String> stream=sList.stream();
		// 람다식 사용 : 스트림을 적용하여 하나의 Element가 들어오면 출력해내는 람다식
		stream.forEach(s->System.out.print(s+" "));
		System.out.println();
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.print(s+" "));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(s->System.out.print(s+" "));
		
		
//		for(String s:sList) {
//			System.out.println(s);
//		}
		
		
	}

}
