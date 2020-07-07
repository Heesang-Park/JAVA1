package pk26.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet= new HashSet<String>();
		
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현경"));
		hashSet.add(new String("홍연희"));
//		hashSet.add(new String("강감찬"));
//		hashSet.add(new String("강감찬"));
		
		boolean b1=hashSet.add("강감찬");
		System.out.println(b1);
		
		boolean b2=hashSet.add("강감찬");
		System.out.println(b2); //equals에 들어가보니 heap메모리에 이미 자리가 있다.
								//그래서 false값이 나옴
		
		System.out.println(hashSet); // 중복제거함
		
		
	}

}
